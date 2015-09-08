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

    public String getTitle() {
        return this.title;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;

        Book thatBook = (Book) that;

        return !(title != null ? !title.equals(thatBook.title) : thatBook.title != null);

    }

    @Override
    public int hashCode() {
        return title != null ? title.hashCode() : 0;
    }
}
