package com.example.bootstrap;


import org.springframework.context.annotation.Bean;

import javax.persistence.Entity;

@Entity
public class Dog {
    private String Name;
    private String breed;
    private String origin;

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
