//A Menu facotry creates a default menu
package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;

public class MenuFactory {

    public Menu getDefaultMenu() {
        LibraryFactory libraryFactory = new LibraryFactory();
        Library defaultLibrary = libraryFactory.getDefaultLibrary();
        ListBooksMenuItem listBooksMenuItem = new ListBooksMenuItem(defaultLibrary);
        CheckOutBookMenuItem checkOutBookMenuItem = new CheckOutBookMenuItem(defaultLibrary);
        CheckInBookMenuItem checkInBookMenuItem = new CheckInBookMenuItem(defaultLibrary);
        QuitMenuItem quitMenuItem = new QuitMenuItem();
        ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>(Arrays.asList(listBooksMenuItem, checkOutBookMenuItem, checkInBookMenuItem, quitMenuItem));

        return new Menu(menuItems);
    }
}
