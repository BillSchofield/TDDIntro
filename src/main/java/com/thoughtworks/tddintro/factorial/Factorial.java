package com.thoughtworks.tddintro.factorial;

public class Factorial {
    static Integer compute(int i) {

        if (i == 0 || i == 1) {
            return 1;
        }

        return compute(i - 1) * i;
    }
}
