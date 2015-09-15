package com.twu.biblioteca;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class AuthenticatorTest {

    @Test
    public void shouldAuthenticateOnCorrectUserIdPasswordPair() {
        Authenticator authenticator = new Authenticator();

        assertTrue(authenticator.authenticate("user1", "password1"));
    }

    @Test
    public void shouldNotAuthenticateOnIncorrectUserIdPasswordPair() {
        Authenticator authenticator = new Authenticator();

        assertFalse(authenticator.authenticate("user1", "password2"));
    }
}
