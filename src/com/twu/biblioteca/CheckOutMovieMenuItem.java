//A check out movie menu item has a library from which it can check out a movie
package com.twu.biblioteca;

public class CheckOutMovieMenuItem {

    private Library library;

    public CheckOutMovieMenuItem(Library library) {
        this.library = library;
    }

    @Override
    public String toString() {
        return "Checkout a Movie";
    }
}
