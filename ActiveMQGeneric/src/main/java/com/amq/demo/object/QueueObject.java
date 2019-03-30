package com.amq.demo.object;

import java.io.Serializable;

public class QueueObject implements Serializable {

	@Override
	public String toString() {
		return "QueueObject [id=" + id + ", message=" + message + "]";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 5932675593675763995L;

	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	private Object message;

	public Object getMessage() {
		return message;
	}

	public void setMessage(Object message) {
		this.message = message;
	}

}
