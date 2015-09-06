//The BibliotecaApp provides an entry point to start the application
package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        WelcomeMessage welcomeMessage = new WelcomeMessage("Welcome to Bangalore Public Library");
        ConsoleDisplay consoleDisplay1 = new ConsoleDisplay(welcomeMessage);
        consoleDisplay1.display();
    }
}
