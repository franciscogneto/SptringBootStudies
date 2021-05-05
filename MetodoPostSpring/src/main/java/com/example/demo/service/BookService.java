package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * BookService
 */
@Service
public class BookService {

    @Autowired
    private BookRepository br;

    public boolean addBook(Book book) {
        if (book.getAuthor().trim().length() == 0 || book.getPublishing_company().trim().length() == 0
                || book.getTitle().trim().length() == 0 || book.getYear().trim().length() == 0) {
            return false;
        }
        br.addBook(book);
        return true;
    }

    public ArrayList<Book> getBooks() {
        if (br.getBooks().isEmpty())
            return null;
        return br.getBooks();
    }
}