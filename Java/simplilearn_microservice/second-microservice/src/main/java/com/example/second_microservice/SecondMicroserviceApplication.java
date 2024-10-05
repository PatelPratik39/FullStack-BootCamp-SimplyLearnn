package com.example.second_microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = "com")
@EnableDiscoveryClient
public class SecondMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondMicroserviceApplication.class, args);
		System.err.println("Second microservice running on port :9292");
	}

}
