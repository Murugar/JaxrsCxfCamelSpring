package com.iqmsoft.camel.spring.rs.routes;

import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

import com.iqmsoft.camel.spring.rs.processor.ExampleProcessor;



import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Routes extends RouteBuilder {

	
	private Processor exproc = new ExampleProcessor();
	
	
	
	@Override
	public void configure() throws Exception {
		
		from("cxfrs:bean:jaxRsServer").process(exproc).setBody(constant("Success"));
		
	}
	
	
	
}
