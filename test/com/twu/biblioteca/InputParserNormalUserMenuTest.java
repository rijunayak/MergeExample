package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class InputParserNormalUserMenuTest {

    @Test
    public void shouldReturnInvalidMenuItemOnInvalidCommand() {
        Library library = mock(Library.class);
        Session session = mock(Session.class);
        InputParserNormalUserMenu inputParserNormalUserMenu = new InputParserNormalUserMenu("Not a command.");

        assertEquals(InvalidMenuItem.class, inputParserNormalUserMenu.parseMenuOptionInput(library, session).getClass());
    }

    @Test
    public void shouldReturnListBooksMenuItemOnOneAsCommand() {
        Library library = mock(Library.class);
        Session session = mock(Session.class);
        InputParserNormalUserMenu inputParserNormalUserMenu = new InputParserNormalUserMenu("1");

        assertEquals(ListBooksMenuItem.class, inputParserNormalUserMenu.parseMenuOptionInput(library, session).getClass());
    }

    @Test
    public void shouldReturnListMoviesMenuItemOnTwoAsCommand() {
        Library library = mock(Library.class);
        Session session = mock(Session.class);
        InputParserNormalUserMenu inputParserNormalUserMenu = new InputParserNormalUserMenu("2");

        assertEquals(ListMoviesMenuItem.class, inputParserNormalUserMenu.parseMenuOptionInput(library, session).getClass());
    }

    @Test
    public void shouldCheckOutMovieMenuItemOnThreeAsCommand() {
        Library library = mock(Library.class);
        Session session = mock(Session.class);
        InputParserNormalUserMenu inputParserNormalUserMenu = new InputParserNormalUserMenu("3");

        assertEquals(CheckOutMovieMenuItem.class, inputParserNormalUserMenu.parseMenuOptionInput(library, session).getClass());
    }

    @Test
    public void shouldCheckOutBookMenuItemOnFourAsCommand() {
        Library library = mock(Library.class);
        Session session = mock(Session.class);
        InputParserNormalUserMenu inputParserNormalUserMenu = new InputParserNormalUserMenu("4");

        assertEquals(CheckOutBookMenuItem.class, inputParserNormalUserMenu.parseMenuOptionInput(library, session).getClass());
    }

    @Test
    public void shouldCheckInBookMenuItemOnFiveAsCommand() {
        Library library = mock(Library.class);
        Session session = mock(Session.class);
        InputParserNormalUserMenu inputParserNormalUserMenu = new InputParserNormalUserMenu("5");

        assertEquals(CheckInBookMenuItem.class, inputParserNormalUserMenu.parseMenuOptionInput(library, session).getClass());
    }

    @Test
    public void shouldLogoutMenuItemOnSixAsCommand() {
        Library library = mock(Library.class);
        Session session = mock(Session.class);
        InputParserNormalUserMenu inputParserNormalUserMenu = new InputParserNormalUserMenu("6");

        assertEquals(LogoutMenuItem.class, inputParserNormalUserMenu.parseMenuOptionInput(library, session).getClass());
    }
}
