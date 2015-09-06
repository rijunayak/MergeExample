//A Welcome Message has a welcome message which it can display
package com.twu.biblioteca;

public class WelcomeMessage implements Displayable {
    private String welcomeMessage;

    public WelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    @Override
    public String toString() {
        return welcomeMessage;
    }
}
