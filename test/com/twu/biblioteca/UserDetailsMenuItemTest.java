package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UserDetailsMenuItemTest {

    @Test
    public void shouldReturnMenuItemEntry() {
        Session session = mock(Session.class);
        UserDetailsMenuItem userDetailsMenuItem = new UserDetailsMenuItem(session);

        assertEquals("User Details", userDetailsMenuItem.toString());
    }

    @Test
    public void shouldShowUserDetailsOnSelection() {
        User user = mock(User.class);
        Session session = new Session(user);
        UserDetailsMenuItem userDetailsMenuItem = new UserDetailsMenuItem(session);

        when(user.userDetails()).thenReturn("User Details");

        assertEquals("User Details", userDetailsMenuItem.doOperation());
    }
}
