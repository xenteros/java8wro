package com.github.xenteros.repository;

import com.github.xenteros.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.Set;

public interface BookRepository extends JpaRepository<Book, Long> {

    Set<Book> findAllByIdIn(Collection<Long> ids);
}
