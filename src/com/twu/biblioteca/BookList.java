//A BookList has a list of books which it can convert to a String
package com.twu.biblioteca;

import java.util.ArrayList;

public class BookList {

    private ArrayList<Book> bookList;

    public BookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        String listOfBooks = "";
        listOfBooks += String.format("\n%40s%40s%40s\n", "Title", "Author", "Year Of Publication");
        for(int i = 0; i < 120; i++)
            listOfBooks += "-";
        listOfBooks += "\n";
        for(int i = 0; i < bookList.size(); i++) {
            listOfBooks += bookList.get(i) + "\n";
        }
        return listOfBooks;
    }

    public boolean checkOut(Book book) {
        return bookList.remove(book);
    }
}
