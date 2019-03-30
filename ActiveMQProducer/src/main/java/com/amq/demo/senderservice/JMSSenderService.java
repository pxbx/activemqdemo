package com.amq.demo.senderservice;

import com.amq.demo.object.QueueObject;

public interface JMSSenderService {
	public void sendMessage(QueueObject object, String queueName);
}
