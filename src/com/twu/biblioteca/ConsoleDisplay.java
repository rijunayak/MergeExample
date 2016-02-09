//A Console Display has a string which it can display on the console
package com.twu.biblioteca;

public class ConsoleDisplay implements Display {

    private Object displayable;

    public ConsoleDisplay(Object displayable) {
        this.displayable = displayable;
    }

    @Override
    public void display() {
        System.out.println(displayable);
    }
}
