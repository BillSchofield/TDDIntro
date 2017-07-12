package com.thoughtworks.tddintro.exercises.tictactoe;

import java.io.PrintStream;

public class Player {
    private PrintStream printStream;

    public Player(PrintStream printStream, Board board) {
        this.printStream = printStream;
    }

    public void move() {
        printStream.println("Player 1, please make a move");
    }
}
