package com.epam.books.data.specification;

import com.epam.books.entity.Book;

public class PublisherSpecification extends AbstractSpecification<String> {

    @Override
    public boolean isFieldEqual(Book book, String value){
        String publisher = book.getPublisher();
        return value.equalsIgnoreCase(publisher);
    }
}