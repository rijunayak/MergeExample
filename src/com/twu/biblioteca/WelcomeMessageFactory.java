//A Welcome Message Factory creates a default welcome message
package com.twu.biblioteca;

public class WelcomeMessageFactory {

    public WelcomeMessage getDefaultWelcomeMessage() {
        return new WelcomeMessage("Welcome to the Biblioteca! The Bangalore Public Library.\n");
    }
}
