package com.amq.demo.util;

public class Counter {
	private static Integer count = 0;

	/**
	 * Gets the next.
	 *
	 * @return the next
	 */
	public static Integer getNext() {
		synchronized (count) {
			count++;
			return count;
		}
	}
}
