package com.udacity.lessonFour.dogMicroservice;

import com.udacity.lessonFour.dogMicroservice.entity.Dog;
import com.udacity.lessonFour.dogMicroservice.repository.DogRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DogMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DogMicroserviceApplication.class, args);
	}

}

@Component
class DogIntializer implements CommandLineRunner {

	private final DogRepository dogRepository;

	DogIntializer(DogRepository dogRepository) {
		this.dogRepository = dogRepository;
	}

	@Override
	public void run(String... args) throws Exception {

		Stream.of("Spot", "Pit Bull", "Austin, TX").forEach(dog -> dogRepository.save(new Dog(dog)));

		dogRepository.findAll().forEach(System.out::println);
	}
}