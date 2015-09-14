package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MenuFactoryTest {

    @Test
    public void shouldCreateADefaultMenu() {
        ListBooksMenuItem listBooksMenuItem = new ListBooksMenuItem(null);
        CheckOutBookMenuItem checkOutBookMenuItem = new CheckOutBookMenuItem(null);
        CheckInBookMenuItem checkInBookMenuItem = new CheckInBookMenuItem(null);
        QuitMenuItem quitMenuItem = new QuitMenuItem();
        ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>(Arrays.asList(listBooksMenuItem, checkOutBookMenuItem, checkInBookMenuItem, quitMenuItem));
        Menu menu = new Menu(menuItems);
        MenuFactory menuFactory = new MenuFactory();

        assertEquals(menu.toString(), menuFactory.getDefaultMenu().toString());
    }
}
