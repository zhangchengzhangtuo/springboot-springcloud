package com.apin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceFoundApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceFoundApplication.class, args);
	}
}
