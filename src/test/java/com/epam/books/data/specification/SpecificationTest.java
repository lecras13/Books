package com.epam.books.data.specification;

import com.epam.books.data.NameTag;
import com.epam.books.data.factory.ComparatorFactory;
import com.epam.books.data.factory.ComparatorFactoryImpl;
import com.epam.books.data.factory.SpecificationFactory;
import com.epam.books.data.factory.SpecificationFactoryImpl;
import com.epam.books.entity.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class SpecificationTest {

    private static final Book FIRST = new Book("The Adventures of Tom Sawyer", "M.Twain", "story",
            "American Publishing Company", 1876);
    private static final Book SECOND = new Book("A dictionary of ballet terms", "L.Kersley", "novel",
            "Da Capo", 1981);
    private static final Book THIRD = new Book("The Dark Tower I: The Gunslinger", "S.King", "novel",
            "Grant-Plume", 1982);
    private static final Book FOURTH = new Book("The Dark Tower II: The Drawing of the Three", "S.King", "novel",
            "Grant-Plume", 1987);
    private static final Book FIFTH = new Book("Harry Potter and the Chamber of Secrets", "J.Rowling", "novel",
            "Bloomsbury Publishing", 1998);

    private static final SpecificationFactory specificationFactory = new SpecificationFactoryImpl();
    private static final ComparatorFactory comparatorFactory = new ComparatorFactoryImpl();
    private static final List<Book> BOOK = Arrays.asList(FIRST, SECOND, THIRD, FOURTH, FIFTH);
    private static final List<Book> BOOK_SORT_TITLE = Arrays.asList(SECOND, FIFTH, FIRST, THIRD, FOURTH);
    private static final List<Book> BOOK_SORT_AUTHOR = Arrays.asList(FIFTH, SECOND, FIRST, THIRD, FOURTH);
    private static final List<Book> BOOK_SORT_GENRE = Arrays.asList(FIFTH, SECOND, THIRD, FOURTH, FIRST);
    private static final List<Book> BOOK_SORT_PUBLISHER = Arrays.asList(FIRST, FIFTH, SECOND, THIRD, FOURTH);
    private static final List<Book> BOOK_SORT_PUBLIC_DATE = Arrays.asList(FIRST, SECOND, THIRD, FOURTH, FIFTH);
    private static final List<Book> REQUEST = Arrays.asList(FIRST);

    @Test
    public void testReturnBookListByTitleFromRequest(){
        Specification specification = specificationFactory.create(NameTag.TITLE);

        List<Book> expected = specification.find(BOOK, FIRST.getTitle());

        Assert.assertEquals(REQUEST, expected);
    }

    @Test
    public void testReturnBookListByAuthorFromRequest(){
        Specification specification = specificationFactory.create(NameTag.AUTHOR);

        List<Book> expected = specification.find(BOOK, FIRST.getAuthor());

        Assert.assertEquals(REQUEST, expected);
    }

    @Test
    public void testReturnBookListByGenreFromRequest(){
        Specification specification = specificationFactory.create(NameTag.GENRE);

        List<Book> expected = specification.find(BOOK, FIRST.getGenre());

        Assert.assertEquals(REQUEST, expected);
    }

    @Test
    public void testReturnBookListByPublisherFromRequest(){
        Specification specification = specificationFactory.create(NameTag.PUBLISHER);

        List<Book> expected = specification.find(BOOK, FIRST.getPublisher());

        Assert.assertEquals(REQUEST, expected);
    }

    @Test
    public void testReturnBookListByPublicDateFromRequest(){
        Specification specification = specificationFactory.create(NameTag.PUBLIC_DATE);

        List<Book> expected = specification.find(BOOK, FIRST.getPublicDate());

        Assert.assertEquals(REQUEST, expected);
    }

    @Test
    public void testReturnBookListByTitleSort(){
        List<Book> expected = BOOK;

        Collections.sort(expected, comparatorFactory.create(NameTag.TITLE));

        Assert.assertEquals( BOOK_SORT_TITLE, expected);
    }

    @Test
    public void testReturnBookListByAuthorSort(){
        List<Book> expected = BOOK;

        Collections.sort(expected, comparatorFactory.create(NameTag.AUTHOR));

        Assert.assertEquals(BOOK_SORT_AUTHOR, expected);
    }

    @Test
    public void testReturnBookListByGenreSort(){
        List<Book> expected = BOOK;

        Collections.sort(expected, comparatorFactory.create(NameTag.GENRE));

        Assert.assertEquals(BOOK_SORT_GENRE, expected);
    }

    @Test
    public void testReturnBookListByPublisherSort(){
        List<Book> expected = BOOK;

        Collections.sort(expected, comparatorFactory.create(NameTag.PUBLISHER));

        Assert.assertEquals(BOOK_SORT_PUBLISHER, expected);
    }

    @Test
    public void testReturnBookListByPublicDateSort(){
        List<Book> expected = BOOK;

        Collections.sort(expected, comparatorFactory.create(NameTag.PUBLIC_DATE));

        Assert.assertEquals(BOOK_SORT_PUBLIC_DATE, expected);
    }
}
