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
        CheckOutMovieMenuItem checkOutMovieMenuItem = new CheckOutMovieMenuItem(null);
        QuitMenuItem quitMenuItem = new QuitMenuItem();
        ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>(Arrays.asList(listBooksMenuItem, listMoviesMenuItem, checkOutBookMenuItem, checkInBookMenuItem, checkOutMovieMenuItem, quitMenuItem));

        return new Menu(menuItems);
    }
}
