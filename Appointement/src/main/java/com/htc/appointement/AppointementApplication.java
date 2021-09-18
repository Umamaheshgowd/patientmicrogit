package com.htc.appointement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AppointementApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppointementApplication.class, args);
	}

}
