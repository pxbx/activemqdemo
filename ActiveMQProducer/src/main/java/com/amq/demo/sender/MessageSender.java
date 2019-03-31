/*
 * 
 */
package com.amq.demo.sender;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import com.amq.demo.configuration.MessagingConfiguration;
import com.amq.demo.object.QueueObject;

/**
 * The Class MessageSender.
 */
@Component
public class MessageSender {

	/** The messaging configuration. */
	@Autowired
	MessagingConfiguration messagingConfiguration;

	/**
	 * Send message.
	 *
	 * @param object    the object
	 * @param queueName the queue name
	 */
	public void sendMessage(final QueueObject object, final String queueName) {
		messagingConfiguration.jmsTemplate(queueName).send(new MessageCreator() {
			@Override
			public Message createMessage(Session session) throws JMSException {
				ObjectMessage objectMessage = session.createObjectMessage(object);
				return objectMessage;
			}
		});
	}

}
