package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.mock;

public class BookTest {

    @Test
    public void specDisplayingABook() {
        Book book = new Book("Three Little Pigs", "James Halliwell-Phillipps", 1886);

        assertEquals(String.format("%40s%40s%40d", "Three Little Pigs", "James Halliwell-Phillipps", 1886), book.toString());
    }

    @Test
    public void shouldReturnFalseOnComparingWithNullObject() {
        Book book = new Book("Three Little Pigs", "James Halliwell-Phillipps", 1886);

        assertNotEquals(book, null);
    }

    @Test
    public void shouldReturnFalseOnComparingWithNullTitle() {
        Book book1 = new Book("Three Little Pigs", "James Halliwell-Phillipps", 1886);
        Book book2 = new Book(null, "James Halliwell-Phillipps", 1886);

        assertNotEquals(book1, book2);
    }

    @Test
    public void shouldReturnFalseWhenComparedWithDifferentClass() {
        Book book = new Book("Three Little Pigs", "James Halliwell-Phillipps", 1886);
        BookList bookList = mock(BookList.class);

        assertNotEquals(book, bookList);
    }

    @Test
    public void shouldReturnTrueOnComparingWithItself() {
        Book book = new Book("Three Little Pigs", "James Halliwell-Phillipps", 1886);

        assertEquals(book, book);
    }

    @Test
    public void shouldReturnFalseIfComparingBookIsNull() {
        Book book = new Book(null, "James Halliwell-Phillipps", 1886);
        Book book1 = new Book("Three Little Pigs", "James Halliwell-Phillipps", 1886);

        assertNotEquals(book, book1);
    }

    @Test
    public void shouldReturnTrueOnComparingBookWithSameTitleOnly() {
        Book book1 = new Book("Three Little Pigs", "James Phillipps", 1886);
        Book book2 = new Book("Three Little Pigs", null, 0);

        assertEquals(book1, book2);
    }

    @Test
    public void shouldReturnFalseOnComparingDifferentBook() {
        Book book1 = new Book("Three Little Pigs", "James Phillipps", 1886);
        Book book2 = new Book("Clifford, The Big Red Dog", "Norman Bridwell", 1963);

        assertNotEquals(book1, book2);
    }

    @Test
    public void shouldReturnZeroOnComparingHashCodeWithNullTitle() {
        Book book = new Book(null, "James Halliwell-Phillipps", 1886);

        assertEquals(0, book.hashCode());
    }

    @Test
    public void shouldHaveSameHashCodeForSameTitles() {
        Book book1 = new Book("Three Little Pigs", "James Phillipps", 1886);
        Book book2 = new Book("Three Little Pigs", null, 0);

        assertEquals(book1.hashCode(), book2.hashCode());
    }

    @Test
    public void shouldHaveDifferentHashCodeForDifferentTitles() {
        Book book1 = new Book("Three Little Pigs", "James Phillipps", 1886);
        Book book2 = new Book("Clifford, The Big Red Dog", "Norman Bridwell", 1963);

        assertNotEquals(book1.hashCode(), book2.hashCode());
    }
}
