package org.khiemtran.structures.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CircularQueueTest {
  private CircularQueue circularQueue;
  @Test
  public void testCircularFull() {
    circularQueue = new CircularQueue(1);
    circularQueue.enQueue(1);
    circularQueue.enQueue(2);
    Assertions.assertEquals(0, circularQueue.getFront());
    Assertions.assertEquals(0, circularQueue.getRear());
    Assertions.assertEquals(1, circularQueue.getSize());
  }

  @Test
  public void testEnqueue() {
    circularQueue = new CircularQueue(5);
    circularQueue.enQueue(1);
    circularQueue.enQueue(2);
    circularQueue.enQueue(3);
    circularQueue.enQueue(4);
    circularQueue.enQueue(5);
    Assertions.assertEquals(5, circularQueue.getSize());
    Assertions.assertEquals(0, circularQueue.getFront());
    Assertions.assertEquals(4, circularQueue.getRear());
    circularQueue.display();
  }

  @Test
  public void testEmptyQueue() {
    circularQueue = new CircularQueue(1);
    circularQueue.deQueue();
    circularQueue.deQueue();
    Assertions.assertEquals(-1, circularQueue.getRear());
    Assertions.assertEquals(-1, circularQueue.getFront());
    Assertions.assertEquals(0, circularQueue.getSize());
  }

  @Test
  public void testDequeue() {
    circularQueue = new CircularQueue(5);
    circularQueue.enQueue(1);
    circularQueue.enQueue(2);
    circularQueue.enQueue(3);
    circularQueue.enQueue(4);
    circularQueue.enQueue(5);
    circularQueue.deQueue();
    Assertions.assertEquals(4, circularQueue.getSize());
    Assertions.assertEquals(1, circularQueue.getFront());
    Assertions.assertEquals(4, circularQueue.getRear());
    circularQueue.deQueue();
    Assertions.assertEquals(3, circularQueue.getSize());
    Assertions.assertEquals(2, circularQueue.getFront());
    Assertions.assertEquals(4, circularQueue.getRear());
    circularQueue.deQueue();
    Assertions.assertEquals(2, circularQueue.getSize());
    Assertions.assertEquals(3, circularQueue.getFront());
    Assertions.assertEquals(3, circularQueue.getFront());
    circularQueue.deQueue();
    Assertions.assertEquals(1, circularQueue.getSize());
    Assertions.assertEquals(4, circularQueue.getFront());
    Assertions.assertEquals(4, circularQueue.getRear());
    circularQueue.deQueue();
    Assertions.assertEquals(0, circularQueue.getSize());
    Assertions.assertEquals(-1, circularQueue.getFront());
    Assertions.assertEquals(-1, circularQueue.getRear());
  }
}