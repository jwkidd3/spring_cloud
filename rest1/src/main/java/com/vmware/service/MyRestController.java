package com.vmware.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

	@Autowired
	private ISvc client;

	@RequestMapping("/onegreet")
	public String m1() {
		return client.doGreet();
	}

}
