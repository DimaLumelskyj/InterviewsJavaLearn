package pl.ordervivi.patterns.builder;

import lombok.Getter;

@Getter
public class LibraryBook {
    private final BookType bookType;
    private final String bookName;

    public LibraryBook(BookType bookType, String bookName) {
        this.bookType = bookType;
        this.bookName = bookName;
    }

    public static class Builder {
        private BookType bookType = BookType.HISTORICAL;
        private String bookName;

        public Builder withBookType(BookType bookType) {
            this.bookType = bookType;
            return this;
        }

        public Builder withBookName(String bookName) {
            this.bookName = bookName;
            return this;
        }

        public LibraryBook build() {
            return new LibraryBook(bookType,
                    bookName);
        }

    }
}
