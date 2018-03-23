package com.vmware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Rest2Application {

	public static void main(String[] args) {
		SpringApplication.run(Rest2Application.class, args);
	}
}
