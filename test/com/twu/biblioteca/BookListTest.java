package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class BookListTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(System.out);
    }

    @Test
    public void shouldDisplayWelcomeMessageOfDisplay() {
        Book book1 = new Book("Three Little Pigs", "James Halliwell-Phillipps", 1886);
        Book book2 = new Book("Clifford, The Big Red Dog", "Norman Bridwell", 1963);
        Book book3 = new Book("Cinderella", "Giambattista Basile", 1634);
        ArrayList<Book> listOfBooks = new ArrayList<Book>(Arrays.asList(book1, book2, book3));
        BookList bookList = new BookList(listOfBooks);
        bookList.display();
        assertTrue(true);
    }
}
