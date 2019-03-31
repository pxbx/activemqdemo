/*
 * 
 */
package com.amq.demo.configuration;

import javax.jms.ConnectionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;


/**
 * The Class ListenerConfiguration.
 */
@EnableJms
@Configuration
public class ListenerConfiguration {

	/** The connection factory. */
	@Autowired
	ConnectionFactory connectionFactory;

	/**
	 * Jms listener container factory.
	 *
	 * @return the default jms listener container factory
	 */
	@Bean
	public DefaultJmsListenerContainerFactory jmsListenerContainerFactory() {
		DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
		factory.setConnectionFactory(connectionFactory);
		factory.setConcurrency("1-1");
		return factory;
	}

}
