package com.epam.books.entity;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private String genre;
    private String publisher;
    private int publicDate;

    public Book(String title, String author, String genre, String publisher, int publicDate){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publisher = publisher;
        this.publicDate = publicDate;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getGenre(){
        return genre;
    }

    public String getPublisher(){
        return publisher;
    }


    public int getPublicDate(){
        return publicDate;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Book book = (Book) o;

        if (publicDate != book.publicDate) {
            return false;
        }
        if (!Objects.equals(title, book.title)) {
            return false;
        }
        if (!Objects.equals(author, book.author)) {
            return false;
        }
        if (!Objects.equals(genre, book.genre)) {
            return false;
        }
        return Objects.equals(publisher, book.publisher);
    }

    @Override
    public int hashCode(){
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (genre != null ? genre.hashCode() : 0);
        result = 31 * result + (publisher != null ? publisher.hashCode() : 0);
        result = 31 * result + publicDate;
        return result;
    }

    @Override
    public String toString(){
        return "TITLE=" + title +
                ", AUTHOR=" + author +
                ", GENRE=" + genre +
                ", PUBLISHER=" + publisher +
                ", PUBLIC_DATE=" + publicDate;
    }
}
