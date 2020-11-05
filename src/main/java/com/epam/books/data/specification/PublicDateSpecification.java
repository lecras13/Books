package com.epam.books.data.specification;

import com.epam.books.entity.Book;

public class PublicDateSpecification extends AbstractSpecification<Integer> {
    @Override
    public boolean isFieldEqual(Book book, Integer value){
        Integer publicDate = book.getPublicDate();
        return publicDate.equals(value);
    }
}
