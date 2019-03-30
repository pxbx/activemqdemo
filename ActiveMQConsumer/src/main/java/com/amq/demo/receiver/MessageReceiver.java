package com.amq.demo.receiver;

import javax.jms.JMSException;

import org.springframework.messaging.Message;

import com.amq.demo.object.QueueObject;

public interface MessageReceiver {

	public void receiveMessage(final Message<QueueObject> message) throws JMSException;

}
