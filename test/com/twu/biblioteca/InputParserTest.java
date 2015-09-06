package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class InputParserTest {

    @Test
    public void shouldReturnListBooksMenuItemOnOneAsInput() {
        InputParser inputParser = new InputParser("1");
        BookList bookList = mock(BookList.class);
        ListBooksMenuItem listBooksMenuItem = new ListBooksMenuItem(bookList);

        assertEquals(listBooksMenuItem.getClass(), inputParser.parseInput(bookList).getClass());
    }

    @Test
    public void shouldReturnInvalidMessageOnInvalidInput() {
        InputParser inputParser = new InputParser("Not a command");
        BookList bookList = mock(BookList.class);

        assertEquals(InvalidMenuItem.class, inputParser.parseInput(bookList).getClass());
    }

    @Test
    public void shouldReturnQuittingAppMessageOnTwoAsInput() {
        InputParser inputParser = new InputParser("2");
        BookList bookList = mock(BookList.class);

        assertEquals(QuitMenuItem.class, inputParser.parseInput(bookList).getClass());
    }
}
