package com.epam.books.data.acquirer;

import com.epam.books.entity.Book;

public class BookParser {
    private static final String LINE_SEPARATOR = ",";
    private static final int TITLE = 0;
    private static final int AUTHOR = 1;
    private static final int GENRE = 2;
    private static final int PUBLISHER = 3;
    private static final int PUBLIC_DATE = 4;

    public Book create(String line){
        String[] fields = line.split(LINE_SEPARATOR);
        String title = fields[TITLE];
        String author = fields[AUTHOR];
        String genre = fields[GENRE];
        String publisher = fields[PUBLISHER];
        int publicDate = Integer.parseInt(fields[PUBLIC_DATE]);

        return new Book(title, author, genre, publisher, publicDate);
    }
}
