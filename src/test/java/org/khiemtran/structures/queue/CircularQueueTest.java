package org.khiemtran.structures.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CircularQueueTest {
  private CircularQueue circularQueue;

  @Test
  @DisplayName("Queue is full")
  public void testEnqueueFull() {
    circularQueue = new CircularQueue(1);
    circularQueue.enQueue(1);
    circularQueue.enQueue(2);
    circularQueue.display();
  }

  @Test
  @DisplayName("Test enqueue")
  public void testEnqueue() {
    circularQueue = new CircularQueue(5);
    circularQueue.enQueue(1);
    circularQueue.enQueue(2);
    circularQueue.enQueue(3);
    circularQueue.enQueue(4);
    circularQueue.enQueue(5);
    circularQueue.display();
    Assertions.assertEquals(0, circularQueue.getFront());
    Assertions.assertEquals(4, circularQueue.getRear());
  }

  @Test
  @DisplayName("Test Deque empty")
  public void testDequeueEmpty() {
    circularQueue = new CircularQueue(1);
    circularQueue.deQueue();
    circularQueue.deQueue();
    circularQueue.display();
    Assertions.assertEquals(-1, circularQueue.getFront());
    Assertions.assertEquals(-1, circularQueue.getRear());
  }

  @Test
  @DisplayName("Test Dequeue")
  public void testDequeue() {
    circularQueue = new CircularQueue(5);
    circularQueue.enQueue(1);
    circularQueue.enQueue(2);
    Assertions.assertEquals(1, circularQueue.deQueue());
    Assertions.assertEquals(1, circularQueue.getFront());
    Assertions.assertEquals(1, circularQueue.getRear());
    circularQueue.enQueue(2);
    circularQueue.enQueue(3);
    circularQueue.enQueue(4);
    circularQueue.enQueue(5);
    Assertions.assertEquals(2, circularQueue.deQueue());
    Assertions.assertEquals(2, circularQueue.deQueue());
    Assertions.assertEquals(3, circularQueue.deQueue());
    Assertions.assertEquals(4, circularQueue.getFront());
    Assertions.assertEquals(4, circularQueue.getFront());
    circularQueue.deQueue();
    circularQueue.deQueue();
    circularQueue.display();
  }
}