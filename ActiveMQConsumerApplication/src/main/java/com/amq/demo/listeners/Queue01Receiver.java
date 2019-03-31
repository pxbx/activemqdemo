/*
 * 
 */
package com.amq.demo.listeners;

import javax.jms.JMSException;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import com.amq.demo.object.QueueObject;
import com.amq.demo.receiver.MessageReceiver;


/**
 * The Class Queue01Receiver.
 */
@Component
public class Queue01Receiver implements MessageReceiver {

	/* (non-Javadoc)
	 * @see com.amq.demo.receiver.MessageReceiver#receiveMessage(org.springframework.messaging.Message)
	 */
	@Override
	@JmsListener(destination = "demo1")
	public void receiveMessage(Message<QueueObject> message) throws JMSException {
		QueueObject object = message.getPayload();
		System.out.println("MESSAGE RECEIVED FROM demo1 -> " + object);
	}
}
