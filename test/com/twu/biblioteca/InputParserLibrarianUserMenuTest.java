package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class InputParserLibrarianUserMenuTest {

    @Test
    public void shouldReturnInvalidMenuItemOnInvalidCommand() {
        Library library = mock(Library.class);
        Session session = mock(Session.class);
        InputParserLibrarianUserMenu inputParserLibrarianUserMenu = new InputParserLibrarianUserMenu("Not a command.");

        assertEquals(InvalidMenuItem.class, inputParserLibrarianUserMenu.parseMenuOptionInput(library, session).getClass());
    }

    @Test
    public void shouldReturnListBooksMenuItemOnOneAsCommand() {
        Library library = mock(Library.class);
        Session session = mock(Session.class);
        InputParserLibrarianUserMenu inputParserLibrarianUserMenu = new InputParserLibrarianUserMenu("1");

        assertEquals(ListBooksMenuItem.class, inputParserLibrarianUserMenu.parseMenuOptionInput(library, session).getClass());
    }

    @Test
    public void shouldReturnListMoviesMenuItemOnTwoAsCommand() {
        Library library = mock(Library.class);
        Session session = mock(Session.class);
        InputParserLibrarianUserMenu inputParserLibrarianUserMenu = new InputParserLibrarianUserMenu("2");

        assertEquals(ListMoviesMenuItem.class, inputParserLibrarianUserMenu.parseMenuOptionInput(library, session).getClass());
    }

    @Test
    public void shouldReturnCheckOutMovieMenuItemOnThreeAsCommand() {
        Library library = mock(Library.class);
        Session session = mock(Session.class);
        InputParserLibrarianUserMenu inputParserLibrarianUserMenu = new InputParserLibrarianUserMenu("3");

        assertEquals(CheckOutMovieMenuItem.class, inputParserLibrarianUserMenu.parseMenuOptionInput(library, session).getClass());
    }

    @Test
    public void shouldReturnCheckOutBookMenuItemOnFourAsCommand() {
        Library library = mock(Library.class);
        Session session = mock(Session.class);
        InputParserLibrarianUserMenu inputParserLibrarianUserMenu = new InputParserLibrarianUserMenu("4");

        assertEquals(CheckOutBookMenuItem.class, inputParserLibrarianUserMenu.parseMenuOptionInput(library, session).getClass());
    }

    @Test
    public void shouldReturnCheckInBookMenuItemOnFiveAsCommand() {
        Library library = mock(Library.class);
        Session session = mock(Session.class);
        InputParserLibrarianUserMenu inputParserLibrarianUserMenu = new InputParserLibrarianUserMenu("5");

        assertEquals(CheckInBookMenuItem.class, inputParserLibrarianUserMenu.parseMenuOptionInput(library, session).getClass());
    }

    @Test
    public void shouldReturnListCheckoutsMenuItemOnSixAsCommand() {
        Library library = mock(Library.class);
        Session session = mock(Session.class);
        InputParserLibrarianUserMenu inputParserLibrarianUserMenu = new InputParserLibrarianUserMenu("6");

        assertEquals(ListCheckOutsMenuItem.class, inputParserLibrarianUserMenu.parseMenuOptionInput(library, session).getClass());
    }

    @Test
    public void shouldReturnLogoutMenuItemOnSevenAsCommand() {
        Library library = mock(Library.class);
        Session session = mock(Session.class);
        InputParserLibrarianUserMenu inputParserLibrarianUserMenu = new InputParserLibrarianUserMenu("7");

        assertEquals(LogoutMenuItem.class, inputParserLibrarianUserMenu.parseMenuOptionInput(library, session).getClass());
    }
}
