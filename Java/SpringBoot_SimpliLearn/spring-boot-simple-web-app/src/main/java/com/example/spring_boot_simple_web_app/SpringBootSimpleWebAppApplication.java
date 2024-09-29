package com.example.spring_boot_simple_web_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSimpleWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSimpleWebAppApplication.class, args);
		System.out.println("Spring boot is up and running ");
	}

}
