package com.practice.day18;

public class AssHasA {
    public static void main(String[] args) {
        Book book = new Book("Life", "Gopi");
        Library library = new Library(book);
        library.printBookDetails();

    }
}

class Book {
    String title;
    String author;

    Book() {

    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class Library {
    Book book;

    public Library(Book book) {
        this.book = book;
    }

    public void printBookDetails() {
        System.out.println("Title : " + book.title);
        System.out.println("Author : " + book.author);
    }
}
