package com.epam.books.data.acquirer;

import com.epam.books.entity.Book;
import com.epam.books.exception.DataException;

import java.util.List;

public interface DataAcquirer {
    List<Book> getBooks() throws DataException;
}
