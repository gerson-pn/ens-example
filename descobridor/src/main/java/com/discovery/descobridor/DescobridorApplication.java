package com.discovery.descobridor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DescobridorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DescobridorApplication.class, args);
	}
}

