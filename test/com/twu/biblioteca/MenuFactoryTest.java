package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MenuFactoryTest {

    @Test
    public void shouldCreateADefaultMenu() {
        LibraryFactory libraryFactory = new LibraryFactory();
        Library defaultLibrary = libraryFactory.getDefaultLibrary();
        ListBooksMenuItem listBooksMenuItem = new ListBooksMenuItem(defaultLibrary);
        CheckOutBookMenuItem checkOutBookMenuItem = new CheckOutBookMenuItem(defaultLibrary);
        CheckInBookMenuItem checkInBookMenuItem = new CheckInBookMenuItem(defaultLibrary);
        QuitMenuItem quitMenuItem = new QuitMenuItem();
        ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>(Arrays.asList(listBooksMenuItem, checkOutBookMenuItem, checkInBookMenuItem, quitMenuItem));
        Menu menu = new Menu(menuItems);
        MenuFactory menuFactory = new MenuFactory();

        assertEquals(menu.toString(), menuFactory.getDefaultMenu().toString());
    }
}
