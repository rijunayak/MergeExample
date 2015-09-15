package com.twu.biblioteca;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class SessionTest {

    @Test
    public void shouldRightlyGetTheSessionUser() {
        User user = mock(User.class);
        Session session = new Session(user);

        assertEquals(user, session.getUser());
    }
}
