package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class CheckInBookMenuItemTest {

    @Test
    public void shouldRightlyReturnMenuItemName() {
        Library library = mock(Library.class);
        CheckInBookMenuItem checkInBookMenuItem = new CheckInBookMenuItem(library);

        assertEquals("Return a book", checkInBookMenuItem.toString());
    }
}
