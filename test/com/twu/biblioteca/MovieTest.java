package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTest {

    @Test
    public void shouldRightlyConvertToStringForValidRating() {
        Movie movie = new Movie("Three Little Pigs", 1933, "Burt Gillett", "1");

        assertEquals(String.format("%40s%40d%40s%40s", "Three Little Pigs", 1933, "Burt Gillett", "1"), movie.toString());
    }

    @Test
    public void shouldRightlyConvertToStringWithUnratedMovieForARatingWhichIsNotANumber() {
        Movie movie = new Movie("Three Little Pigs", 1933, "Burt Gillett", "Not A Number");

        assertEquals(String.format("%40s%40d%40s%40s", "Three Little Pigs", 1933, "Burt Gillett", "unrated"), movie.toString());
    }

    @Test
    public void shouldRightlyConvertToStringWithUnratedMovieForARatingWhichIsANumberGreaterThanTen() {
        Movie movie = new Movie("Three Little Pigs", 1933, "Burt Gillett", "52");

        assertEquals(String.format("%40s%40d%40s%40s", "Three Little Pigs", 1933, "Burt Gillett", "unrated"), movie.toString());
    }

    @Test
    public void shouldRightlyConvertToStringWithUnratedMovieForARatingWhichIsANumberLessThanOne() {
        Movie movie = new Movie("Three Little Pigs", 1933, "Burt Gillett", "0");

        assertEquals(String.format("%40s%40d%40s%40s", "Three Little Pigs", 1933, "Burt Gillett", "unrated"), movie.toString());
    }
}
