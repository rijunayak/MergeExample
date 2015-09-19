package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GridTest {

    @Test
    public void shouldReturnTheStringOfItsStateWithOnlyOneAliveCell() {
        Cell cell = mock(Cell.class);
        Grid grid = new Grid(cell);

        when(cell.stateOfCell()).thenReturn(true);

        assertEquals("X", grid.toString());
    }
}
