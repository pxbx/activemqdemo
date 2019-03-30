package com.amq.demo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jms.annotation.EnableJms;

@EnableJms
@SpringBootApplication
@ComponentScan(basePackages = { "com.amq.demo.*" })
public class ProducerApplication {

	private static Class<ProducerApplication> producerApplication = ProducerApplication.class;

	public static void main(String[] args) {
		SpringApplication.run(producerApplication, args);
	}

}
