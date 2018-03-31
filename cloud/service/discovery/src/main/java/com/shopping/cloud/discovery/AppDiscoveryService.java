package com.shopping.cloud.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AppDiscoveryService {
	public static void main(String[] args) {
		SpringApplication.run(AppDiscoveryService.class, args);
	}
}
