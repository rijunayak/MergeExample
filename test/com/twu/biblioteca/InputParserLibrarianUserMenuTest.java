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
    public void shouldReturnCheckOutMenuItemOnThreeAsCommand() {
        Library library = mock(Library.class);
        Session session = mock(Session.class);
        InputParserLibrarianUserMenu inputParserLibrarianUserMenu = new InputParserLibrarianUserMenu("3");

        assertEquals(CheckOutMovieMenuItem.class, inputParserLibrarianUserMenu.parseMenuOptionInput(library, session).getClass());
    }
}
