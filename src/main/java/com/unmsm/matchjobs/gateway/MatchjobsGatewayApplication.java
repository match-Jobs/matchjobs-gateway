package com.unmsm.matchjobs.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MatchjobsGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MatchjobsGatewayApplication.class, args);
	}

}
