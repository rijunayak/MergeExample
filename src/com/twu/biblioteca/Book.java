//A Book has an author, title, and Year of Publication which it can convert to a String
package com.twu.biblioteca;

public class Book {
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
        return String.format("%40s%40s%40d", title, author, yearOfPublication);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;

        Book thatBook = (Book) that;

        if(title != null && thatBook.title != null) {
            return title.equals(thatBook.title);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return title != null ? title.hashCode() : 0;
    }
}
