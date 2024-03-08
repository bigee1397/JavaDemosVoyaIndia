package com.voya.assignments;

public class Book {

    String title;
    String author;
    Float price;
    String category;

    public Book(String title, String author, Float price, String category) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.category = category;
    }
    void getDetails() {
        System.out.println("Title of the Book: " + title);
        System.out.println("Author of the Book: " + author);
        System.out.println("Price of the Book: " + price);
        System.out.println("Category of the Book: " + category);
    }
    void checkBookType() {
        if(price>500) System.out.println("Premium Books.");
        else System.out.println("Standard Books.");
    }
}
