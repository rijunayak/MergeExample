package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class UserTest {

    @Test
    public void shouldAuthenticateSuccessfully() {
        User user = new User("user1", "password1");

        assertTrue(user.authenticate("password1"));
    }
}
