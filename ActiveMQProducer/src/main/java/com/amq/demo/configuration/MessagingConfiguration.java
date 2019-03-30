package com.amq.demo.configuration;

import org.apache.activemq.spring.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;

@Configuration
public class MessagingConfiguration {

	@Autowired
	ApplicationConfiguration applicationConfiguration;

	@Bean
	public ActiveMQConnectionFactory connectionFactory() {
		ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
		connectionFactory.setBrokerURL(applicationConfiguration.getBrokerURL());
		connectionFactory.setTrustAllPackages(true);
		return connectionFactory;
	}

	public JmsTemplate jmsTemplate(String queueName) {
		JmsTemplate template = new JmsTemplate();
		template.setConnectionFactory(connectionFactory());
		template.setDefaultDestinationName(queueName);
		return template;
	}

}
