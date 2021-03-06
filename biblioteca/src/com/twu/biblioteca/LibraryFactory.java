//A Library Factory creates a default library
package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;

public class LibraryFactory {

    public Library getDefaultLibrary(Session session) {
        Book book1 = new Book("Three Little Pigs", "James Halliwell-Phillipps", 1886);
        Book book2 = new Book("Clifford, The Big Red Dog", "Norman Bridwell", 1963);
        Book book3 = new Book("Cinderella", "Giambattista Basile", 1634);
        ArrayList<Book> books = new ArrayList<Book>(Arrays.asList(book1, book2, book3));
        Movie movie1 = new Movie("Three Little Pigs", 1933, "Burt Gillett", "1");
        Movie movie2 = new Movie("Clifford, The Big Red Dog", 2000, "John Over", "1");
        Movie movie3 = new Movie("Cinderella", 1950, "Clyde Geronim", "1");
        ArrayList<Movie> movies = new ArrayList<Movie>(Arrays.asList(movie1, movie2, movie3));
        return new Library(books, movies, session);
    }
}
