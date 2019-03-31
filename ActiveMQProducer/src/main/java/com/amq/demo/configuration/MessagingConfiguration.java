/*
 * 
 */
package com.amq.demo.configuration;

import org.apache.activemq.spring.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;


/**
 * The Class MessagingConfiguration.
 */
@Configuration
public class MessagingConfiguration {

	/** The application configuration. */
	@Autowired
	ApplicationConfiguration applicationConfiguration;

	/**
	 * Connection factory.
	 *
	 * @return the active MQ connection factory
	 */
	@Bean
	public ActiveMQConnectionFactory connectionFactory() {
		ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
		connectionFactory.setBrokerURL(applicationConfiguration.getBrokerURL());
		connectionFactory.setTrustAllPackages(true);
		return connectionFactory;
	}

	/**
	 * Jms template.
	 *
	 * @param queueName the queue name
	 * @return the jms template
	 */
	public JmsTemplate jmsTemplate(String queueName) {
		JmsTemplate template = new JmsTemplate();
		template.setConnectionFactory(connectionFactory());
		template.setDefaultDestinationName(queueName);
		return template;
	}

}
