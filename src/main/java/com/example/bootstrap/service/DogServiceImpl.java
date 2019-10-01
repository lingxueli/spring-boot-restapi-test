package com.example.bootstrap.service;

import com.example.bootstrap.entity.Dog;
import com.example.bootstrap.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DogServiceImpl implements DogService {
    @Autowired
    DogRepository dogRepository;

    public List<Dog> retrieveDogs(){
        return (List<Dog>) dogRepository.findAll();
    }
}
