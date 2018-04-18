package com.count.server.countserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CountServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CountServerApplication.class, args);
	}
}
