package com.vmware.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Component
public class Svc implements ISvc {
	@Autowired
	private GreetingClient client;

	@Override
	@HystrixCommand(fallbackMethod = "problemo")
	public String doGreet() {
		return client.greet();
	}

	public String problemo() {
		return "Something really bad happened.. call Viktor!";
	}

}
