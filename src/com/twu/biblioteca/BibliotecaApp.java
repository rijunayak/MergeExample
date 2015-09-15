//The BibliotecaApp provides an entry point to start the application
package com.twu.biblioteca;

public class BibliotecaApp {

    private WelcomeMessage welcomeMessage;
    private Library library;
    private Menu menu;
    private Session session;
    private Parser parser;

    public BibliotecaApp(WelcomeMessage welcomeMessage, Library library, Menu menu, Session session, Parser parser) {
        this.welcomeMessage = welcomeMessage;
        this.library = library;
        this.menu = menu;
        this.session = session;
        this.parser = parser;
    }

    public static void main(String[] args) {
        WelcomeMessageFactory welcomeMessageFactory = new WelcomeMessageFactory();
        LibraryFactory libraryFactory = new LibraryFactory();
        MenuFactory menuFactory = new MenuFactory();
        BibliotecaApp bibliotecaApp = new BibliotecaApp(welcomeMessageFactory.getDefaultWelcomeMessage(), libraryFactory.getDefaultLibrary(), menuFactory.getDefaultMenu(), new Session(null), new InputParser(""));
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

        while(true) {
            consoleDisplayMenu.display();
            InputParser inputParser = new InputParser(consoleInput.getInput());
            ConsoleDisplay consoleDisplayMenuItemOperation = new ConsoleDisplay(menu.selectedMenuItem(inputParser.parseMenuOptionInput(library, session)));
            consoleDisplayMenuItemOperation.display();
            if(inputParser.parseMenuOptionInput(library, session).toString().equals("Quit"))
                System.exit(0);
        }
    }
}
