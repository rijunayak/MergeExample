package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CheckOutBookMenuItemTest {

    private final ByteArrayInputStream inContent = new ByteArrayInputStream("Book To Checkout".getBytes());

    @Test
    public void shouldReturnMenuItemNameInMainMenu() {
        BookList bookList = mock(BookList.class);
        CheckOutBookMenuItem checkOutBookMenuItem = new CheckOutBookMenuItem(bookList);

        assertEquals("Checkout a Book", checkOutBookMenuItem.toString());
    }

    @Before
    public void setUpStreams() {
        System.setIn(inContent);
    }

    @After
    public void cleanUpStreams() {
        System.setIn(System.in);
    }

    @Test
    public void shouldReturnCheckedOutBook() {
        BookList bookList = mock(BookList.class);
        ArgumentCaptor<Book> argumentCaptor = ArgumentCaptor.forClass(Book.class);
        CheckOutBookMenuItem checkOutBookMenuItem = new CheckOutBookMenuItem(bookList);
        when(bookList.checkOut(argumentCaptor.capture())).thenReturn(true);

        assertEquals("Thank you! Enjoy the book.", checkOutBookMenuItem.doOperation());
    }

    @Test
    public void shouldReturnInvalidBookMessageForUnavailableBook() {
        BookList bookList = mock(BookList.class);
        ArgumentCaptor<Book> argumentCaptor = ArgumentCaptor.forClass(Book.class);
        CheckOutBookMenuItem checkOutBookMenuItem = new CheckOutBookMenuItem(bookList);
        when(bookList.checkOut(argumentCaptor.capture())).thenReturn(false);

        assertEquals("That book does not exist!", checkOutBookMenuItem.doOperation());
    }
}
