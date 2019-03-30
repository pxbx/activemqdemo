package com.amq.demo.senderservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amq.demo.object.QueueObject;
import com.amq.demo.sender.MessageSender;

@Service
public class JMSSenderServiceImpl implements JMSSenderService {

	@Autowired
	MessageSender messageSender;

	@Override
	public void sendMessage(QueueObject object, String queueName) {
		messageSender.sendMessage(object, queueName);
	}

}
