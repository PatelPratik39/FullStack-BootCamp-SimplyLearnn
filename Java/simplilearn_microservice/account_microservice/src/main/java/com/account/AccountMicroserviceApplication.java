package com.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = "com.account")
@EnableDiscoveryClient
public class AccountMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountMicroserviceApplication.class, args);
		System.err.println("First Microservice is up and running at port : 9494");
	}

}
