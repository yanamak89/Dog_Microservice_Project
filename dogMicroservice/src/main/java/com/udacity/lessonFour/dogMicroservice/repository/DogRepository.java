package com.udacity.lessonFour.dogMicroservice.repository;

import com.udacity.lessonFour.dogMicroservice.entity.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DogRepository extends JpaRepository<Dog, Long> {

}
