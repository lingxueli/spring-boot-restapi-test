package com.example.bootstrap.entity;


import org.springframework.context.annotation.Bean;

import javax.persistence.*;

@Entity
@Table(name = "test")
public class Dog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String Name;
    private String breed;
    private String origin;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public String getBreed() {
        return breed;
    }

    public String getOrigin() {
        return origin;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
