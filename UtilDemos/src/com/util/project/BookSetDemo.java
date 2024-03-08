package com.util.project;

import java.util.*;

public class BookSetDemo {
    public static void main(String[] args) {
        List<Book> booksList = Arrays.asList(
                new Book("Toy Story","Some X",999),
                new Book("War and Peace","Leo Tolstoy",499),
                new Book("Golden Compass","J K Rowling",699),
                new Book("Toy Story","Some X",999),
                new Book("Golden Compass","J K Rowling",699),
                new Book("Harry Potter Series","J K Rowling",1599),
                new Book("Daffodils","Charles Dickens",39));
        Set<Book> bookSet = new TreeSet<>(booksList);
//        Set<Book> bookSet = new HashSet<>(booksList);
        for (Book book : bookSet ) {
            System.out.println(book);
        }
    }
}
