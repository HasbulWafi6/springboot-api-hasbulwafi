package com.example.api.springboot_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "status")
public class Status {

    @Id
    private int id;

    private String name;

    // === GETTERS & SETTERS ===

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
