package com.panxiaoan.springcloud.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RunOrderServiceApp {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}