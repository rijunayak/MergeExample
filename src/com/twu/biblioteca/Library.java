// A Library has a list of books which it can check out, return and display
package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> listOfAvailableBooks;
    private ArrayList<Book> listOfUnavailableBooks;
    private ArrayList<Movie> movies;

    public Library(ArrayList<Book> listOfAvailableBooks, ArrayList<Movie> movies) {
        this.listOfAvailableBooks = listOfAvailableBooks;
        this.listOfUnavailableBooks = new ArrayList<Book>();
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "";
    }

    public String listAvailableBooks() {
        String listOfAvailableBooks = "";
        listOfAvailableBooks += String.format("\n%40s%40s%40s\n", "Title", "Author", "Year Of Publication");
        for(int i = 0; i < 120; i++)
            listOfAvailableBooks += "-";
        listOfAvailableBooks += "\n";
        for(int i = 0; i < this.listOfAvailableBooks.size(); i++) {
            listOfAvailableBooks += this.listOfAvailableBooks.get(i) + "\n";
        }
        return listOfAvailableBooks;
    }

    public boolean checkOutBook(Book book) {
        Book bookToCheckout = null;
        if(listOfAvailableBooks.contains(book)) {
            bookToCheckout = listOfAvailableBooks.get(listOfAvailableBooks.indexOf(book));
            listOfUnavailableBooks.add(bookToCheckout);
        }
        return listOfAvailableBooks.remove(book);
    }

    public boolean checkInBook(Book book) {
        Book bookToCheckin = null;
        if(listOfUnavailableBooks.contains(book)) {
            bookToCheckin = listOfUnavailableBooks.get(listOfUnavailableBooks.indexOf(book));
            listOfAvailableBooks.add(bookToCheckin);
        }
        return listOfUnavailableBooks.remove(book);
    }
}
