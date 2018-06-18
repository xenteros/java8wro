package com.github.xenteros.service.impl;

import com.github.xenteros.model.Book;
import com.github.xenteros.repository.BookRepository;
import com.github.xenteros.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book findOneById(Long id) {
        return null;
    }

    @Override
    public Set<Book> findAll() {
        return null;
    }

    @Override
    public Book createBook(Book book) {
        return null;
    }

    @Override
    public void deleteOneById(Long id) {

    }
}
