/*
 * 
 */
package com.amq.demo.object;

import java.io.Serializable;


// TODO: Auto-generated Javadoc
/**
 * The Class QueueObject.
 */
public class QueueObject implements Serializable {

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "QueueObject [id=" + id + ", message=" + message + "]";
	}

	/**
	 * Instantiates a new queue object.
	 *
	 * @param id the id
	 * @param message the message
	 */
	public QueueObject(String id, Object message) {
		super();
		this.id = id;
		this.message = message;
	}

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 5932675593675763995L;

	/** The id. */
	private String id;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/** The message. */
	private Object message;

	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	public Object getMessage() {
		return message;
	}

	/**
	 * Sets the message.
	 *
	 * @param message the new message
	 */
	public void setMessage(Object message) {
		this.message = message;
	}

}
