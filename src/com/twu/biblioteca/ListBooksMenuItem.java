//A list books menu item has a bookList returns the list of books on selection
package com.twu.biblioteca;

public class ListBooksMenuItem implements MenuItem {

    private BookList bookList;

    public ListBooksMenuItem(BookList bookList) {
        this.bookList = bookList;
    }

    @Override
    public String doOperation() {
        return null;
    }

    @Override
    public String toString() {
        return "List all Books";
    }
}
