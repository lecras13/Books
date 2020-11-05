package com.epam.books.comparator;

import com.epam.books.entity.Book;

import java.util.Comparator;

public class TitleComparator implements Comparator<Book> {

    @Override
    public int compare(Book firstBook, Book secondBook){
        String firstTitle = firstBook.getTitle();
        String secondTitle = secondBook.getTitle();

        return firstTitle.compareTo(secondTitle);
    }
}