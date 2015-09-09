//A BookList has a list of books which it can convert to a String
package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> listOfAvailableBooks;
    private ArrayList<Book> listOfUnavailableBooks;

    public Library(ArrayList<Book> listOfAvailableBooks) {
        this.listOfAvailableBooks = listOfAvailableBooks;
        this.listOfUnavailableBooks = new ArrayList<Book>();
    }

    @Override
    public String toString() {
        String listOfBooks = "";
        listOfBooks += String.format("\n%40s%40s%40s\n", "Title", "Author", "Year Of Publication");
        for(int i = 0; i < 120; i++)
            listOfBooks += "-";
        listOfBooks += "\n";
        for(int i = 0; i < listOfAvailableBooks.size(); i++) {
            listOfBooks += listOfAvailableBooks.get(i) + "\n";
        }
        return listOfBooks;
    }

    public boolean checkOut(Book book) {
        Book bookToCheckout = null;
        if(listOfAvailableBooks.contains(book)) {
            bookToCheckout = listOfAvailableBooks.get(listOfAvailableBooks.indexOf(book));
            listOfUnavailableBooks.add(bookToCheckout);
        }
        return listOfAvailableBooks.remove(book);
    }
}
