package com.thoughtworks.tddintro.exercises.tictactoe;

import java.io.PrintStream;

public class Board {
    private PrintStream printStream;

    public Board(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void draw() {
        printStream.println(
                "1|2|3\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|9"
        );
    }

    public void mark(int cell) {

    }
}
