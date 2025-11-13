package com.thoughtworks.tddintro.resources.string_joiner;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.CombinableMatcher.both;
import static org.hamcrest.core.StringContains.containsString;

public class StringJoinerTests {
    private List<String> strings;
    private StringJoiner joiner;

    @Before
    public void setUp() {
        strings = new ArrayList<>();
        joiner = new StringJoiner("SomeDelimiter");
    }

    @Test
    public void shouldJoinIntoAnEmptyStringWhenListIsEmpty(){
        assertThat(joiner.join(strings), is(""));
    }

    @Test
    public void shouldJoinIntoTheStringWhenListIsOneString(){
        String aString = "A String";
        strings.add(aString);
        assertThat(joiner.join(strings), is(aString));
    }

    @Test
    public void shouldContainBothStringsWhenListIsTwoStrings(){
        strings.add("A");
        strings.add("B");
        assertThat(joiner.join(strings), both(containsString("A")).and(containsString("B")));
    }

    @Test
    public void shouldPutDelimiterBetweenStrings(){
        StringJoiner joinerWithDelimiter = new StringJoiner(",");
        strings.add("A");
        strings.add("B");
        assertThat(joinerWithDelimiter.join(strings), is("A,B"));
    }
}
