package com.epam.books.data.specification;

import com.epam.books.entity.Book;

public class GenreSpecification extends AbstractSpecification<String> {

    @Override
    public boolean isFieldEqual(Book book, String value){
        String genre = book.getGenre();
        return value.equalsIgnoreCase(genre);
    }
}
