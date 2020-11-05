package com.epam.books.data.specification;

import com.epam.books.entity.Book;

public class TitleSpecification extends AbstractSpecification<String> {

    @Override
    public boolean isFieldEqual(Book book, String value){
        String title = book.getTitle();
        return value.equalsIgnoreCase(title);
    }
}
