package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class WelcomeMessageTest {

    @Test
    public void shouldReturnWelcomeMessage() {
        WelcomeMessage welcomeMessage = new WelcomeMessage("Welcome to Bangalore Public Library");

        assertEquals("Welcome to Bangalore Public Library", welcomeMessage.toString());
    }
}
