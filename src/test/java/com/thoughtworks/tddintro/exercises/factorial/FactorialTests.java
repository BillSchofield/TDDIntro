package com.thoughtworks.tddintro.exercises.factorial;
/*

    * Change Factorial.compute() so that the first test passes and the remaining tests fail.
    * Change Factorial.compute() so that the first two tests pass and the remaining tests fail.
    ...
    * Change Factorial.compute() so that all of the tests pass.

 */

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTests {

    private final Factorial factorial = new Factorial();

    @Test // Make me pass first
    @Disabled // Remove each @Disabled to allow the test to run
    public void shouldReturnOneWhenNumberIsOne(){
        assertThat(new Factorial().compute(1)).isEqualTo(1);
    }

    @Test
    @Disabled // Remove each @Disabled to allow the test to run
    public void shouldReturnTwoWhenNumberIsTwo(){
        assertThat(factorial.compute(2)).isEqualTo(2);
    }

    @Test
    @Disabled // Remove each @Disabled to allow the test to run
    public void shouldReturnOneWhenNumberIsZero(){
        assertThat(factorial.compute(0)).isEqualTo(1);
    }

    @Test
    @Disabled // Remove each @Disabled to allow the test to run
    public void shouldReturnSixWhenNumberIsThree(){
        assertThat(factorial.compute(3)).isEqualTo(6);
    }

    @Test
    @Disabled // Remove each @Disabled to allow the test to run
    public void shouldThrowIllegalArgumentExceptionWhenNumberIsNegative(){
        assertThrows(IllegalArgumentException.class, () -> {
            factorial.compute(-1);
        });
    }
}