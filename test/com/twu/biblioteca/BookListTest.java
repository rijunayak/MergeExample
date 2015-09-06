package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class BookListTest {

    @Test
    public void shouldDisplayWelcomeMessageOfDisplay() {
        Book book1 = mock(Book.class);
        Book book2 = mock(Book.class);
        Book book3 = mock(Book.class);
        ArrayList<Book> listOfBooks = new ArrayList<Book>(Arrays.asList(book1, book2, book3));
        BookList bookList = new BookList(listOfBooks);
        String sixtyNineDashes = "";
        for(int i = 0; i < 69; i++) {
            sixtyNineDashes += "-";
        }

        when(book1.toString()).thenReturn(String.format("%23s%23s%23d", "Three Little Pigs", "James Halliwell-Phillipps", 1886));
        when(book2.toString()).thenReturn(String.format("%23s%23s%23d", "Clifford, The Big Red Dog", "Norman Bridwell", 1963));
        when(book3.toString()).thenReturn(String.format("%23s%23s%23d", "Cinderella", "Giambattista Basile", 1634));



        assertEquals(String.format("%23s%23s%23s\n", "Title", "Author", "Year Of Publication") +
                sixtyNineDashes + "\n" +
                book1.toString() + "\n" +
                book2.toString() + "\n" +
                book3.toString() + "\n", bookList.toString());
    }
}
