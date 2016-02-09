//The BibliotecaApp provides an entry point to start the application
package com.twu.biblioteca;

public class BibliotecaApp {

    private WelcomeMessage welcomeMessage;
    private Library library;
    private Menu menu;
    private Session session;
    private Parser parser;

    public BibliotecaApp() {
        this.welcomeMessage = new WelcomeMessageFactory().getDefaultWelcomeMessage();
        this.menu = new MenuFactory().getDefaultMenu();
        this.session = new Session(new User("000-0000", "password", "undefined", "name1", "email1", "phone1"));
        this.library = new LibraryFactory().getDefaultLibrary(session);
        this.parser = new InputParser("");
    }

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.start();
    }

    public void start() {
        ConsoleDisplay consoleDisplayWelcomeMessage = new ConsoleDisplay(welcomeMessage);
        consoleDisplayWelcomeMessage.display();
        repeatThroughMenu();
    }

    private void repeatThroughMenu() {
        while(true) {
            menu = getMenuBasedOnSession();
            ConsoleDisplay consoleDisplayMenu = new ConsoleDisplay(menu);
            consoleDisplayMenu.display();
            parser = getParserBasedOnSession();
            ConsoleDisplay consoleDisplayMenuItemOperation = new ConsoleDisplay(menu.selectedMenuItem(parser.parseMenuOptionInput(library, session)));
            consoleDisplayMenuItemOperation.display();
            if(parser.parseMenuOptionInput(library, session).toString().equals("Quit"))
                System.exit(0);
        }
    }

    private Parser getParserBasedOnSession() {
        ConsoleInput consoleInput = new ConsoleInput();
        if(session.getUser().getRole().equals("user")) {
            return new InputParserNormalUserMenu(consoleInput.getInput());
        } else if(session.getUser().getRole().equals("librarian")) {
            return new InputParserLibrarianUserMenu(consoleInput.getInput());
        }
        return new InputParser(consoleInput.getInput());
    }

    private Menu getMenuBasedOnSession() {
        if(session.getUser().getRole().equals("user")) {
            return new MenuFactory().getNormalUserMenu();
        } else if(session.getUser().getRole().equals("librarian")) {
            return new MenuFactory().getLibrarianUserMenu();
        }
        return new MenuFactory().getDefaultMenu();
    }
}
