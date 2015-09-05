package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class BookTest {

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
    public void specDisplayingABook() {
        Book book = new Book("Three Little Pigs", "James Halliwell-Phillipps", 1886);

        book.display();

        assertEquals(String.format("%23s%23s%5d\n", "Three Little Pigs", "James Halliwell-Phillipps", 1886), outContent.toString());
    }
}
