package com.epam.books.data.acquirer;

import com.epam.books.entity.Book;
import com.epam.books.exception.DataException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileDataAcquirer implements DataAcquirer {
    private static final String FILE_PATH = "book_db.txt";
    private static final BookParser BOOK_PARSER = new BookParser();

    private Book getData(String stringBook){
        return BOOK_PARSER.create(stringBook);
    }

    @Override
    public List<Book> getBooks() throws DataException{
        List<Book> books = new ArrayList<>();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(FILE_PATH));
            String current;
            while ((current = reader.readLine()) != null) {
                Book currentBook = getData(current);
                books.add(currentBook);
            }
        } catch (FileNotFoundException e) {
            throw new DataException(e.getMessage(), e);
        } catch (IOException e) {
            throw new DataException(e.getMessage(), e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new DataException(e.getMessage(), e);
                }
            }
        }
        return books;
    }
}
