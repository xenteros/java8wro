package com.github.xenteros.service;

import com.github.xenteros.model.Book;

import java.util.Set;

public interface BookService {

    Book findOneById(Long id);
    Set<Book> findAll();
    Book createBook(Book book);
    void deleteOneById(Long id);

}
