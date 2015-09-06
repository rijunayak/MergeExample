//A Console Display has a string which it can display on the console
package com.twu.biblioteca;

public class ConsoleDisplay implements Display {

    private Displayable displayable;

    public ConsoleDisplay(Displayable displayable) {
        this.displayable = displayable;
    }

    @Override
    public void display() {
        System.out.println(displayable);
    }
}
