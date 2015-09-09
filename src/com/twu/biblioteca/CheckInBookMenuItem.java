//A check in book menu item has a library from which it can check in a book
package com.twu.biblioteca;

public class CheckInBookMenuItem {

    private Library library;

    public CheckInBookMenuItem(Library library) {
        this.library = library;
    }

    @Override
    public String toString() {
        return "Return a book";
    }
}
