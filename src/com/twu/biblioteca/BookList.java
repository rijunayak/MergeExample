//A BookList has a list of books which it can display
package com.twu.biblioteca;

import java.util.ArrayList;

public class BookList {

    private ArrayList<String> bookList;

    public BookList(ArrayList<String> bookList) {
        this.bookList = bookList;
    }

    public void display() {
        for(int i = 0; i < bookList.size(); i++) {
            System.out.println(bookList.get(i));
        }
    }
}
