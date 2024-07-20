package com.decadev.controllers;

import com.decadev.entities.Book;
import com.decadev.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping()
    ResponseEntity<?> findAll() {
        return ResponseEntity.ok(bookService.findAll());
    }

    @GetMapping("{id}")
    ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(bookService.findById(id));
    }

    @PostMapping()
    ResponseEntity<?> createBook(@RequestBody Book book) {
        return ResponseEntity.ok(bookService.save(book));
    }
}
