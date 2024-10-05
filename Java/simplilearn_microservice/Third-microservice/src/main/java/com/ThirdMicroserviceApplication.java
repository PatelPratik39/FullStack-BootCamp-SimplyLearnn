package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = "com")
@EnableDiscoveryClient
public class ThirdMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThirdMicroserviceApplication.class, args);
		System.err.println("Third microservice running on port :9393");
		
		
	}

}
