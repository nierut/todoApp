package com.example.modeltodo.model;

import jakarta.persistence.*;

@Entity
@Table

public class Todo {
    @Id
    @GeneratedValue
    private Long id;

    private String description;
    private boolean completed;
    @ManyToOne
    private User user;

    public Todo() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
