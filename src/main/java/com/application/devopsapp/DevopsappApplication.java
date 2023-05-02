package com.application.devopsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsappApplication {

	@GetMapping("/hello")
	public String message(){
		return "welcome to devops automation file";
	}

	public static void main(String[] args) {
		SpringApplication.run(DevopsappApplication.class, args);
	}

}
