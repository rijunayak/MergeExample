//A list movies menu item has a library returns the list of movies on selection
package com.twu.biblioteca;

public class ListMoviesMenuItem implements MenuItem {

    private Library library;

    public ListMoviesMenuItem(Library library) {
        this.library = library;
    }

    @Override
    public String toString() {
        return "List all Movies";
    }


    @Override
    public String doOperation() {
        return library.listMovies();
    }
}
