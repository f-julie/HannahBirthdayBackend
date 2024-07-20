package com.decadev.services;

import com.decadev.entities.Book;
import com.decadev.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    // Create
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    // Read
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public Optional<Book> findById(Long id) {
        return bookRepository.findById(id);
    }

    // Make other finds

    // Update
    public Book updateBook(Long id, Book book) {
        Book oldBook = bookRepository.findById(id).get(); //Get because returns Optional
        book.setId(oldBook.getId());
        return bookRepository.save(book);
    }

    // Delete
    public String deleteBook(Long id) { // Return a String
        Book bookToDelete = bookRepository.findById(id).get();
        bookRepository.delete(bookToDelete);
        return "Successfully deleted book: " + id;
    }

}
