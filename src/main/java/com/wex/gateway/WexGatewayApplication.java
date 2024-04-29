package com.wex.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WexGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(WexGatewayApplication.class, args);
	}

}
