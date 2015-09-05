//A Book has an author, title, and Year of Publication which it can display
package com.twu.biblioteca;

import org.junit.Test;

public class Book {
    private String author;
    private String title;
    private int yearOfPublication;

    public Book(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }


    public void display() {
        System.out.format("%23s%23s%23d\n", title, author, yearOfPublication);
    }
}
