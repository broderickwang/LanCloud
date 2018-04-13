package com.count.web.countweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CountWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(CountWebApplication.class, args);
	}
}
