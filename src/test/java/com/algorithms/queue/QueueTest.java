package com.algorithms.queue;

import org.junit.Test;

import com.algorithms.queue.Queue;

import junit.framework.TestCase;

public class QueueTest extends TestCase {
	@Test
	public void testSize() {
		// Given
        String[] queueInitData = new String[]{"A", "B", "C"};
		Queue<String> queue = new Queue<String>(queueInitData);

		// When
		queue.enqueue("D");

		// Then
		assertEquals(queue.size(), 4);
	}
}
