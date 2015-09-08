//An InputParser takes an input and returns a menu item
package com.twu.biblioteca;

public class InputParser {

    private String input;

    public InputParser(String input) {
        this.input = input;
    }

    public MenuItem parseMainMenuOptionInput(BookList bookList) {
        MenuItem menuItem = new InvalidMenuItem();
        if(input.equals("1")) {
            menuItem = new ListBooksMenuItem(bookList);
        } else if(input.equals("2")) {
            menuItem = new CheckOutBookMenuItem(bookList);
        } else if(input.equals("3")) {
            menuItem = new QuitMenuItem();
        }
        return menuItem;
    }
}
