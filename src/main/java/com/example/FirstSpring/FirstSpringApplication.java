package com.example.FirstSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
public class FirstSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringApplication.class, args);
	}

	@GetMapping
	public String hello(){
		return "First Spring Project by Sean";
	}

}
