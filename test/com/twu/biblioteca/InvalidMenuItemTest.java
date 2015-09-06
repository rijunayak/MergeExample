package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InvalidMenuItemTest {

    @Test
    public void shouldReturnAppropriateMessageOnSelectionOfInvalidMenuItem() {
        InvalidMenuItem invalidMenuItem = new InvalidMenuItem();

        assertEquals("\nSelect a valid option!\n", invalidMenuItem.doOperation());
    }
}
