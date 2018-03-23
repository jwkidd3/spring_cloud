package com.vmware.rest;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/routes")
public class QueueResource {
	@Autowired
	private CamelContext ctx;

	@RequestMapping(value = "/q", method = RequestMethod.POST)
	private String queueRoute(@RequestBody String body) {
		ProducerTemplate template = ctx.createProducerTemplate();
		template.sendBody("direct:queueRoute", body);
		return "Q Route being Run....";
	}

}
