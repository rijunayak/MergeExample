//A check out book menu item has a library from which it can check out a book
package com.twu.biblioteca;

public class CheckOutBookMenuItem implements MenuItem {

    private Library library;

    public CheckOutBookMenuItem(Library library) {
        this.library = library;
    }

    @Override
    public String toString() {
        return "Checkout a Book";
    }

    @Override
    public String doOperation() {
        String bookToCheckout = "";
        ConsoleInput consoleInput = new ConsoleInput();
        ConsoleDisplay consoleDisplay = new ConsoleDisplay("\nEnter a book checkout : ");
        consoleDisplay.display();
        bookToCheckout = consoleInput.getInput();
        if(!library.checkOut(new Book(bookToCheckout, null, 0))) {
            return "\nThat book does not exist!\n";
        }
        return "\nThank you! Enjoy the book.\n";
    }
}
