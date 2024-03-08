package com.voya.assignments;

public class BookMain {

    public static void main(String[] args) {

        Book book = new Book("War And Peace", "Leo Tolstoy", 499.9f, "Fiction");
        book.getDetails();
        book.checkBookType();

        System.out.println();

        Book book1 = new Book("Golden Compass", "J K Rowling", 699.9f, "Drama");
        book1.getDetails();
        book1.checkBookType();
    }

}
