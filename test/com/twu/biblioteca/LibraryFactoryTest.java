package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class LibraryFactoryTest {

    @Test
    public void shouldEnsureDefaultLibraryIsCreated() {
        Book book1 = new Book("Three Little Pigs", "James Halliwell-Phillipps", 1886);
        Book book2 = new Book("Clifford, The Big Red Dog", "Norman Bridwell", 1963);
        Book book3 = new Book("Cinderella", "Giambattista Basile", 1634);
        ArrayList<Book> books = new ArrayList<Book>(Arrays.asList(book1, book2, book3));
        Movie movie1 = new Movie("Three Little Pigs", 1933, "Burt Gillett", "1");
        Movie movie2 = new Movie("Clifford, The Big Red Dog", 2000, "John Over", "1");
        Movie movie3 = new Movie("Cinderella", 1950, "Clyde Geronim", "1");
        ArrayList<Movie> movies = new ArrayList<Movie>(Arrays.asList(movie1, movie2, movie3));
        Library library = new Library(books, movies);
        LibraryFactory libraryFactory = new LibraryFactory();

        assertEquals(library.listAvailableBooks() + library.listMovies(), libraryFactory.getDefaultLibrary().listAvailableBooks() + libraryFactory.getDefaultLibrary().listMovies());
    }
}
