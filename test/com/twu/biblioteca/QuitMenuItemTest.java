package com.twu.biblioteca;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

import static org.junit.Assert.assertEquals;

public class QuitMenuItemTest {

    @Test
    public void shouldEnsureQuitMenuItemReturnsQuittingAppTheProgramOnSelection() {
        QuitMenuItem quitMenuItem = new QuitMenuItem();

        assertEquals("", quitMenuItem.doOperation());
    }

    @Test
    public void shouldReturnQuitWhenConvertedToString() {
        QuitMenuItem quitMenuItem = new QuitMenuItem();

        assertEquals("Quit", quitMenuItem.toString());
    }
}
