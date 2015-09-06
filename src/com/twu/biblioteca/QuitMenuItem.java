//Quit Menu Item Exits the program on selection
package com.twu.biblioteca;

public class QuitMenuItem implements MenuItem {

    @Override
    public String doOperation() {
        return "Quitting App";
    }

    @Override
    public String toString() {
        return "Quit";
    }
}
