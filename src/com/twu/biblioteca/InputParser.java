//An InputParserMainMenu takes an input in main menu and returns a menu item
package com.twu.biblioteca;

public class InputParser implements Parser {

    private String input;

    public InputParser(String input) {
        this.input = input;
    }

    @Override
    public MenuItem parseMenuOptionInput(Library library, Session session) {
        MenuItem menuItem = new InvalidMenuItem();
        if(input.equals("1")) {
            menuItem = new ListBooksMenuItem(library);
        } else if(input.equals("2")){
            menuItem = new ListMoviesMenuItem(library);
        } else if (input.equals("3")) {
            menuItem = new CheckOutMovieMenuItem(library);
        } else if(input.equals("4")) {
            ConsoleInput consoleInput = new ConsoleInput();
            menuItem = new LoginMenuItem(session, consoleInput);
        } else if (input.equals("5")) {
            menuItem = new QuitMenuItem();
        }
        return menuItem;
    }
}
