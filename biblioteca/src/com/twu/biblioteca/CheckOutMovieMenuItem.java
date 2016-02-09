//A check out movie menu item has a library from which it can check out a movie
package com.twu.biblioteca;

public class CheckOutMovieMenuItem implements MenuItem {

    private Library library;

    public CheckOutMovieMenuItem(Library library) {
        this.library = library;
    }

    @Override
    public String toString() {
        return "Checkout a Movie";
    }


    @Override
    public String doOperation() {
        String movieToCheckout = "";
        ConsoleInput consoleInput = new ConsoleInput();
        ConsoleDisplay consoleDisplay = new ConsoleDisplay("\nEnter a movie to checkout : ");
        consoleDisplay.display();
        movieToCheckout = consoleInput.getInput();
        if(!library.checkOutMovie(new Movie(movieToCheckout, 0, null, null))) {
            return "\nThat movie does not exist!\n";
        }
        return "\nThank you! Enjoy the movie.\n";
    }
}
