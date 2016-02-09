package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.mock;

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

    @Test
    public void shouldReturnFalseOnComparingWithNullObject() {
        Movie movie = new Movie("Three Little Pigs", 1933, "Burt Gillett", "1");

        assertNotEquals(movie, null);
    }

    @Test
    public void shouldReturnFalseOnComparingWithNullName() {
        Movie movie1 = new Movie("Three Little Pigs", 1933, "Burt Gillett", "1");
        Movie movie2 = new Movie(null, 1933, "Burt Gillett", "1");

        assertNotEquals(movie1, movie2);
    }

    @Test
    public void shouldReturnFalseWhenComparedWithDifferentClass() {
        Movie movie = new Movie("Three Little Pigs", 1933, "Burt Gillett", "1");
        Library library = mock(Library.class);

        assertNotEquals(movie, library);
    }

    @Test
    public void shouldReturnTrueOnComparingWithItself() {
        Movie movie = new Movie("Three Little Pigs", 1933, "Burt Gillett", "1");

        assertEquals(movie, movie);
    }

    @Test
    public void shouldReturnFalseIfComparingMovieIsNull() {
        Movie movie1 = new Movie(null, 1933, "Burt Gillett", "1");
        Movie movie2 = new Movie("Three Little Pigs", 1933, "Burt Gillett", "1");

        assertNotEquals(movie1, movie2);
    }

    @Test
    public void shouldReturnTrueOnComparingBookWithSameNameOnly() {
        Movie movie1 = new Movie("Three Little Pigs", 1933, "Burt Gillett", "1");
        Movie movie2 = new Movie("Three Little Pigs", 0, null, null);

        assertEquals(movie1, movie2);
    }

    @Test
    public void shouldReturnFalseOnComparingDifferentMovie() {
        Movie movie1 = new Movie("Three Little Pigs", 1933, "Burt Gillett", "1");
        Movie movie2 = new Movie("Clifford, The Big Red Dog", 2000, "John Over", "1");

        assertNotEquals(movie1, movie2);
    }

    @Test
    public void shouldReturnZeroOnComparingHashCodeWithNullName() {
        Movie movie = new Movie(null, 1933, "Burt Gillett", "1");

        assertEquals(0, movie.hashCode());
    }

    @Test
    public void shouldHaveSameHashCodeForSameNames() {
        Movie movie1 = new Movie("Three Little Pigs", 1933, "Burt Gillett", "1");
        Movie movie2 = new Movie("Three Little Pigs", 0, null, null);

        assertEquals(movie1.hashCode(), movie2.hashCode());
    }

    @Test
    public void shouldHaveDifferentHashCodeForDifferentNames() {
        Movie movie1 = new Movie("Three Little Pigs", 1933, "Burt Gillett", "1");
        Movie movie2 = new Movie("Clifford, The Big Red Dog", 2000, "John Over", "1");

        assertNotEquals(movie1.hashCode(), movie2.hashCode());
    }
}
