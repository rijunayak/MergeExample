package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MainMenuTest {

    @Test
    public void shouldDiplayMainMenu() {
        MenuItem menuItem1 = mock(MenuItem.class);
        MenuItem menuItem2 = mock(MenuItem.class);
        ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>(Arrays.asList(menuItem1, menuItem2));
        MainMenu mainMenu = new MainMenu(menuItems);

        when(menuItem1.toString()).thenReturn("Option 1");
        when(menuItem2.toString()).thenReturn("Option 2");

        assertEquals("1. Option 1\n2. Option 2\n", mainMenu.toString());
    }

    @Test
    public void shouldReturnRightStringOnMenuSelection() {
        MenuItem menuItem1 = mock(MenuItem.class);
        MenuItem menuItem2 = mock(MenuItem.class);
        ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>(Arrays.asList(menuItem1, menuItem2));
        MainMenu mainMenu = new MainMenu(menuItems);

        when(menuItem2.doOperation()).thenReturn("Option 2 Selected.");

        assertEquals("Option 2 Selected.", mainMenu.selectedMenuItem(menuItem2));
    }
}
