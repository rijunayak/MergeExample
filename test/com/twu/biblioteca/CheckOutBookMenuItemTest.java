package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class CheckOutBookMenuItemTest {

    @Test
    public void shouldReturnMenuItemNameInMainMenu() {
        BookList bookList = mock(BookList.class);
        CheckOutBookMenuItem checkOutBookMenuItem = new CheckOutBookMenuItem(bookList);

        assertEquals("Checkout a Book", checkOutBookMenuItem.toString());
    }
}
