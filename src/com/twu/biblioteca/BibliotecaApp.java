//The BibliotecaApp provides an entry point to start the application
package com.twu.biblioteca;

public class BibliotecaApp {

    private WelcomeMessage welcomeMessage;
    private Library library;
    private Menu menu;

    public BibliotecaApp(WelcomeMessage welcomeMessage, Library library, Menu menu) {
        this.welcomeMessage = welcomeMessage;
        this.library = library;
        this.menu = menu;
    }

    public static void main(String[] args) {
        WelcomeMessageFactory welcomeMessageFactory = new WelcomeMessageFactory();
        LibraryFactory libraryFactory = new LibraryFactory();
        MenuFactory menuFactory = new MenuFactory();
        BibliotecaApp bibliotecaApp = new BibliotecaApp(welcomeMessageFactory.getDefaultWelcomeMessage(), libraryFactory.getDefaultLibrary(), menuFactory.getDefaultMenu());
        bibliotecaApp.start();
    }

    public void start() {
        ConsoleDisplay consoleDisplayWelcomeMessage = new ConsoleDisplay(welcomeMessage);
        consoleDisplayWelcomeMessage.display();
        repeatThroughMenu();
    }

    private void repeatThroughMenu() {
        ConsoleDisplay consoleDisplayMenu = new ConsoleDisplay(menu);
        ConsoleInput consoleInput = new ConsoleInput();
        InputParser inputParser = new InputParser("");
        while(!inputParser.parseMainMenuOptionInput(library).toString().equals("Quit")) {
            consoleDisplayMenu.display();
            inputParser = new InputParser(consoleInput.getInput());
            ConsoleDisplay consoleDisplayMenuItemOperation = new ConsoleDisplay(menu.selectedMenuItem(inputParser.parseMainMenuOptionInput(library)));
            consoleDisplayMenuItemOperation.display();
        }
    }
}
