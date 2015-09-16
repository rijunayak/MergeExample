package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListCheckOutsMenuItemTest {

    @Test
    public void shouldReturnMenuEntry() {
        Library library = mock(Library.class);
        ListCheckOutsMenuItem listCheckOutsMenuItem = new ListCheckOutsMenuItem(library);

        assertEquals("Show Book Checkouts", listCheckOutsMenuItem.toString());
    }

    @Test
    public void shouldReturnCheckoutsOnSelection() {
        Library library = mock(Library.class);
        ListCheckOutsMenuItem listCheckOutsMenuItem = new ListCheckOutsMenuItem(library);

        when(library.listCheckouts()).thenReturn("Book Checkouts");

        assertEquals("Book Checkouts", listCheckOutsMenuItem.doOperation());
    }
}
