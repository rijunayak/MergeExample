//A Menu facotry creates a default menu
package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;

public class MenuFactory {

    public Menu getDefaultMenu() {
        ListBooksMenuItem listBooksMenuItem = new ListBooksMenuItem(null);
        ListMoviesMenuItem listMoviesMenuItem = new ListMoviesMenuItem(null);
        CheckOutBookMenuItem checkOutBookMenuItem = new CheckOutBookMenuItem(null);
        CheckInBookMenuItem checkInBookMenuItem = new CheckInBookMenuItem(null);
        QuitMenuItem quitMenuItem = new QuitMenuItem();
        ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>(Arrays.asList(listBooksMenuItem, listMoviesMenuItem, checkOutBookMenuItem, checkInBookMenuItem, quitMenuItem));

        return new Menu(menuItems);
    }
}
