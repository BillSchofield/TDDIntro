package com.thoughtworks.tddintro.exercises.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.*;

public class PlayerTest {

    private PrintStream printStream;
    private Player player;
    private Board board;
    private BufferedReader bufferedReader;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        board = mock(Board.class);
        player = new Player(printStream, bufferedReader, board);
    }

    @Test
    public void shouldPromptPlayerWhenMoving() throws IOException {
        when(bufferedReader.readLine()).thenReturn("-1");

        player.move();

        verify(printStream).println(contains("make a move"));
    }

    @Test
    public void shouldMarkBoardWhereUserChoosesOne() throws IOException {
        when(bufferedReader.readLine()).thenReturn("1");

        player.move();

        verify(board).mark(1);
    }

    @Test
    public void shouldMarkBoardWhereUserChoosesFive() throws IOException {
        when(bufferedReader.readLine()).thenReturn("5");

        player.move();

        verify(board).mark(5);
    }
}