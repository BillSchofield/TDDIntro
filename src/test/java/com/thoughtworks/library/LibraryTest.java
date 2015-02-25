package com.thoughtworks.library;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.*;

public class LibraryTest {


    /*

        List books tests. Implement the first three tests for the Verify exercise

     */


    @Test
    public void shouldPrintBookTitleWhenThereIsOneBook() {

        List<String> books = new ArrayList<>();
        String title = "Book Title";
        books.add(title);
        PrintStream printStream = mock(PrintStream.class);
        Library library = new Library(books, printStream, null);

        library.listBooks();

        // add a verify statement here that shows that the book title was printed by to the printStream
        verify(printStream).println("Book Title");
    }

    @Test
    public void shouldPrintNothingWhenThereAreNoBooks() {
        List<String> books = new ArrayList<>();
        PrintStream printStream = mock(PrintStream.class);
        Library library = new Library(books, printStream, null);
        library.listBooks();
        verifyZeroInteractions(printStream);
    }

    @Test
    public void shouldPrintBothBookTitlesWhenThereAreTwoBooks() {
        List<String> books = new ArrayList<>();
        String book1 = "Book 1";
        String book2 = "Book 2";
        books.add(book1);
        books.add(book2);
        PrintStream printStream = mock(PrintStream.class);
        Library library = new Library(books, printStream, null);

        library.listBooks();

        verify(printStream).println("Book 1");
        verify(printStream).println("Book 2");
    }

    /*

        Welcome message tests. Implement these tests for the when/thenReturn exercise

     */

    
    // This one is done for you
    @Test
    public void shouldWelcomeUser() {
        List<String> books = new ArrayList<>();
        PrintStream printStream = mock(PrintStream.class);
        DateTimeFormatter dateTimeFormatter = mock(DateTimeFormatter.class);
        Library library = new Library(books, printStream, dateTimeFormatter);

        // We don't need to mock DateTime because it is a value object
        // We can't mock it because it is a final class
        DateTime time = new DateTime();
        
        library.welcome(time);
        
        verify(printStream).println(contains("Welcome"));
    }
    
    @Test
    public void shouldDisplayFormattedTime() {
        List<String> books = new ArrayList<>();
        PrintStream printStream = mock(PrintStream.class);
        DateTime time = new DateTime();
        DateTimeFormatter dateTimeFormatter = mock(DateTimeFormatter.class);

        when(dateTimeFormatter.print(time)).thenReturn("FormattedTimeString");

        Library library = new Library(books, printStream, dateTimeFormatter);

        library.welcome(time);

        verify(printStream).println("Welcome to the library! The current time is FormattedTimeString");
    }

    @Test
    public void shouldDisplayFormattedTimeWhenItIsAnEmptyString() {

        // implement me
    }
}