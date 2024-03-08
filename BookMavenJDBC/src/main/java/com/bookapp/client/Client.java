package com.bookapp.client;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IBookService bookService = new BookServiceImpl();
        try {
            bookService.getByAuthorStartsWith("JKRowlihng");
        } catch (BookNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
