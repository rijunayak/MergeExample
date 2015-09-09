package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CheckInBookMenuItemTest {

    private final ByteArrayInputStream inContent = new ByteArrayInputStream("Book To Checkout".getBytes());

    @Test
    public void shouldRightlyReturnMenuItemName() {
        Library library = mock(Library.class);
        CheckInBookMenuItem checkInBookMenuItem = new CheckInBookMenuItem(library);

        assertEquals("Return a book", checkInBookMenuItem.toString());
    }

    @Before
    public void setUpStreams() {
        System.setIn(inContent);
    }

    @Test
    public void shouldSuccesfullyCheckInAValidBook() {
        Library library = mock(Library.class);
        ArgumentCaptor<Book> argumentCaptor = ArgumentCaptor.forClass(Book.class);
        CheckInBookMenuItem checkInBookMenuItem = new CheckInBookMenuItem(library);
        when(library.checkIn(argumentCaptor.capture())).thenReturn(true);

        assertEquals("\nThank you for returning the book.\n", checkInBookMenuItem.doOperation());
    }

    @After
    public void cleanUpStreams() {
        System.setIn(System.in);
    }
}
