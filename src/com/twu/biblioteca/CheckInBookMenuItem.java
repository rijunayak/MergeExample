//A check in book menu item has a library from which it can check in a book
package com.twu.biblioteca;

public class CheckInBookMenuItem implements MenuItem {

    private Library library;

    public CheckInBookMenuItem(Library library) {
        this.library = library;
    }

    @Override
    public String toString() {
        return "Return a book";
    }

    @Override
    public String doOperation() {
        String bookToCheckin = "";
        ConsoleInput consoleInput = new ConsoleInput();
        ConsoleDisplay consoleDisplay = new ConsoleDisplay("\nEnter a book to return : ");
        consoleDisplay.display();
        bookToCheckin = consoleInput.getInput();

        if(!library.checkInBook(new Book(bookToCheckin, null, 0))) {
            return "\nThat is not a valid book to return.\n";
        }
        return "\nThank you for returning the book.\n";
    }
}
