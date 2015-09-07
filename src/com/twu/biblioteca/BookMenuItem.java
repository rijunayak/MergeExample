//A book menu item has a book which it returns as its name with a checkout message when selected
package com.twu.biblioteca;

public class BookMenuItem implements MenuItem {

    private Book book;

    public BookMenuItem(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return book.toString();
    }

    @Override
    public String doOperation() {
        return book.toString() + " has been checked out";
    }
}
