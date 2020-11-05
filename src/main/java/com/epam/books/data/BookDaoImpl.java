package com.epam.books.data;

import com.epam.books.data.factory.ComparatorFactory;
import com.epam.books.data.factory.ComparatorFactoryImpl;
import com.epam.books.data.factory.SpecificationFactory;
import com.epam.books.data.factory.SpecificationFactoryImpl;
import com.epam.books.data.specification.Specification;
import com.epam.books.entity.Book;
import com.epam.books.exception.DataException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookDaoImpl implements BookDao {
    private static final Logger LOGGER = LogManager.getLogger(BookDaoImpl.class);
    private static final SpecificationFactory SPECIFICATION = new SpecificationFactoryImpl();
    private static final ComparatorFactory COMPARATOR = new ComparatorFactoryImpl();
    private final List<Book> bookList;

    public BookDaoImpl(List<Book> bookList){
        this.bookList = bookList;
    }

    public Book get(int index){
        return bookList.get(index);
    }

    @Override
    public void addBook(Book book) throws DataException{
        if (!bookList.contains(book)) {
            bookList.add(book);
            LOGGER.info(String.format("Book added"));
        } else {
            throw new DataException(String.format("Book is exist %s", book.toString()));
        }
    }

    public <T> List<Book> findByTag(NameTag nameTag, T value){
        Specification<T> specification = SPECIFICATION.create(nameTag);
        return specification.find(bookList, value);
    }

    @Override
    public void removeBook(Book book) throws DataException{
        if (bookList.contains(book)) {
            bookList.remove(book);
            LOGGER.info(String.format("Book deleted"));
        } else {
            throw new DataException(String.format("Book is not exist %s", book.toString()));
        }
    }

    @Override
    public List<Book> sortByTag(NameTag nameTag){
        Comparator<Book> comparator = COMPARATOR.create(nameTag);
        Collections.sort(bookList, comparator);
        return bookList;
    }

    @Override
    public int getSize(){
        return bookList.size();
    }
}
