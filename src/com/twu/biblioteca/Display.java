//Display displays a welcome message to the screen
package com.twu.biblioteca;

public class Display {
    private String welcomeMessage;

    public Display(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    public void displayWelcomeMessage() {
        System.out.println(this.welcomeMessage);
    }
}
