package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void specDisplayingABook() {
        Book book = new Book("Three Little Pigs", "James Halliwell-Phillipps", 1886);

        assertEquals(String.format("%23s%23s%23d", "Three Little Pigs", "James Halliwell-Phillipps", 1886), book.toString());
    }
}
