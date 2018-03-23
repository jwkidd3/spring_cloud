package com.vmware.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServiceImpl implements IService {
	@Value("${greeting.value}")
	private String msg;

	@Value("${server.port}")
	private String port;

	@Override
	public String getGreeting() {
		return msg + "-> " + port;
	}

}