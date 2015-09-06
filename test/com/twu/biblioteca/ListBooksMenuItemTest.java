package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class ListBooksMenuItemTest {

    @Test
    public void shoudldDisplayMenuItem() {
        BookList bookList = mock(BookList.class);
        ListBooksMenuItem listBooksMenuItem = new ListBooksMenuItem(bookList);

        assertEquals("List all Books", listBooksMenuItem.toString());
    }
}
