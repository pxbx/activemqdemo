/*
 * 
 */
package com.amq.demo.util;

import java.util.UUID;

import com.amq.demo.object.QueueObject;


/**
 * The Class ApplicationUtil.
 */
public class ApplicationUtil {

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	private static String getID() {
		return UUID.randomUUID().toString();
	}

	/**
	 * Creates the queue object.
	 *
	 * @return the queue object
	 */
	public static QueueObject createQueueObject() {
		QueueObject object = new QueueObject();
		object.setId(getID());
		object.setMessage("SOME MESSAGE");
		return object;
	}

}
