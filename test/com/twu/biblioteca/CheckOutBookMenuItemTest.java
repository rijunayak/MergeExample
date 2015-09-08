package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

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
        CheckOutBookMenuItem checkOutBookMenuItem = new CheckOutBookMenuItem(bookList);

        assertEquals("Book To Checkout", checkOutBookMenuItem.doOperation());
    }
}
