package com.thoughtworks.tddintro.resources.test_double;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GreetingPrinterTest {

    @Test
    public void shouldPrintGreeting() {
        FakePrintStream printStream = new FakePrintStream();
        GreetingPrinter greetingPrinter = new GreetingPrinter(printStream);

        greetingPrinter.printGreeting();

        assertThat(printStream.printedString()).isEqualTo("Greetings!");
    }

}