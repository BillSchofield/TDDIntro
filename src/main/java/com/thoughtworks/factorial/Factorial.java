package com.thoughtworks.factorial;

public class Factorial {
    public Integer compute(int i) {
        if (i < 0){
            throw new IllegalArgumentException("The number must be an integer 0 or greater");
        }
        if (i == 0){
            return 1;
        } else {
            return i * compute(i-1);
        }
    }
}
