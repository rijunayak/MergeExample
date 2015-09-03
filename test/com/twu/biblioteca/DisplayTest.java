package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;

public class DisplayTest {

    @Test
    public void shouldDisplayWelcomeMessageOfDisplay() {
        Display testConsole = mock(Display.class);
        testConsole.displayWelcomeMessage();
        Mockito.verify(testConsole, times(1)).displayWelcomeMessage();
    }
}
