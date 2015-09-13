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
        Library library = new Library(books);
        LibraryFactory libraryFactory = new LibraryFactory();

        assertEquals(library.toString(), libraryFactory.getDefaultLibrary().toString());
    }
}
