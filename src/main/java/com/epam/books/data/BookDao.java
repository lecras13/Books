package com.epam.books.data;

import com.epam.books.entity.Book;
import com.epam.books.exception.DataException;

import java.util.List;

public interface BookDao {

    void addBook(Book newBook) throws DataException;

    <T> List<Book> findByTag(NameTag nameTag, T value);

    void removeBook(Book newBook) throws DataException;

    List<Book> sortByTag(NameTag nameTag);

    int getSize();

    Book get(int i);
}