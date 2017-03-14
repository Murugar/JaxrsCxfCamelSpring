package com.iqmsoft.camel.spring.rs.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.ProducerTemplate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExampleProcessor implements Processor {


	public void process(Exchange exchange) throws Exception {
		log.debug(exchange.getIn().toString());
		exchange.getIn().setBody("Hello");

	}
}
