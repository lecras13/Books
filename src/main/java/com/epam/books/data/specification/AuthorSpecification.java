package com.epam.books.data.specification;

import com.epam.books.entity.Book;

public class AuthorSpecification extends AbstractSpecification<String> {

    @Override
    public boolean isFieldEqual(Book book, String value){
        String author = book.getAuthor();
        return value.equalsIgnoreCase(author);
    }
}
