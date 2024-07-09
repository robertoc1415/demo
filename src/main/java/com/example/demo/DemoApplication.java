package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class DemoApplication {

	@GetMapping("/mensaje")

	public String mensaje() {
		return "este es un mensaje de prueba sega";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}