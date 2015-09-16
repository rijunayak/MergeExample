package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class ListCheckOutsMenuItemTest {

    @Test
    public void shouldReturnMenuEntry() {
        Library library = mock(Library.class);
        ListCheckOutsMenuItem listCheckOutsMenuItem = new ListCheckOutsMenuItem(library);

        assertEquals("Show Book Checkouts", listCheckOutsMenuItem.toString());
    }
}
