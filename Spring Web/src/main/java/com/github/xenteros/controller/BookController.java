package com.github.xenteros.controller;

import com.github.xenteros.dto.BookCreateDTO;
import com.github.xenteros.dto.BookDTO;
import com.github.xenteros.model.Book;
import com.github.xenteros.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
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
    public BookDTO findById(@PathVariable Long id) {
        Book book =  bookService.findOneById(id);
        return new BookDTO(book);
    }

    @GetMapping
    public Set<BookDTO> findAll() {
        Set<BookDTO> result = new HashSet<>();

        Set<Book> all = bookService.findAll();
        all.forEach(b -> result.add(new BookDTO(b)));

        return result;
    }


    @PostMapping
    public BookDTO create(@RequestBody BookCreateDTO newBook) {
        return new BookDTO(bookService.createBook(newBook));
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteOneById(id);
    }

}
