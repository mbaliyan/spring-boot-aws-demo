package com.java.techie.aws.springbootawsdemo;

import com.java.techie.aws.springbootawsdemo.entity.Person;
import com.java.techie.aws.springbootawsdemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
//@ComponentScan(basePackages = "com.java.techie.aws.springbootawsdemo")
public class SpringBootAwsDemoApplication {

	@Autowired
	private PersonRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAwsDemoApplication.class, args);
	}

	@GetMapping("/")
	public String hello(){
		return "Welcome to the world of AWS with SpringBoot";
	}
	@GetMapping("/hello")
	public String helloWorld(){
		return "Welcome to the world of AWS with SpringBoot with API";
	}
	@PostMapping("/savePerson")
	public Person savePerson(@RequestBody Person person) {
		return repository.addPerson(person);
	}


	@GetMapping("/getPerson/{personId}")
	public Person findPerson(@PathVariable String personId) {
		return repository.findPersonByPersonId(personId);
	}

	@DeleteMapping("/deletePerson")
	public String deletePerson(@RequestBody Person person) {
		return repository.deletePerson(person);
	}

	@PutMapping("/editPerson")
	public String updatePerson(@RequestBody Person person) {
		return repository.editPerson(person);
	}


}
