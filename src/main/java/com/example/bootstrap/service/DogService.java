package com.example.bootstrap.service;

import com.example.bootstrap.entity.Dog;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface DogService {
    List<Dog> retrieveDogs();

    List<String> retrieveDogBreed();
    String retrieveDogBreedById(long id);
    List<String> retrieveDogNames();

}
