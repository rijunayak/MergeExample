//Quit Menu Item Exits the program on selection
package com.twu.biblioteca;

public class QuitMenuItem implements MenuItem {

    @Override
    public String doOperation() {
        System.exit(0);
        return "";
    }

    @Override
    public String toString() {
        return "Quit";
    }
}
