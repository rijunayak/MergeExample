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
        CheckOutBookMenuItem checkOutBookMenuItem = new CheckOutBookMenuItem(null);
        CheckInBookMenuItem checkInBookMenuItem = new CheckInBookMenuItem(null);
        CheckOutMovieMenuItem checkOutMovieMenuItem = new CheckOutMovieMenuItem(null);
        QuitMenuItem quitMenuItem = new QuitMenuItem();
        ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>(Arrays.asList(listBooksMenuItem, listMoviesMenuItem, checkOutBookMenuItem, checkInBookMenuItem, checkOutMovieMenuItem, quitMenuItem));
        Menu menu = new Menu(menuItems);
        MenuFactory menuFactory = new MenuFactory();

        assertEquals(menu.toString(), menuFactory.getDefaultMenu().toString());
    }
}
