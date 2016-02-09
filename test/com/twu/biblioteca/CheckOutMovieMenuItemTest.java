package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CheckOutMovieMenuItemTest {

    private final ByteArrayInputStream inContent = new ByteArrayInputStream("Movie To Checkout".getBytes());


    @Test
    public void shouldReturnItemEntryInMenu() {
        Library library = mock(Library.class);
        CheckOutMovieMenuItem checkOutMovieMenuItem = new CheckOutMovieMenuItem(library);

        assertEquals("Checkout a Movie", checkOutMovieMenuItem.toString());
    }

    @Before
    public void setUpStreams() {
        System.setIn(inContent);
    }

    @Test
    public void shouldReturnCheckedOutMovie() {
        Library library = mock(Library.class);
        ArgumentCaptor<Movie> argumentCaptor = ArgumentCaptor.forClass(Movie.class);
        CheckOutMovieMenuItem checkOutMovieMenuItem = new CheckOutMovieMenuItem(library);
        when(library.checkOutMovie(argumentCaptor.capture())).thenReturn(true);

        assertEquals("\nThank you! Enjoy the movie.\n", checkOutMovieMenuItem.doOperation());
    }

    @Test
    public void shouldReturnInvalidMovieMessageForUnavailableMovie() {
        Library library = mock(Library.class);
        ArgumentCaptor<Movie> argumentCaptor = ArgumentCaptor.forClass(Movie.class);
        CheckOutMovieMenuItem checkOutMovieMenuItem = new CheckOutMovieMenuItem(library);
        when(library.checkOutMovie(argumentCaptor.capture())).thenReturn(false);

        assertEquals("\nThat movie does not exist!\n", checkOutMovieMenuItem.doOperation());
    }

    @After
    public void cleanUpStreams() {
        System.setIn(System.in);
    }
}
