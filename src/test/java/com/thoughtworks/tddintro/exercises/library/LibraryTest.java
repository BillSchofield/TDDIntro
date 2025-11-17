package com.thoughtworks.tddintro.exercises.library;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LibraryTest {
    private List<String> books;
    private PrintStream printStream;
    private Library library;
    private BufferedReader bufferedReader;

    @BeforeEach
    public void setUp() {
        books = new ArrayList<>();
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        library = new Library(books, printStream, bufferedReader);
    }

    @Test
    @Disabled // Remove each @Disabled to allow the test to run
    public void shouldPrintBookTitleWhenThereIsOneBook() {
        String title = "Book Title";
        books.add(title);

        library.listBooks();

        // add a verify statement here that shows that the book title was printed by the printStream
    }

    @Test
    @Disabled // Remove each @Disabled to allow the test to run
    public void shouldPrintNothingWhenThereAreNoBooks() {

        // implement me
    }

    @Test
    @Disabled // Remove each @Disabled to allow the test to run
    public void shouldPrintBothBookTitlesWhenThereAreTwoBooks() {
        // implement me
    }

    @Test
    public void shouldAddBookToCollectionWhenEnteredByUser() throws IOException {
        when(bufferedReader.readLine()).thenReturn("The Hobbit");
        library.enterBook();
        assertThat(books).contains("The Hobbit");
    }

    @Test
    @Disabled // Remove each @Disabled to allow the test to run
    public void shouldDeleteBookFromCollectionWhenRemovedByUser() {
        // Add when/thenReturn here

        books.add("The Two Towers");
        library.removeBook();

        assertThat(books).doesNotContain("The Two Towers");
    }
}
