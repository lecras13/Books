package com.epam.books.data.acquirer;

import com.epam.books.entity.Book;
import org.junit.Assert;
import org.junit.Test;

public class BookParserTest {
    private final String CORRECT_STRING = "The Adventures of Tom Sawyer,M.Twain,story,American Publishing Company,1876";
    private final String INCORRECT_STRING = "The Adventures of Tom Sawyer,M.Twain,story,American Publishing Company,187s6";
    private final Book EXPECTED =
            new Book("The Adventures of Tom Sawyer", "M.Twain", "story", "American Publishing Company",
                   1876);


    @Test
    public void testParseStringDataToBookIsCorrect(){
        BookParser parser = new BookParser();

        Book actual = parser.create(CORRECT_STRING);

        Assert.assertEquals(actual, EXPECTED);
    }

    @Test(expected = NumberFormatException.class)
    public void testParseStringDataToBookIsIncorrect(){
        BookParser parser = new BookParser();

        Book actual = parser.create(INCORRECT_STRING);

        Assert.assertEquals(actual, EXPECTED);
    }
}
