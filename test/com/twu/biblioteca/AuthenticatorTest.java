package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AuthenticatorTest {

    @Test
    public void shouldAuthenticateOnCorrectUserIdPasswordPair() {
        Authenticator authenticator = new Authenticator();
        User user1 = new User("000-0001", "password1", "user", "name1", "email1", "phone1");

        assertEquals(user1, authenticator.authenticate("000-0001", "password1"));
    }

    @Test
    public void shouldNotAuthenticateOnIncorrectUserIdPasswordPair() {
        Authenticator authenticator = new Authenticator();
        User undefinedUser = new User("000-0000", "password", "undefined", "name1", "email1", "phone1");

        assertEquals(undefinedUser, authenticator.authenticate("000-0001", "password2"));
    }
}
