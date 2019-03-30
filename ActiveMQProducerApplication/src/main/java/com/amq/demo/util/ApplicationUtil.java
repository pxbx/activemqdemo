package com.amq.demo.util;

import java.util.UUID;

import com.amq.demo.object.QueueObject;

public class ApplicationUtil {

	private static String getID() {
		return UUID.randomUUID().toString();
	}

	public static QueueObject createQueueObject() {
		QueueObject object = new QueueObject();
		object.setId(getID());
		object.setMessage("SOME MESSAGE");
		return object;
	}

}
