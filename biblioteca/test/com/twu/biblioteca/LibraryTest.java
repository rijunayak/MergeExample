package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockingDetails;
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
        Session session = mock(Session.class);
        Library library = new Library(listOfBooks, movies, session);
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
        Session session = mock(Session.class);
        Library library = new Library(listOfBooks, movies, session);
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
    public void shouldListCheckouts() {
        Book book1 = mock(Book.class);
        Book book2 = mock(Book.class);
        Book book3 = mock(Book.class);
        ArrayList<Book> listOfBooks = new ArrayList<Book>(Arrays.asList(book1, book2, book3));
        Movie movie1 = mock(Movie.class);
        Movie movie2 = mock(Movie.class);
        Movie movie3 = mock(Movie.class);
        ArrayList<Movie> movies = new ArrayList<Movie>(Arrays.asList(movie1, movie2, movie3));
        User user1 = mock(User.class);
        User user2 = mock(User.class);
        Session session = new Session(user1);
        Library library = new Library(listOfBooks, movies, session);
        library.checkOutBook(book1);
        session.setUser(user2);
        library.checkOutBook(book2);
        String eightyDashes = "";
        for(int i = 0; i < 80; i++) {
            eightyDashes += "-";
        }

        when(book1.getTitle()).thenReturn("Book1");
        when(book2.getTitle()).thenReturn("Book2");
        when(user1.getUserId()).thenReturn("User1");
        when(user2.getUserId()).thenReturn("User2");

        assertEquals(String.format("\n%40s%40s\n", "Checked out Book", "Library Number") +
                eightyDashes + "\n" +
                String.format("%40s%40s\n", book1.getTitle(), user1.getUserId()) +
                String.format("%40s%40s\n", book2.getTitle(), user2.getUserId()), library.listCheckouts());
    }

    @Test
    public void shouldSuccessfullyCheckOutValidBook() {
        Book book1 = new Book("Three Little Pigs", "James Halliwell-Phillipps", 1886);
        Book book2 = new Book("Three Little Pigs", null, 0);
        ArrayList<Book> listOfBooks = new ArrayList<Book>(Arrays.asList(book1));
        Movie movie1 = mock(Movie.class);
        Movie movie2 = mock(Movie.class);
        ArrayList<Movie> movies = new ArrayList<Movie>(Arrays.asList(movie1, movie2));
        User user = mock(User.class);
        Session session = new Session(user);
        Library library = new Library(listOfBooks, movies, session);

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
        User user = mock(User.class);
        Session session = new Session(user);
        Library library = new Library(listOfBooks, movies, session);

        assertFalse(library.checkOutBook(book2));
    }

    @Test
    public void shouldSuccessfullyCheckInValidBook() {
        Book book1 = new Book("Three Little Pigs", "James Halliwell-Phillipps", 1886);
        Book book2 = new Book("Three Little Pigs", null, 0);
        ArrayList<Book> listOfBooks = new ArrayList<Book>(Arrays.asList(book1));
        Movie movie1 = mock(Movie.class);
        Movie movie2 = mock(Movie.class);
        ArrayList<Movie> movies = new ArrayList<Movie>(Arrays.asList(movie1, movie2));
        User user = mock(User.class);
        Session session = new Session(user);
        Library library = new Library(listOfBooks, movies, session);
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
        User user = mock(User.class);
        Session session = new Session(user);
        Library library = new Library(listOfBooks, movies, session);
        library.checkOutBook(book2);

        assertFalse(library.checkInBook(book3));
    }

    @Test
    public void shouldNotCheckInForInvalidBookBecauseOfDifferentSessionUser() {
        Book book1 = new Book("Three Little Pigs", "James Halliwell-Phillipps", 1886);
        Book book2 = new Book("Three Little Pigs", null, 0);
        ArrayList<Book> listOfBooks = new ArrayList<Book>(Arrays.asList(book1));
        Movie movie1 = mock(Movie.class);
        Movie movie2 = mock(Movie.class);
        ArrayList<Movie> movies = new ArrayList<Movie>(Arrays.asList(movie1, movie2));
        User user1 = mock(User.class);
        User user2 = mock(User.class);
        Session session = new Session(user1);
        Library library = new Library(listOfBooks, movies, session);
        library.checkOutBook(book2);
        session.setUser(user2);

        assertFalse(library.checkInBook(book2));
    }

    @Test
    public void shouldNotCheckInForValidBookBecauseOfSameSessionUser() {
        Book book1 = new Book("Three Little Pigs", "James Halliwell-Phillipps", 1886);
        Book book2 = new Book("Three Little Pigs", null, 0);
        ArrayList<Book> listOfBooks = new ArrayList<Book>(Arrays.asList(book1));
        Movie movie1 = mock(Movie.class);
        Movie movie2 = mock(Movie.class);
        ArrayList<Movie> movies = new ArrayList<Movie>(Arrays.asList(movie1, movie2));
        User user1 = mock(User.class);
        User user2 = mock(User.class);
        Session session = new Session(user1);
        Library library = new Library(listOfBooks, movies, session);
        library.checkOutBook(book2);
        session.setUser(user1);

        assertTrue(library.checkInBook(book2));
    }

    @Test
    public void shouldSuccessfullyCheckOutValidMovie() {
        Book book1 = mock(Book.class);
        Book book2 = mock(Book.class);
        ArrayList<Book> books = new ArrayList<Book>(Arrays.asList(book1, book2));
        Movie movie1 = new Movie("Three Little Pigs", 1933, "Burt Gillett", "1");
        Movie movie2 = new Movie("Three Little Pigs", 0, null, null);
        ArrayList<Movie> movies = new ArrayList<Movie>(Arrays.asList(movie1));
        Session session = mock(Session.class);
        Library library = new Library(books, movies, session);

        assertTrue(library.checkOutMovie(movie2));
    }

    @Test
    public void shouldNotCheckOutInvalidMovie() {
        Book book1 = mock(Book.class);
        Book book2 = mock(Book.class);
        ArrayList<Book> books = new ArrayList<Book>(Arrays.asList(book1, book2));
        Movie movie1 = new Movie("Three Little Pigs", 1933, "Burt Gillett", "1");
        Movie movie2 = new Movie("Three Little Piglets", 0, null, null);
        ArrayList<Movie> movies = new ArrayList<Movie>(Arrays.asList(movie1));
        Session session = mock(Session.class);
        Library library = new Library(books, movies, session);

        assertFalse(library.checkOutMovie(movie2));
    }
}
