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
        BibliotecaApp bibliotecaApp = new BibliotecaApp(welcomeMessageFactory.getDefaultWelcomeMessage(), libraryFactory.getDefaultLibrary(), menuFactory.getDefaultMenu(), new Session(new User("000-0000", "password", "undefined")), new InputParser(""));
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
        if(session.getUser().getRole().equals("undefined")) {
            return new InputParser(consoleInput.getInput());
        }
        return new InputParserNormalUserMenu(consoleInput.getInput());
    }

    private Menu getMenuBasedOnSession() {
        if(session.getUser().getRole().equals("undefined")) {
            return new MenuFactory().getDefaultMenu();
        }
        return new MenuFactory().getNormalUserMenu();
    }
}
