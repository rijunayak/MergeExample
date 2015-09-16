// A Library has a list of books and movies which it can check out, return books and display
package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> listOfAvailableBooks;
    private ArrayList<Book> listOfCheckedOutBooks;
    private HashMap<Book, User> bookUserMap;
    private ArrayList<Movie> movies;
    private Session session;

    public Library(ArrayList<Book> listOfAvailableBooks, ArrayList<Movie> movies, Session session) {
        this.listOfAvailableBooks = listOfAvailableBooks;
        this.listOfCheckedOutBooks = new ArrayList<Book>();
        bookUserMap = new HashMap<Book, User>();
        this.movies = movies;
        this.session = session;
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

    public String listMovies() {
        String movies = "";
        movies += String.format("\n%40s%40s%40s%40s\n", "Name", "Year Of Release", "Director", "Rating");
        for(int i = 0; i < 160; i++)
            movies += "-";
        movies += "\n";
        for(Movie movie : this.movies) {
            movies += movie + "\n";
        }
        return movies;
    }

    public String listCheckouts() {
        String listCheckouts = "";
        listCheckouts += String.format("\n%40s%40s\n", "Checked out Book", "Library Number");
        for(int i = 0; i < 80; i++) {
            listCheckouts += "-";
        }
        for(Book book : listOfCheckedOutBooks) {
            listCheckouts += String.format("%40s%40s\n", book.getTitle(), bookUserMap.get(book).getUserId());
        }
        return listCheckouts;
    }

    public boolean checkOutMovie(Movie movie) {
        return movies.remove(movie);
    }

    public boolean checkOutBook(Book book) {
        Book bookToCheckout = null;
        if(listOfAvailableBooks.contains(book)) {
            bookToCheckout = listOfAvailableBooks.get(listOfAvailableBooks.indexOf(book));
            listOfCheckedOutBooks.add(bookToCheckout);
            bookUserMap.put(bookToCheckout, session.getUser());
        }
        return listOfAvailableBooks.remove(book);
    }

    public boolean checkInBook(Book book) {
        Book bookToCheckin = null;
        if(listOfCheckedOutBooks.contains(book) && session.getUser().equals(bookUserMap.get(book))) {
            bookToCheckin = listOfCheckedOutBooks.get(listOfCheckedOutBooks.indexOf(book));
            listOfAvailableBooks.add(bookToCheckin);
            bookUserMap.remove(book);
            return listOfCheckedOutBooks.remove(book);
        }
        return false;
    }
}
