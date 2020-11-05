package com.epam.books.comparator;

import com.epam.books.entity.Book;

import java.util.Comparator;

public class AuthorComparator implements Comparator<Book> {

    @Override
    public int compare(Book firstBook, Book secondBook){
        String firstAuthor = firstBook.getAuthor();
        String secondAuthor = secondBook.getAuthor();

        return firstAuthor.compareTo(secondAuthor);
    }
}
