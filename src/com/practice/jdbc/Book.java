package com.practice.jdbc;

import java.math.BigDecimal;

public class Book {
        int bookId;
        String title;
        String author;
        BigDecimal price;
        int publishedyear;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getPublishedyear() {
        return publishedyear;
    }

    public void setPublishedyear(int publishedyear) {
        this.publishedyear = publishedyear;
    }
public Book(){

}
    public Book(int bookId, String title, String author, BigDecimal price, int publishedyear) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        this.publishedyear = publishedyear;
    }
}

