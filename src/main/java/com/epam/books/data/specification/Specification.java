package com.epam.books.data.specification;

import com.epam.books.entity.Book;

import java.util.List;

public interface Specification<T> {
    List<Book> find(List<Book> books, T value);
}