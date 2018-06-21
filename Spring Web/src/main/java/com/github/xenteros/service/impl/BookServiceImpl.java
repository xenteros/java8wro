package com.github.xenteros.service.impl;

import com.github.xenteros.dto.BookCreateDTO;
import com.github.xenteros.model.Author;
import com.github.xenteros.model.Book;
import com.github.xenteros.repository.AuthorRepository;
import com.github.xenteros.repository.BookRepository;
import com.github.xenteros.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;
    private AuthorRepository authorRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
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
    public Book createBook(BookCreateDTO createDTO) {
        Author author = authorRepository.findById(createDTO.getAuthorId())
                .orElseThrow(RuntimeException::new);
        Book book = new Book();
        book.setTitle(createDTO.getTitle());
        book.setAuthor(author);
        return bookRepository.save(book);
    }

    @Override
    public void deleteOneById(Long id) {
        bookRepository.deleteById(id);
    }
}
