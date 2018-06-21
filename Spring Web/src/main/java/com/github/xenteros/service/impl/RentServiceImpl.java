package com.github.xenteros.service.impl;

import com.github.xenteros.dto.RentDTO;
import com.github.xenteros.model.Book;
import com.github.xenteros.model.Rent;
import com.github.xenteros.repository.BookRepository;
import com.github.xenteros.repository.RentRepository;
import com.github.xenteros.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Service
public class RentServiceImpl implements RentService {

    private RentRepository rentRepository;
    private BookRepository bookRepository;

    @Autowired
    public RentServiceImpl(RentRepository rentRepository, BookRepository bookRepository) {
        this.rentRepository = rentRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public Rent createRent(RentDTO rentDTO) {
        List<Long> ids = rentDTO.getIds();
        Set<Book> books = bookRepository.findAllByIdIn(ids);

        Rent rent = new Rent();
        rent.setBooks(books);
        rent.setRentTime(LocalDateTime.now());
        rent.setReturnTime(LocalDate.now().plusDays(7));
        return rentRepository.save(rent);
    }
}
