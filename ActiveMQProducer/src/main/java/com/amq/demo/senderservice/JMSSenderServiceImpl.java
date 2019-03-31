/*
 * 
 */
package com.amq.demo.senderservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amq.demo.object.QueueObject;
import com.amq.demo.sender.MessageSender;


/**
 * The Class JMSSenderServiceImpl.
 */
@Service
public class JMSSenderServiceImpl implements JMSSenderService {

	/** The message sender. */
	@Autowired
	MessageSender messageSender;

	/* (non-Javadoc)
	 * @see com.amq.demo.senderservice.JMSSenderService#sendMessage(com.amq.demo.object.QueueObject, java.lang.String)
	 */
	@Override
	public void sendMessage(QueueObject object, String queueName) {
		messageSender.sendMessage(object, queueName);
	}

}
