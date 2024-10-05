package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = "com")
@EnableDiscoveryClient
public class FirstMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstMicroserviceApplication.class, args);
		System.err.println("First Microservice is running on port : 9393");
	}

}
