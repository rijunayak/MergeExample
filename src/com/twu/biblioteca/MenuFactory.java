//A Menu facotry creates a default menu
package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;

public class MenuFactory {

    public Menu getDefaultMenu() {
        ListBooksMenuItem listBooksMenuItem = new ListBooksMenuItem(null);
        ListMoviesMenuItem listMoviesMenuItem = new ListMoviesMenuItem(null);
        CheckOutMovieMenuItem checkOutMovieMenuItem = new CheckOutMovieMenuItem(null);
        LoginMenuItem loginMenuItem = new LoginMenuItem(null, null);
        QuitMenuItem quitMenuItem = new QuitMenuItem();
        ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>(Arrays.asList(listBooksMenuItem, listMoviesMenuItem, checkOutMovieMenuItem, loginMenuItem, quitMenuItem));
        return new Menu(menuItems);
    }

    public Menu getNormalUserMenu() {
        ListBooksMenuItem listBooksMenuItem = new ListBooksMenuItem(null);
        ListMoviesMenuItem listMoviesMenuItem = new ListMoviesMenuItem(null);
        CheckOutMovieMenuItem checkOutMovieMenuItem = new CheckOutMovieMenuItem(null);
        CheckOutBookMenuItem checkOutBookMenuItem = new CheckOutBookMenuItem(null);
        CheckInBookMenuItem checkInBookMenuItem = new CheckInBookMenuItem(null);
        LogoutMenuItem logoutMenuItem = new LogoutMenuItem(null);
        QuitMenuItem quitMenuItem = new QuitMenuItem();
        ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>(Arrays.asList(listBooksMenuItem, listMoviesMenuItem, checkOutMovieMenuItem, checkOutBookMenuItem, checkInBookMenuItem, logoutMenuItem, quitMenuItem));
        return new Menu(menuItems);
    }
}
