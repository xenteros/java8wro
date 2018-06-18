package com.github.xenteros.service.impl;

import com.github.xenteros.model.Book;
import com.github.xenteros.repository.BookRepository;
import com.github.xenteros.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
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
        return bookRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public Set<Book> findAll() {
        return new HashSet<>(bookRepository.findAll());
    }

    @Override
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void deleteOneById(Long id) {
        bookRepository.deleteById(id);
    }
}
