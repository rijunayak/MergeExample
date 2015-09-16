package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AuthenticatorTest {

    @Test
    public void shouldAuthenticateOnCorrectUserIdPasswordPair() {
        Authenticator authenticator = new Authenticator();
        User user1 = new User("user1", "password1", "user");

        assertEquals(user1, authenticator.authenticate("user1", "password1"));
    }

    @Test
    public void shouldNotAuthenticateOnIncorrectUserIdPasswordPair() {
        Authenticator authenticator = new Authenticator();
        User undefinedUser = new User("000-0000", "password", "undefined");

        assertEquals(undefinedUser, authenticator.authenticate("user1", "password2"));
    }
}
