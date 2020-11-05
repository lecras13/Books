package com.epam.books.comparator;

import com.epam.books.entity.Book;

import java.util.Comparator;

public class PublicDateComparator implements Comparator<Book> {

    @Override
    public int compare(Book firstBook, Book secondBook){
        Integer firstPublicDate = firstBook.getPublicDate();
        Integer secondPublicDate = secondBook.getPublicDate();

        return firstPublicDate.compareTo(secondPublicDate);
    }
}
