package com.github.xenteros.controller;

import com.github.xenteros.model.Book;
import com.github.xenteros.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api/books")
class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/{id}")
    public Book findById(@PathVariable Long id) {
        return bookService.findOneById(id);
    }

    @GetMapping
    public Set<Book> findAll() {
        return bookService.findAll();
    }

    @PostMapping
    public Book create(@RequestBody Book newBook) {
        return bookService.createBook(newBook);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteOneById(id);
    }

}
