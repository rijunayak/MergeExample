package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WelcomeMessageFactoryTest {

    @Test
    public void shouldCreateDefaultWelcomeMessage() {
        WelcomeMessage welcomeMessage = new WelcomeMessage("Welcome to the Biblioteca! The Bangalore Public Library.\n");
        WelcomeMessageFactory welcomeMessageFactory = new WelcomeMessageFactory();

        assertEquals(welcomeMessage.toString(), welcomeMessageFactory.getDefaultWelcomeMessage().toString());
    }
}
