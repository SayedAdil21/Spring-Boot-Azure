package com.sayed.spring.SpringAzure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureApplication {
	
	@GetMapping("/Hello")
	public String SayHlo() {
		return "Cool in Cool!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureApplication.class, args);
	}

}
