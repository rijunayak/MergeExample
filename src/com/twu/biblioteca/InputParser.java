//An InputParserMainMenu takes an input in main menu and returns a menu item
package com.twu.biblioteca;

public class InputParser implements Parser {

    private String input;

    public InputParser(String input) {
        this.input = input;
    }

    @Override
    public MenuItem parseMenuOptionInput(Library library) {
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
