package com.thoughtworks.tddintro.exercises.tictactoe;

public class Game {
    private Player player;
    private Board board;

    public Game(Player player, Board board) {
        this.player = player;
        this.board = board;
    }

    public void start() {
        board.draw();
        player.move();
    }
}
