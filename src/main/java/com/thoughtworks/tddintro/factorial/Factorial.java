package com.thoughtworks.tddintro.factorial;

public class Factorial {
    static Integer compute(int i) throws IllegalArgumentException {

        if (i < 0) throw new IllegalArgumentException();

        if (i == 0 || i == 1) {
            return 1;
        }

        return compute(i - 1) * i;
    }
}
