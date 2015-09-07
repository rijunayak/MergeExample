package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListBooksMenuItemTest {

    @Test
    public void shoudldReturnMenuItem() {
        BookList bookList = mock(BookList.class);
        ListBooksMenuItem listBooksMenuItem = new ListBooksMenuItem(bookList);

        assertEquals("List all Books", listBooksMenuItem.toString());
    }

    @Test
    public void shouldReturnTheListOfBooks() {
        BookList bookList = mock(BookList.class);
        ListBooksMenuItem listBooksMenuItem = new ListBooksMenuItem(bookList);
        String oneTwentyDashes = "";
        for(int i = 0; i < 120; i++) {
            oneTwentyDashes += "-";
        }

        when(bookList.toString()).thenReturn(
                String.format("%23s%23s%23s\n", "Title", "Author", "Year Of Publication") +
                        oneTwentyDashes + "\n" +
                        String.format("%23s%23s%23d", "Three Little Pigs", "James Halliwell-Phillipps", 1886) + "\n" +
                        String.format("%23s%23s%23d", "Clifford, The Big Red Dog", "Norman Bridwell", 1963) + "\n" +
                        String.format("%23s%23s%23d", "Cinderella", "Giambattista Basile", 1634) + "\n"
        );

        assertEquals(bookList.toString(), listBooksMenuItem.doOperation());
    }
}
