package com.thoughtworks.tddintro.exercises.tictactoe;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        PrintStream printStream = System.out;
        Board board = new Board(printStream);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Player player = new Player(printStream, bufferedReader, board);
        Game game = new Game(player, board);
        game.start();
        board.draw();
    }
}
