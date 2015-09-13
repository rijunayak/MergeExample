//A Library Factory creates a default library
package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;

public class LibraryFactory {

    public Library getDefaultLibrary() {
        Book book1 = new Book("Three Little Pigs", "James Halliwell-Phillipps", 1886);
        Book book2 = new Book("Clifford, The Big Red Dog", "Norman Bridwell", 1963);
        Book book3 = new Book("Cinderella", "Giambattista Basile", 1634);
        ArrayList<Book> books = new ArrayList<Book>(Arrays.asList(book1, book2, book3));
        return new Library(books);
    }
}
