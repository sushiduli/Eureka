package com.example.cloudDemoServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudDemoServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudDemoServerApplication.class, args);
	}

}

