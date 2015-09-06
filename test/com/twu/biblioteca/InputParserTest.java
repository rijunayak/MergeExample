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
}
