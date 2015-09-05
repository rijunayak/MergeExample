//A BookList has a list of books which it can display
package com.twu.biblioteca;

import java.util.ArrayList;

public class BookList {

    private ArrayList<Book> bookList;

    public BookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    public void display() {
        System.out.format("%23s%23s%23s\n", "Title", "Author", "Year Of Publication");
        for(int i = 0; i < 69; i++)
            System.out.print("-");
        System.out.println();
        for(int i = 0; i < bookList.size(); i++) {
            bookList.get(i).display();
        }
    }
}
