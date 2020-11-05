package com.epam.books.data.specification;

import com.epam.books.entity.Book;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSpecification<T> implements Specification<T> {
    private static final Logger LOGGER = LogManager.getLogger(AbstractSpecification.class);

    protected abstract boolean isFieldEqual(Book book, T value);

    @Override
    public List<Book> find(List<Book> books, T value){
        List<Book> findingBooks = new ArrayList<>();
        for (Book book : books) {
            if (isFieldEqual(book, value)) {
                findingBooks.add(book);
                LOGGER.info(String.format("Book with Tag: %s", book.toString()));
            }
        }
        return findingBooks;
    }
}
