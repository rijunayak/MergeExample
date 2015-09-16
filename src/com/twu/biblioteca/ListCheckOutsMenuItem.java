//Checkouts menu item has a library and shows the checkout out books against the library numbers
package com.twu.biblioteca;

public class ListCheckOutsMenuItem {

    private Library library;

    public ListCheckOutsMenuItem(Library library) {
        this.library = library;
    }

    @Override
    public String toString() {
        return "Show Book Checkouts";
    }
}
