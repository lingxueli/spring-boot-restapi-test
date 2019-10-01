package com.example.bootstrap.repository;

import com.example.bootstrap.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {
}
