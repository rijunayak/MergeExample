package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class SessionTest {

    @Test
    public void shouldRightlyGetTheSessionUser() {
        User user = mock(User.class);
        Session session = new Session(user);

        assertEquals(user, session.getUser());
    }

    @Test
    public void shouldRightlySetTheSessionUser() {
        User user1 = mock(User.class);
        Session session = new Session(user1);
        User user2 = mock(User.class);

        session.setUser(user2);

        assertEquals(user2, session.getUser());
    }
}
