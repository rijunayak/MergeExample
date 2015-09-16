//An Input Parser Librarian User Menu parses a command for a librarian user menu
package com.twu.biblioteca;

public class InputParserLibrarianUserMenu implements Parser {

    private String input;

    public InputParserLibrarianUserMenu(String input) {
        this.input = input;
    }

    @Override
    public MenuItem parseMenuOptionInput(Library library, Session session) {
        MenuItem menuItem = new InvalidMenuItem();
        if(input.equals("1")) {
            menuItem = new ListBooksMenuItem(library);
        } else if(input.equals("2")) {
            menuItem = new ListMoviesMenuItem(library);
        } else if(input.equals("3")) {
            menuItem = new CheckOutMovieMenuItem(library);
        } else if(input.equals("4")) {
            menuItem = new CheckOutBookMenuItem(library);
        } else if(input.equals("5")) {
            menuItem = new CheckInBookMenuItem(library);
        } else if(input.equals("6")) {
            menuItem = new ListCheckOutsMenuItem(library);
        } else if(input.equals("7")) {
            menuItem = new LogoutMenuItem(session);
        }
        return menuItem;
    }
}
