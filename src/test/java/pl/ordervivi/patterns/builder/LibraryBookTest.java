package pl.ordervivi.patterns.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class LibraryBookTest {
    @Test
    public void checkDefaultBuilderBookTypeHistoricalIsTrue() {
        final LibraryBook.Builder builder = new LibraryBook.Builder();
        LibraryBook book = builder.withBookName("The Prince").build();
        assertEquals(BookType.HISTORICAL, book.getBookType());
    }
}