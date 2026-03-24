package com.example.bookstore.dao;

import com.example.bookstore.hibernate.model.Book;

import java.util.List;

public interface BookDAO {
    List<Book> getAllBooks();
    Book getBookById(int id);
    void addBook(Book book);
    void updateBook(Book book);
    void deleteBook(int id);
}
