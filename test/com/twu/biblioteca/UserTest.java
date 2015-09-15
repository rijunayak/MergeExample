package com.twu.biblioteca;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class UserTest {

    @Test
    public void shouldAuthenticateSuccessfully() {
        User user = new User("user1", "password1");

        assertTrue(user.authenticate("password1"));
    }

    @Test
    public void shouldNotAuthenticateInvalidInputPassword() {
        User user = new User("user1", "password1");

        assertFalse(user.authenticate("password2"));
    }
}
