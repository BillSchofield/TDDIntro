package com.thoughtworks.tddintro.exercises.tictactoe;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GameTest {

    private Player player;
    private Game game;
    private Board board;

    @BeforeEach
    public void setUp() throws Exception {
        player = mock(Player.class);
        board = mock(Board.class);
        game = new Game(player, board);
    }

    @Test
    public void playerShouldMoveWhenGameStarts() {
        game.start();

        verify(player).move();
    }

    @Test
    public void shouldDrawBoardBeforePlayerMovesWhenGameStarts() {
        game.start();

        verify(board).draw();
    }


}