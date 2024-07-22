package com.decadev.controllers;

import com.decadev.entities.BirthdayMessage;
import com.decadev.services.BirthdayMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/messages")
public class BirthdayMessageController {
    @Autowired
    BirthdayMessageService birthdayMessageService;

    @GetMapping()
    ResponseEntity<?> findAll() {
        return ResponseEntity.ok(birthdayMessageService.findAll());
    }

    @GetMapping("{id}")
    ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(birthdayMessageService.findById(id));
    }

    @PostMapping()
    ResponseEntity<?> createMessage(@RequestBody BirthdayMessage birthdayMessage) {
        return ResponseEntity.ok(birthdayMessageService.save(birthdayMessage));
    }
}
