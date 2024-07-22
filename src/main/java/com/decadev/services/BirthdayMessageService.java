package com.decadev.services;

import com.decadev.entities.BirthdayMessage;
import com.decadev.repositories.BirthdayMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BirthdayMessageService {
    @Autowired
    private BirthdayMessageRepository birthdayMessageRepository;

    // Create
    public BirthdayMessage save(BirthdayMessage birthdayMessage) {
        return birthdayMessageRepository.save(birthdayMessage);
    }

    // Read
    public List<BirthdayMessage> findAll() {
        return birthdayMessageRepository.findAll();
    }

    public Optional<BirthdayMessage> findById(Long id) {
        return birthdayMessageRepository.findById(id);
    }

    // Make other finds

    // Update
    public BirthdayMessage updateBook(Long id, BirthdayMessage birthdayMessage) {
        BirthdayMessage oldMessage = birthdayMessageRepository.findById(id).get(); //Get because returns Optional
        birthdayMessage.setId(oldMessage.getId());
        return birthdayMessageRepository.save(birthdayMessage);
    }

    // Delete
    public String deleteMessage(Long id) { // Return a String
        BirthdayMessage messageToDelete = birthdayMessageRepository.findById(id).get();
        birthdayMessageRepository.delete(messageToDelete);
        return "Successfully deleted the message: " + id;
    }

}
