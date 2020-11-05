package com.epam.books.data.factory;

import com.epam.books.data.NameTag;
import com.epam.books.data.specification.AbstractSpecification;

public interface SpecificationFactory {
    <T> AbstractSpecification<T> create(NameTag nameTag);
}