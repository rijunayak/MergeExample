package com.twu.biblioteca;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class QuitMenuItemTest {

    @Test
    public void shouldEnsureQuitMenuItemReturnsQuittingAppTheProgramOnSelection() {
        QuitMenuItem quitMenuItem = new QuitMenuItem();

        assertEquals("Quitting App", quitMenuItem.doOperation());
    }

    @Test
    public void shouldReturnQuitWhenConvertedToString() {
        QuitMenuItem quitMenuItem = new QuitMenuItem();

        assertEquals("Quit", quitMenuItem.toString());
    }
}
