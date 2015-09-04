package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

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
        ArrayList<String> listOfBooks= new ArrayList<String>(Arrays.asList("Three Little Pigs", "Clifford goes on a trip", "Cinderella"));
        BookList bookList = new BookList(listOfBooks);
        bookList.display();
        assertEquals("Three Little Pigs\nClifford goes on a trip\nCinderella\n", outContent.toString());
    }
}
