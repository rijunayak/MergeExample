package com.twu.biblioteca;

public class CheckOutBookMenuItem {

    private BookList bookList;

    public CheckOutBookMenuItem(BookList bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return "Checkout a Book";
    }
}
