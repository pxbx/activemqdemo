/*
 * 
 */
package com.amq.demo.receiver;

import javax.jms.JMSException;

import org.springframework.messaging.Message;

import com.amq.demo.object.QueueObject;


/**
 * The Interface MessageReceiver.
 */
public interface MessageReceiver {

	/**
	 * Receive message.
	 *
	 * @param message the message
	 * @throws JMSException the JMS exception
	 */
	public void receiveMessage(final Message<QueueObject> message) throws JMSException;

}
