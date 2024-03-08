package com.bookapp.service;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.exceptions.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.repository.BookRepositoryImpl;
import com.bookapp.repository.IBookRepository;

import java.util.List;

public class BookServiceImpl implements IBookService {
    IBookRepository bookRepository = new BookRepositoryImpl();
    @Override
    public void addBook(Book book) {

    }

    @Override
    public void updateBook(int bookId, double price) {

    }

    @Override
    public void deleteBook(int bookId) {

    }

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @Override
    public List<Book> getByAuthorStartsWith(String author) throws BookNotFoundException {

        return bookRepository.findByAuthorStartsWith(author);
    }

    @Override
    public List<Book> getByCategory(String category) throws BookNotFoundException {
        return null;
    }

    @Override
    public List<Book> getPriceLessThan(double price) throws BookNotFoundException {
        return null;
    }

    @Override
    public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
        return null;
    }

    @Override
    public Book getById(int bookId) throws IdNotFoundException {
        return null;
    }
}
