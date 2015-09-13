package com.twu.biblioteca;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

import static org.junit.Assert.assertEquals;

public class QuitMenuItemTest {

    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @Test
    public void shouldEnsureQuitMenuItemReturnsQuittingAppTheProgramOnSelection() {
        exit.expectSystemExitWithStatus(0);

        QuitMenuItem quitMenuItem = new QuitMenuItem();
        quitMenuItem.doOperation();
    }

    @Test
    public void shouldReturnQuitWhenConvertedToString() {
        QuitMenuItem quitMenuItem = new QuitMenuItem();

        assertEquals("Quit", quitMenuItem.toString());
    }
}
