//A Welcome Message has a welcome message which it can convert to a String
package com.twu.biblioteca;

public class WelcomeMessage {
    private String welcomeMessage;

    public WelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    @Override
    public String toString() {
        return welcomeMessage;
    }
}
