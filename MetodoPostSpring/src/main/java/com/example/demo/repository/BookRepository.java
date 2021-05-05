package com.example.demo.repository;

import java.util.ArrayList;

import com.example.demo.model.Book;

import org.springframework.stereotype.Repository;

/**
 * BookRepository
 */
@Repository
public class BookRepository {
    ArrayList<Book> books;
    private int contbook = 0;

    public BookRepository() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        book.setId(contbook);
        books.add(book);
        contbook++;
    }

    public ArrayList<Book> getBooks() {
        return this.books;
    }
}