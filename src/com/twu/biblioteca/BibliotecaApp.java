//The BibliotecaApp provides an entry point to start the application
package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;

public class BibliotecaApp {

    public static void main(String[] args) {
        WelcomeMessage welcomeMessage = new WelcomeMessage("Welcome to Bangalore Public Library");
        ConsoleDisplay consoleDisplay = new ConsoleDisplay(welcomeMessage);
        consoleDisplay.display();
        Book book1 = new Book("Three Little Pigs", "James Halliwell-Phillipps", 1886);
        Book book2 = new Book("Clifford, The Big Red Dog", "Norman Bridwell", 1963);
        Book book3 = new Book("Cinderella", "Giambattista Basile", 1634);
        ArrayList<Book> listOfBooks = new ArrayList<Book>(Arrays.asList(book1, book2, book3));
        BookList bookList = new BookList(listOfBooks);
        ListBooksMenuItem listBooksMenuItem = new ListBooksMenuItem(bookList);
        QuitMenuItem quitMenuItem = new QuitMenuItem();
        ArrayList<MenuItem> listOfMenuItems = new ArrayList<MenuItem>(Arrays.asList(listBooksMenuItem, quitMenuItem));
        Menu mainMenu = new Menu(listOfMenuItems);
        ConsoleDisplay consoleDisplayMenu = new ConsoleDisplay(mainMenu);
        ConsoleInput consoleInput = new ConsoleInput();
        InputParser inputParser = new InputParser("");
        while(!inputParser.parseMainMenuOptionInput(bookList).toString().equals("Quit")) {
            consoleDisplayMenu.display();
            System.out.print("Enter an option : ");
            inputParser = new InputParser(consoleInput.getInput());
            consoleDisplay = new ConsoleDisplay(mainMenu.selectedMenuItem(inputParser.parseMainMenuOptionInput(bookList)));
            consoleDisplay.display();
        }
    }
}
