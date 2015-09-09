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
        Library library = mock(Library.class);
        CheckOutBookMenuItem checkOutBookMenuItem = new CheckOutBookMenuItem(library);

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
        Library library = mock(Library.class);
        ArgumentCaptor<Book> argumentCaptor = ArgumentCaptor.forClass(Book.class);
        CheckOutBookMenuItem checkOutBookMenuItem = new CheckOutBookMenuItem(library);
        when(library.checkOut(argumentCaptor.capture())).thenReturn(true);

        assertEquals("\nThank you! Enjoy the book.\n", checkOutBookMenuItem.doOperation());
    }

    @Test
    public void shouldReturnInvalidBookMessageForUnavailableBook() {
        Library library = mock(Library.class);
        ArgumentCaptor<Book> argumentCaptor = ArgumentCaptor.forClass(Book.class);
        CheckOutBookMenuItem checkOutBookMenuItem = new CheckOutBookMenuItem(library);
        when(library.checkOut(argumentCaptor.capture())).thenReturn(false);

        assertEquals("\nThat book does not exist!\n", checkOutBookMenuItem.doOperation());
    }
}
