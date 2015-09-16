package com.twu.biblioteca;

public class InputParserNormalUserMenu implements Parser {

    private String input;

    public InputParserNormalUserMenu(String input) {
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
        }
        return menuItem;
    }
}
