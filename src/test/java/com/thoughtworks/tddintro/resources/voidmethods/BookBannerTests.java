package com.thoughtworks.tddintro.resources.voidmethods;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BookBannerTests {
    @Test
    @Disabled // Remove each @Disabled to allow the test to run
    public void shouldRemoveBannedBooksFromLibrary() {
        Collection<String> bannedBooks = new ArrayList<String>();
        bannedBooks.add("Tom Sawyer");
        Library library = mock(Library.class);
        BookBanner bookBanner = new BookBanner(library);

        bookBanner.remove(bannedBooks);

        verify(library).removeBook("Tom Sawyer");
    }
}
