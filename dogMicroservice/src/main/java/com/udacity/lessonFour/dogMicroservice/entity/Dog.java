package com.udacity.lessonFour.dogMicroservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Dog {

    public Dog(String breed) {
        this.name = name;
        this.breed = breed;
        this.origin = origin;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int name;
    private String breed;
    private String origin;

    public Dog() {

    }
}