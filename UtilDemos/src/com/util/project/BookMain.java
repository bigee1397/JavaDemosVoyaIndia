package com.util.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BookMain {
    public static void main(String[] args) {
        List<Book> booksList = Arrays.asList(
                new Book("War and Peace","Leo Tolstoy",499),
                new Book("Toy Story","Some X",999),
                new Book("Harry Potter Series","J K Rowling",1599),
                new Book("Golden Compass","J K Rowling",699),
                new Book("Daffodils","Charles Dickens",39));

        System.out.println("Before sorting: ");
        for ( Book book : booksList ) {
            System.out.println(book);
        }

        System.out.println("After sorting: ");
        Collections.sort(booksList);
        for (Book book : booksList ) {
            System.out.println(book);
        }

    }
}
