package com.epam.books.data.factory;

import com.epam.books.data.NameTag;
import com.epam.books.data.specification.*;

public class SpecificationFactoryImpl implements SpecificationFactory {

    @Override
    public <T> AbstractSpecification<T> create(NameTag nameTag){
        switch (nameTag) {
            case TITLE:
                return (AbstractSpecification<T>) new TitleSpecification();
            case AUTHOR:
                return (AbstractSpecification<T>) new AuthorSpecification();
            case GENRE:
                return (AbstractSpecification<T>) new GenreSpecification();
            case PUBLISHER:
                return (AbstractSpecification<T>) new PublisherSpecification();
            case PUBLIC_DATE:
                return (AbstractSpecification<T>) new PublicDateSpecification();
            default:
                throw new IllegalArgumentException("Book field " + nameTag + "is not found!");
        }
    }
}
