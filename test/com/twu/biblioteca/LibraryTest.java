package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LibraryTest {

    @Test
    public void shouldDisplayAvailableListOfBooks() {
        Book book1 = mock(Book.class);
        Book book2 = mock(Book.class);
        Book book3 = mock(Book.class);
        ArrayList<Book> listOfBooks = new ArrayList<Book>(Arrays.asList(book1, book2, book3));
        Movie movie1 = mock(Movie.class);
        Movie movie2 = mock(Movie.class);
        Movie movie3 = mock(Movie.class);
        ArrayList<Movie> movies = new ArrayList<Movie>(Arrays.asList(movie1, movie2, movie3));
        Library library = new Library(listOfBooks, movies);
        String oneTwentyDashes = "";
        for(int i = 0; i < 120; i++) {
            oneTwentyDashes += "-";
        }

        when(book1.toString()).thenReturn(String.format("%40s%40s%40d", "Three Little Pigs", "James Halliwell-Phillipps", 1886));
        when(book2.toString()).thenReturn(String.format("%40s%40s%40d", "Clifford, The Big Red Dog", "Norman Bridwell", 1963));
        when(book3.toString()).thenReturn(String.format("%40s%40s%40d", "Cinderella", "Giambattista Basile", 1634));

        assertEquals(String.format("\n%40s%40s%40s\n", "Title", "Author", "Year Of Publication") +
                oneTwentyDashes + "\n" +
                book1.toString() + "\n" +
                book2.toString() + "\n" +
                book3.toString() + "\n", library.listAvailableBooks());
    }

    @Test
    public void shouldDisplayMovies() {
        Book book1 = mock(Book.class);
        Book book2 = mock(Book.class);
        Book book3 = mock(Book.class);
        ArrayList<Book> listOfBooks = new ArrayList<Book>(Arrays.asList(book1, book2, book3));
        Movie movie1 = mock(Movie.class);
        Movie movie2 = mock(Movie.class);
        Movie movie3 = mock(Movie.class);
        ArrayList<Movie> movies = new ArrayList<Movie>(Arrays.asList(movie1, movie2, movie3));
        Library library = new Library(listOfBooks, movies);
        String oneSixtyDashes = "";
        for(int i = 0; i < 160; i++) {
            oneSixtyDashes += "-";
        }

        when(movie1.toString()).thenReturn(String.format("%40s%40d%40s%40s", "Three Little Pigs", 1933, "Burt Gillett", "1"));
        when(movie2.toString()).thenReturn(String.format("%40s%40d%40s%40s", "Clifford, The Big Red Dog", 2000, "John Over", "1"));
        when(movie3.toString()).thenReturn(String.format("%40s%40d%40s%40s", "Cinderella", 1950, "Clyde Geronim", "1"));

        assertEquals(String.format("\n%40s%40s%40s%40s\n", "Name", "Year Of Release", "Director", "Rating") +
                oneSixtyDashes + "\n" +
                movie1.toString() + "\n" +
                movie2.toString() + "\n" +
                movie3.toString() + "\n", library.listMovies());
    }

    @Test
    public void shouldSuccessfullyCheckOut() {
        Book book1 = new Book("Three Little Pigs", "James Halliwell-Phillipps", 1886);
        Book book2 = new Book("Three Little Pigs", null, 0);
        ArrayList<Book> listOfBooks = new ArrayList<Book>(Arrays.asList(book1));
        Movie movie1 = mock(Movie.class);
        Movie movie2 = mock(Movie.class);
        ArrayList<Movie> movies = new ArrayList<Movie>(Arrays.asList(movie1, movie2));
        Library library = new Library(listOfBooks, movies);

        assertTrue(library.checkOutBook(book2));
    }

    @Test
    public void shouldNotCheckOutForInvalidBook() {
        Book book1 = new Book("Three Little Pigs", "James Halliwell-Phillipps", 1886);
        Book book2 = new Book("Three Little Piglets", null, 0);
        ArrayList<Book> listOfBooks = new ArrayList<Book>(Arrays.asList(book1));
        Movie movie1 = mock(Movie.class);
        Movie movie2 = mock(Movie.class);
        ArrayList<Movie> movies = new ArrayList<Movie>(Arrays.asList(movie1, movie2));
        Library library = new Library(listOfBooks, movies);

        assertFalse(library.checkOutBook(book2));
    }

    @Test
    public void shouldSuccessfullyCheckIn() {
        Book book1 = new Book("Three Little Pigs", "James Halliwell-Phillipps", 1886);
        Book book2 = new Book("Three Little Pigs", null, 0);
        ArrayList<Book> listOfBooks = new ArrayList<Book>(Arrays.asList(book1));
        Movie movie1 = mock(Movie.class);
        Movie movie2 = mock(Movie.class);
        ArrayList<Movie> movies = new ArrayList<Movie>(Arrays.asList(movie1, movie2));
        Library library = new Library(listOfBooks, movies);
        library.checkOutBook(book2);

        assertTrue(library.checkInBook(book2));
    }

    @Test
    public void shouldNotCheckInForInvalidBook() {
        Book book1 = new Book("Three Little Pigs", "James Halliwell-Phillipps", 1886);
        Book book2 = new Book("Three Little Pigs", null, 0);
        Book book3 = new Book("Three Little Piglets", null, 0);
        ArrayList<Book> listOfBooks = new ArrayList<Book>(Arrays.asList(book1));
        Movie movie1 = mock(Movie.class);
        Movie movie2 = mock(Movie.class);
        ArrayList<Movie> movies = new ArrayList<Movie>(Arrays.asList(movie1, movie2));
        Library library = new Library(listOfBooks, movies);
        library.checkOutBook(book2);

        assertFalse(library.checkInBook(book3));
    }
}
