package com.example.bootstrap.service;

import com.example.bootstrap.entity.Dog;
import com.example.bootstrap.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DogServiceImpl implements DogService {
    @Autowired
    DogRepository dogRepository;

    @Override
    public List<Dog> retrieveDogs(){
        return (List<Dog>) dogRepository.findAll();
    }

    @Override
    public List<String> retrieveDogBreed() {
         List<String> breeds = new ArrayList<String>();
         dogRepository.findAll().forEach(dog -> breeds.add(dog.getBreed()));
         return breeds;
    }

    @Override
    public String retrieveDogBreedById(long id) {
        Optional<Dog> toUnpack = dogRepository.findById(id);
        return toUnpack.isPresent() ? toUnpack.get().getBreed() : null;
    }

    @Override
    public List<String> retrieveDogNames() {
        List<String> names = new ArrayList<String>();
        dogRepository.findAll().forEach(dog -> names.add(dog.getName()));
        return names;
    }

}
