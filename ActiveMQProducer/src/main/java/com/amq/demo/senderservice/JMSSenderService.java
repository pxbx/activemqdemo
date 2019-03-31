/*
 * 
 */
package com.amq.demo.senderservice;

import com.amq.demo.object.QueueObject;


/**
 * The Interface JMSSenderService.
 */
public interface JMSSenderService {
	
	/**
	 * Send message.
	 *
	 * @param object the object
	 * @param queueName the queue name
	 */
	public void sendMessage(QueueObject object, String queueName);
}
