package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MenuFactoryTest {

    @Test
    public void shouldCreateADefaultMenu() {
        ListBooksMenuItem listBooksMenuItem = new ListBooksMenuItem(null);
        ListMoviesMenuItem listMoviesMenuItem = new ListMoviesMenuItem(null);
        CheckOutMovieMenuItem checkOutMovieMenuItem = new CheckOutMovieMenuItem(null);
        LoginMenuItem loginMenuItem = new LoginMenuItem(null, null);
        QuitMenuItem quitMenuItem = new QuitMenuItem();
        ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>(Arrays.asList(listBooksMenuItem, listMoviesMenuItem, checkOutMovieMenuItem, loginMenuItem, quitMenuItem));
        Menu menu = new Menu(menuItems);
        MenuFactory menuFactory = new MenuFactory();

        assertEquals(menu.toString(), menuFactory.getDefaultMenu().toString());
    }

    @Test
    public void shouldCreateANormalUserMenu() {
        ListBooksMenuItem listBooksMenuItem = new ListBooksMenuItem(null);
        ListMoviesMenuItem listMoviesMenuItem = new ListMoviesMenuItem(null);
        CheckOutMovieMenuItem checkOutMovieMenuItem = new CheckOutMovieMenuItem(null);
        CheckOutBookMenuItem checkOutBookMenuItem = new CheckOutBookMenuItem(null);
        CheckInBookMenuItem checkInBookMenuItem = new CheckInBookMenuItem(null);
        LogoutMenuItem logoutMenuItem = new LogoutMenuItem(null);
        QuitMenuItem quitMenuItem = new QuitMenuItem();
        ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>(Arrays.asList(listBooksMenuItem, listMoviesMenuItem, checkOutMovieMenuItem, checkOutBookMenuItem, checkInBookMenuItem, logoutMenuItem, quitMenuItem));
        Menu menu = new Menu(menuItems);
        MenuFactory menuFactory = new MenuFactory();

        assertEquals(menu.toString(), menuFactory.getNormalUserMenu().toString());
    }

    @Test
    public void shouldCreateALibrarianUserMenu() {
        ListBooksMenuItem listBooksMenuItem = new ListBooksMenuItem(null);
        ListMoviesMenuItem listMoviesMenuItem = new ListMoviesMenuItem(null);
        CheckOutMovieMenuItem checkOutMovieMenuItem = new CheckOutMovieMenuItem(null);
        CheckOutBookMenuItem checkOutBookMenuItem = new CheckOutBookMenuItem(null);
        CheckInBookMenuItem checkInBookMenuItem = new CheckInBookMenuItem(null);
        ListCheckOutsMenuItem listCheckOutsMenuItem = new ListCheckOutsMenuItem(null);
        LogoutMenuItem logoutMenuItem = new LogoutMenuItem(null);
        QuitMenuItem quitMenuItem = new QuitMenuItem();
        ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>(Arrays.asList(listBooksMenuItem, listMoviesMenuItem, checkOutMovieMenuItem, checkOutBookMenuItem, checkInBookMenuItem, listCheckOutsMenuItem, logoutMenuItem, quitMenuItem));
        Menu menu = new Menu(menuItems);
        MenuFactory menuFactory = new MenuFactory();

        assertEquals(menu.toString(), menuFactory.getLibrarianUserMenu().toString());
    }
}
