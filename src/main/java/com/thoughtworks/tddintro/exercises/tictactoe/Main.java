package com.thoughtworks.tddintro.exercises.tictactoe;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        PrintStream printStream = System.out;
        Board board = new Board(printStream);
        Player player = new Player(printStream, board);
        board.draw();
        player.move();

    }
}
