package com.amq.demo.listeners;

import javax.jms.JMSException;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import com.amq.demo.object.QueueObject;
import com.amq.demo.receiver.MessageReceiver;

@Component
public class Queue01Receiver implements MessageReceiver {

	@Override
	@JmsListener(destination = "demo1")
	public void receiveMessage(Message<QueueObject> message) throws JMSException {
		QueueObject object = message.getPayload();
		System.out.println("MESSAGE RECEIVED -> " + object);
	}
}
