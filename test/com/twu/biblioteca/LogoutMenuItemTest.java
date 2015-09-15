package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class LogoutMenuItemTest {

    @Test
    public void shouldReturnItsMenuEntry() {
        Session session = mock(Session.class);
        LogoutMenuItem logoutMenuItem = new LogoutMenuItem(session);

        assertEquals("Logout", logoutMenuItem.toString());
    }
}
