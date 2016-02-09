package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListMoviesMenuItemTest {

    @Test
    public void shouldReturnItsMenuEntry() {
        Library library = mock(Library.class);
        ListMoviesMenuItem listMoviesMenuItem = new ListMoviesMenuItem(library);

        assertEquals("List all Movies", listMoviesMenuItem.toString());
    }

    @Test
    public void shouldReturnTheListOfBooks() {
        Library library = mock(Library.class);
        ListMoviesMenuItem listMoviesMenuItem = new ListMoviesMenuItem(library);
        String oneSixtyDashes = "";
        for(int i = 0; i < 160; i++) {
            oneSixtyDashes += "-";
        }

        when(library.listMovies()).thenReturn(
                String.format("\n%40s%40s%40s%40s\n", "Name", "Year Of Release", "Director", "Rating") +
                        oneSixtyDashes + "\n" +
                        String.format("%40s%40d%40s%40s", "Three Little Pigs", 1933, "Burt Gillett", "1") + "\n" +
                        String.format("%40s%40d%40s%40s", "Clifford, The Big Red Dog", 2000, "John Over", "1") + "\n" +
                        String.format("%40s%40d%40s%40s", "Cinderella", 1950, "Clyde Geronim", "1") + "\n"
        );

        assertEquals(library.listMovies(), listMoviesMenuItem.doOperation());
    }
}
