package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTest {

    @Test
    public void shouldRightlyConvertToStringForValidRating() {
        Movie movie = new Movie("Three Little Pigs", 1933, "Burt Gillett", "1");

        assertEquals(String.format("%40s%40d%40s%40s", "Three Little Pigs", 1933, "Burt Gillett", "1"), movie.toString());
    }
}
