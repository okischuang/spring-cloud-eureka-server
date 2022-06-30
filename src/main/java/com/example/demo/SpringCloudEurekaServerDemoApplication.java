package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaServer
@SpringBootApplication
@RestController
public class SpringCloudEurekaServerDemoApplication {

	@GetMapping("health")
	public String health() {
		return "ok";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaServerDemoApplication.class, args);
		
	}

}
