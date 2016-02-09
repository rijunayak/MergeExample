package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;

public class ConsoleInputTest {

    private final ByteArrayInputStream inContent = new ByteArrayInputStream("Test Input".getBytes());

    @Before
    public void setUpStreams() {
        System.setIn(inContent);
    }

    @After
    public void cleanUpStreams() {
        System.setIn(System.in);
    }

    @Test
    public void checkIfInputtingString() {
        ConsoleInput consoleInput = new ConsoleInput();

        assertEquals("Test Input", consoleInput.getInput());
    }
}
