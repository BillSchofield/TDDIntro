package com.thoughtworks.tddintro.exercises.tictactoe;


import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class BoardTest {

    @Test
    public void shouldPrintGridWhenDrawing() {
        PrintStream printStream = mock(PrintStream.class);
        Board board = new Board(printStream);

        board.draw();

        verify(printStream).println(
                "1|2|3\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|9"
        );
    }
}