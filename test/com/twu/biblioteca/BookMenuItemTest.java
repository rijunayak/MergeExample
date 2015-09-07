package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookMenuItemTest {

    @Test
    public void shouldReturnNameInMenu() {
        Book book = mock(Book.class);
        BookMenuItem bookMenuItem = new BookMenuItem(book);

        when(book.toString()).thenReturn(String.format("%40s%40s%40d", "Three Little Pigs", "James Halliwell-Phillipps", 1886));

        assertEquals(String.format("%40s%40s%40d", "Three Little Pigs", "James Halliwell-Phillipps", 1886), bookMenuItem.toString());
    }
}
