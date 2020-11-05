package com.epam.books.data.factory;

import com.epam.books.data.NameTag;
import com.epam.books.comparator.*;
import com.epam.books.entity.Book;

import java.util.Comparator;

public class ComparatorFactoryImpl implements ComparatorFactory {

    @Override
    public Comparator<Book> create(NameTag nameTag){
        switch (nameTag) {
            case TITLE:
                return new TitleComparator();
            case AUTHOR:
                return new AuthorComparator();
            case GENRE:
                return new GenreComparator();
            case PUBLISHER:
                return new PublisherComparator();
            case PUBLIC_DATE:
                return new PublicDateComparator();
            default:
                throw new IllegalArgumentException("Book field " + nameTag + " is not found");
        }
    }
}
