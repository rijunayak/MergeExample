//An InputParser takes an input and returns a menu item
package com.twu.biblioteca;

public class InputParser {

    private String input;

    public InputParser(String input) {
        this.input = input;
    }

    public MenuItem parseInput(BookList bookList) {
        MenuItem menuItem = new InvalidMenuItem();
        if(input.equals("1")) {
            menuItem = new ListBooksMenuItem(bookList);
        }
        return menuItem;
    }
}
