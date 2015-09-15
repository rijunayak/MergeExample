package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.matches;
import static org.mockito.Mockito.mock;

public class InputParserTest {

    @Test
    public void shouldReturnListBooksMenuItemOnOneAsInput() {
        InputParser inputParser = new InputParser("1");
        Library library = mock(Library.class);
        Session session = mock(Session.class);
        ListBooksMenuItem listBooksMenuItem = new ListBooksMenuItem(library);

        assertEquals(listBooksMenuItem.getClass(), inputParser.parseMenuOptionInput(library, session).getClass());
    }

    @Test
    public void shouldReturnInvalidMessageOnInvalidInput() {
        InputParser inputParser = new InputParser("Not a command");
        Library library = mock(Library.class);
        Session session = mock(Session.class);

        assertEquals(InvalidMenuItem.class, inputParser.parseMenuOptionInput(library, session).getClass());
    }

    @Test
    public void shouldReturnQuittingAppMessageOnFiveAsInput() {
        InputParser inputParser = new InputParser("5");
        Library library = mock(Library.class);
        Session session = mock(Session.class);

        assertEquals(QuitMenuItem.class, inputParser.parseMenuOptionInput(library, session).getClass());
    }

    @Test
    public void shouldReturnListMoviesItemOnTwoAsInput() {
        InputParser inputParser = new InputParser("2");
        Library library = mock(Library.class);
        Session session = mock(Session.class);

        assertEquals(ListMoviesMenuItem.class, inputParser.parseMenuOptionInput(library, session).getClass());
    }

    @Test
    public void shouldReturnCheckOutMovieMenuItemOnThreeAsInput() {
        InputParser inputParser = new InputParser("3");
        Library library = mock(Library.class);
        Session session = mock(Session.class);

        assertEquals(CheckOutMovieMenuItem.class, inputParser.parseMenuOptionInput(library, session).getClass());
    }

    @Test
    public void shouldReturnLoginMenuItemOnFourAsInput() {
        InputParser inputParser = new InputParser("4");
        Library library = mock(Library.class);
        Session session = mock(Session.class);

        assertEquals(LoginMenuItem.class, inputParser.parseMenuOptionInput(library, session).getClass());
    }
}
