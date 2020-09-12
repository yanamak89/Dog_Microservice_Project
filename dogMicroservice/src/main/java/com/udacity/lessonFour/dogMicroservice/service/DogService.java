package com.udacity.lessonFour.dogMicroservice.service;

import com.udacity.lessonFour.dogMicroservice.entity.Dog;

import java.util.List;

public interface DogService {
    List<Dog> retrieveDogs();
    List<String> retrieveDogBreed();
    String retrieveDogBreedById(Long id);
    List<String> retrieveDogNames();
}
