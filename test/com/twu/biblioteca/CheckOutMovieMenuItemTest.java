package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class CheckOutMovieMenuItemTest {

    @Test
    public void shouldReturnItemEntryInMenu() {
        Library library = mock(Library.class);
        CheckOutMovieMenuItem checkOutMovieMenuItem = new CheckOutMovieMenuItem(library);

        assertEquals("Checkout a Movie", checkOutMovieMenuItem.toString());
    }
}
