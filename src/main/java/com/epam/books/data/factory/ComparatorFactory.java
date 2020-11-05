package com.epam.books.data.factory;

import com.epam.books.data.NameTag;
import com.epam.books.entity.Book;

import java.util.Comparator;

public interface ComparatorFactory {
    Comparator<Book> create(NameTag nameTag);
}