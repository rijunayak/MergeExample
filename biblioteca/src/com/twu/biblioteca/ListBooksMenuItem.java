//A list books menu item has a bookList returns the list of books on selection
package com.twu.biblioteca;

public class ListBooksMenuItem implements MenuItem {

    private Library library;

    public ListBooksMenuItem(Library library) {
        this.library = library;
    }

    @Override
    public String doOperation() {
        return library.listAvailableBooks();
    }

    @Override
    public String toString() {
        return "List all Books";
    }
}
