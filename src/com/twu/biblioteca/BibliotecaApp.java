//The BibliotecaApp provides an entry point to start the application
package com.twu.biblioteca;

public class BibliotecaApp {

    public void start() {
        WelcomeMessage welcomeMessage = new WelcomeMessage("Welcome to Bangalore Public Library");
        welcomeMessage.display();
        System.out.println();
    }

    public static void main(String[] args) {
    }
}
