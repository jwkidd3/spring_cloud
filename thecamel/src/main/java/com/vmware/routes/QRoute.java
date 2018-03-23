package com.vmware.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class QRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		from("direct:queueRoute").
		 log(">>Queue Route Body: ${body}").
		 to("jms:queue:activemq/queue/bubba");
	}

}
