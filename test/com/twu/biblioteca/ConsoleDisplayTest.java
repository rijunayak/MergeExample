package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ConsoleDisplayTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(System.out);
    }

    @Test
    public void checkIfDisplayingString() {
        Displayable displayable = new WelcomeMessage("Hi, I'm Riju");
        ConsoleDisplay consoleDisplay = new ConsoleDisplay(displayable);

        consoleDisplay.display();

        assertEquals("Hi, I'm Riju\n", outContent.toString());
    }
}
