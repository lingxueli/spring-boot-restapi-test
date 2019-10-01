package com.example.bootstrap.service;

import com.example.bootstrap.entity.Dog;

import java.util.List;

public interface DogService {
    List<Dog> retrieveDogs();

    List<String> retrieveDogBreed();
    String retrieveDogBreedById(long id);
    List<String> retrieveDogNames();

}
