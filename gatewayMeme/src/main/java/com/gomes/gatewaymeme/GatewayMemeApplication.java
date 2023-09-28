package com.gomes.gatewaymeme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayMemeApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayMemeApplication.class, args);
	}

}
