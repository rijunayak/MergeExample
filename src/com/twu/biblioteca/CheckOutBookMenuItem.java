package com.twu.biblioteca;

public class CheckOutBookMenuItem implements MenuItem {

    private BookList bookList;

    public CheckOutBookMenuItem(BookList bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return "Checkout a Book";
    }

    @Override
    public String doOperation() {
        String bookToCheckout = "";
        ConsoleInput consoleInput = new ConsoleInput();
        ConsoleDisplay consoleDisplay = new ConsoleDisplay("Enter a book checkout : ");
        consoleDisplay.display();
        bookToCheckout = consoleInput.getInput();
        bookList.checkOut(new Book(bookToCheckout, null, 0));
        return bookToCheckout;
    }
}
