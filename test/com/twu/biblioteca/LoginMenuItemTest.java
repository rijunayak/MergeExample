package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class LoginMenuItemTest {

    @Test
    public void LoginMenuItemShouldReturnRightEntryInItsMenu() {
        Session session = mock(Session.class);
        LoginMenuItem loginMenuItem = new LoginMenuItem(session);

        assertEquals("Login", loginMenuItem.toString());
    }
}
