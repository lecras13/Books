package com.epam.books.comparator;

import com.epam.books.entity.Book;

import java.util.Comparator;

public class PublisherComparator implements Comparator<Book> {

    @Override
    public int compare(Book firstBook, Book secondBook){
        String firstPublisher = firstBook.getPublisher();
        String secondPublisher = secondBook.getPublisher();

        return firstPublisher.compareTo(secondPublisher);
    }
}
