package com.epam.books.comparator;

import com.epam.books.entity.Book;

import java.util.Comparator;

public class GenreComparator implements Comparator<Book> {

    @Override
    public int compare(Book firstBook, Book secondBook){
        String firstGenre = firstBook.getGenre();
        String secondGenre = secondBook.getGenre();

        return firstGenre.compareTo(secondGenre);
    }
}
