//An InputParser takes an input and returns a menu item
package com.twu.biblioteca;

public class InputParser {

    private String input;

    public InputParser(String input) {
        this.input = input;
    }

    public MenuItem parseMainMenuOptionInput(Library library) {
        MenuItem menuItem = new InvalidMenuItem();
        if(input.equals("1")) {
            menuItem = new ListBooksMenuItem(library);
        } else if(input.equals("2")){
            menuItem = new ListMoviesMenuItem(library);
        } else if(input.equals("3")) {
            menuItem = new CheckOutBookMenuItem(library);
        } else if(input.equals("4")) {
            menuItem = new CheckInBookMenuItem(library);
        } else if (input.equals("5")) {
            menuItem = new CheckOutMovieMenuItem(library);
        } else if(input.equals("6")) {
            menuItem = new QuitMenuItem();
        }
        return menuItem;
    }
}
