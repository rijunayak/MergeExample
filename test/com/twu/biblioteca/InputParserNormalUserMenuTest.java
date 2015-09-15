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
}
