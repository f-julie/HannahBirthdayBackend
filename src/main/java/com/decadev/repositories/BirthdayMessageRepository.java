package com.decadev.repositories;

import com.decadev.entities.BirthdayMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface BirthdayMessageRepository extends JpaRepository<BirthdayMessage, Long> {
    Optional<BirthdayMessage> findByAuthor(String author);
    Optional<BirthdayMessage> findByTitle(String title);
    Optional<BirthdayMessage> findByPublishedAt(LocalDate date);
}
