package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LoginMenuItemTest {

    @Test
    public void shouldReturnRightEntryInItsMenu() {
        Session session = mock(Session.class);
        ConsoleInput consoleInput = mock(ConsoleInput.class);
        LoginMenuItem loginMenuItem = new LoginMenuItem(session, consoleInput);

        assertEquals("Login", loginMenuItem.toString());
    }

    @Test
    public void shouldRightlyReturnSuccessMessageOnLoginOperation() {
        Session session = mock(Session.class);
        ConsoleInput consoleInput = mock(ConsoleInput.class);
        LoginMenuItem loginMenuItem = new LoginMenuItem(session, consoleInput);

        when(consoleInput.getInput()).thenReturn("000-0001", "password1");

        assertEquals("\nLogged In!\n", loginMenuItem.doOperation());
    }

    @Test
    public void shouldRightlyReturnInvalidCredentialsMessageOnLoginOperation() {
        Session session = mock(Session.class);
        ConsoleInput consoleInput = mock(ConsoleInput.class);
        LoginMenuItem loginMenuItem = new LoginMenuItem(session, consoleInput);

        when(consoleInput.getInput()).thenReturn("000-0001", "password2");

        assertEquals("\nInvalid Credentials.\n", loginMenuItem.doOperation());
    }
}
