package com.udacity.pricingeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PricingeurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PricingeurekaApplication.class, args);
	}

}
