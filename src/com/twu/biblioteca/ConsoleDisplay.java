//A Console Display has a string which it can display on the console
package com.twu.biblioteca;

public class ConsoleDisplay implements Display {

    private String stringToDisplay;

    public ConsoleDisplay(String stringToDisplay) {
        this.stringToDisplay = stringToDisplay;
    }

    @Override
    public void display() {
        System.out.println(stringToDisplay);
    }
}
