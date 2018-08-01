package com.thoughtworks.tddintro.exercises.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class Player {
    private PrintStream printStream;
    private BufferedReader bufferedReader;
    private Board board;

    public Player(PrintStream printStream, BufferedReader bufferedReader, Board board) {
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
        this.board = board;
    }

    public void move() {
        printStream.println("Player 1, please make a move");
        String input = readLine();
        board.mark(Integer.parseInt(input));
    }

    private String readLine() {
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
