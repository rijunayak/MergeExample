package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class InputParserTest {

    @Test
    public void shouldReturnListBooksMenuItemOnOneAsInput() {
        InputParser inputParser = new InputParser("1");
        Library library = mock(Library.class);
        ListBooksMenuItem listBooksMenuItem = new ListBooksMenuItem(library);

        assertEquals(listBooksMenuItem.getClass(), inputParser.parseMainMenuOptionInput(library).getClass());
    }

    @Test
    public void shouldReturnInvalidMessageOnInvalidInput() {
        InputParser inputParser = new InputParser("Not a command");
        Library library = mock(Library.class);

        assertEquals(InvalidMenuItem.class, inputParser.parseMainMenuOptionInput(library).getClass());
    }

    @Test
    public void shouldReturnQuittingAppMessageOnTwoAsInput() {
        InputParser inputParser = new InputParser("5");
        Library library = mock(Library.class);

        assertEquals(QuitMenuItem.class, inputParser.parseMainMenuOptionInput(library).getClass());
    }

    @Test
    public void shouldReturnListMoviesItemOnTwoAsInput() {
        InputParser inputParser = new InputParser("2");
        Library library = mock(Library.class);

        assertEquals(ListMoviesMenuItem.class, inputParser.parseMainMenuOptionInput(library).getClass());
    }

    @Test
    public void shouldReturnCheckOutMenuItemOnTwoAsInput() {
        InputParser inputParser = new InputParser("3");
        Library library = mock(Library.class);

        assertEquals(CheckOutBookMenuItem.class, inputParser.parseMainMenuOptionInput(library).getClass());
    }

    @Test
    public void shouldReturnCheckInMenuItemOnTwoAsInput() {
        InputParser inputParser = new InputParser("4");
        Library library = mock(Library.class);

        assertEquals(CheckInBookMenuItem.class, inputParser.parseMainMenuOptionInput(library).getClass());
    }
}
