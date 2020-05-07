package com.sameer.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootDockerSampleApplication {
	@GetMapping("/user")
	public String getUser() {
		return "hello i am sameer";
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerSampleApplication.class, args);
	}

}
