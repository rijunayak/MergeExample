//The BibliotecaApp provides an entry point to start the application
package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;

public class BibliotecaApp {

    public void start() {
        WelcomeMessage welcomeMessage = new WelcomeMessage("Welcome to Bangalore Public Library");
        ArrayList<String> listOfBooks = new ArrayList<String>(Arrays.asList("Three Little Pigs", "Clifford goes on tour", "Cinderella"));
        BookList bookList = new BookList(listOfBooks);
        welcomeMessage.display();
        System.out.println();
        bookList.display();
    }

    public static void main(String[] args) {

    }
}
