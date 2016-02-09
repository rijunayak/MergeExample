//A Main Menu has a list of menu items which it can return as a string and activate the item on selection
package com.twu.biblioteca;

import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> menuItems;

    public Menu(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public String toString() {
        String mainMenu = "";
        for(int i = 0; i < menuItems.size(); i++) {
            mainMenu += Integer.toString(i + 1) + ". " + menuItems.get(i).toString() + "\n";
        }
        mainMenu += "Enter an option : ";
        return mainMenu;
    }

    public String selectedMenuItem(MenuItem menuItem) {
        return menuItem.doOperation();
    }
}
