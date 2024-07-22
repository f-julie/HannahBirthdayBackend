package com.decadev.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "messages")
public class BirthdayMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    String title;

    @Column(name = "description")
    String description;

    @Column(name="author")
    String author;

    @Column(name = "published_at")
    LocalDate publishedAt;

    public BirthdayMessage() {
    }

    public BirthdayMessage(String title, String description, String author, LocalDate publishedAt) {
        this.title = title;
        this.description = description;
        this.author = author;
        this.publishedAt = publishedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(LocalDate publishedAt) {
        this.publishedAt = publishedAt;
    }
}
