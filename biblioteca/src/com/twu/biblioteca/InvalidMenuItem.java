//An Invalid Menu Item returns a string showing invalid command
package com.twu.biblioteca;

public class InvalidMenuItem implements MenuItem {

    @Override
    public String doOperation() {
        return "\nSelect a valid option!\n";
    }
}
