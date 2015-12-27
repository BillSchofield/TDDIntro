package com.thoughtworks.tddintro.factorial;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/*

    * Change Factorial.compute() so that the first test passes and the remaining tests fail.
    * Change Factorial.compute() so that the first two tests pass and the remaining tests fail.
    ...
    * Change Factorial.compute() so that all of the tests pass.

 */

public class FactorialTests {

    @Test // Make me pass first
    public void shouldReturnOneWhenNumberIsOne(){
        assertThat(Factorial.compute(1), is(1));
    }

    @Test
    public void shouldReturnTwoWhenNumberIsTwo(){
        assertThat(Factorial.compute(2), is(2));
    }

    @Test
    public void shouldReturnOneWhenNumberIsZero(){
        assertThat(Factorial.compute(0), is(1));
    }

    @Test
    public void shouldReturnSixWhenNumberIsThree(){
        assertThat(Factorial.compute(3), is(6));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionWhenNumberIsNegative(){
        Factorial.compute(-1);
    }
}