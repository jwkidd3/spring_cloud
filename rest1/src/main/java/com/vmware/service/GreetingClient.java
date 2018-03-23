package com.vmware.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("api-gateway")
public interface GreetingClient {
	@RequestMapping("/api/greet")
	public String greet();
}
