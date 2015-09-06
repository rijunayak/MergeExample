//A Book has an author, title, and Year of Publication which it can convert to a String
package com.twu.biblioteca;

public class Book implements Displayable {
    private String author;
    private String title;
    private int yearOfPublication;

    public Book(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }


    @Override
    public String toString() {
        return String.format("%23s%23s%23d", title, author, yearOfPublication);
    }
}
