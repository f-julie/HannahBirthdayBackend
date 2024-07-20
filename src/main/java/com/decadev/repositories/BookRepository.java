package com.decadev.repositories;

import com.decadev.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    Optional<Book> findByAuthor(String author);
    Optional<Book> findByTitle(String title);
    Optional<Book> findByPublishedAt(LocalDate date);
}
