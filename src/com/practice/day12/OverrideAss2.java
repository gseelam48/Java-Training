package com.practice.day12;

public class OverrideAss2 {
    public static void main(String[] args) {
        Product product = new Product();
        product.displayInfo();
        Book book = new Book();
        book.title();
        book.author();
        Phone phone = new Phone();
        phone.model();
        phone.brand();
    }
}

class Product {
    void displayInfo() {
        System.out.println("it is a generic product");
    }
}

class Book extends Product {
    public void title() {
        System.out.println("Ikegai");
    }

    public void author() {
        System.out.println("Hector Garcia and Francesc Miralles");
    }
}

class Phone extends Product {
    public void brand() {
        System.out.println("Iphone 16");
    }

    public void model() {
        System.out.println("2016");
    }
}

