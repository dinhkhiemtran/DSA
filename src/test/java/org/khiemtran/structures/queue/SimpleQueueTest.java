package org.khiemtran.structures.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.khiemtran.structures.queue.SimpleQueue;

class SimpleQueueTest {
  private SimpleQueue simpleQueue;
  @Test
  public void testQueueFull() {
    simpleQueue = new SimpleQueue(1);
    simpleQueue.enQueue(1);
    simpleQueue.enQueue(2);
    Assertions.assertEquals(1, simpleQueue.getSize());
    Assertions.assertEquals(0, simpleQueue.getFront());
    Assertions.assertEquals(0, simpleQueue.getRear());
    simpleQueue.display();
  }

  @Test
  public void testAdd() {
    simpleQueue = new SimpleQueue(5);
    simpleQueue.enQueue(1);
    simpleQueue.enQueue(2);
    simpleQueue.enQueue(3);
    simpleQueue.enQueue(4);
    simpleQueue.enQueue(5);
    Assertions.assertEquals(5, simpleQueue.getSize());
    Assertions.assertEquals(0, simpleQueue.getFront());
    Assertions.assertEquals(4, simpleQueue.getRear());
    simpleQueue.display();
  }

  @Test
  public void testDeleteWhenQueueEmpty() {
    simpleQueue = new SimpleQueue(1);
    simpleQueue.enQueue(1);
    simpleQueue.deQueue();
    simpleQueue.deQueue();
    Assertions.assertEquals(0, simpleQueue.getSize());
    Assertions.assertEquals(-1, simpleQueue.getRear());
    Assertions.assertEquals(-1, simpleQueue.getFront());
    simpleQueue.display();
  }

  @Test
  public void testDelete() {
    simpleQueue = new SimpleQueue(5);
    simpleQueue.enQueue(1);
    simpleQueue.enQueue(2);
    simpleQueue.enQueue(3);
    simpleQueue.enQueue(4);
    simpleQueue.enQueue(5);
    simpleQueue.display();
    simpleQueue.deQueue();
    Assertions.assertEquals(4, simpleQueue.getSize());
    Assertions.assertEquals(1, simpleQueue.getFront());
    Assertions.assertEquals(4, simpleQueue.getRear());
    simpleQueue.display();
    simpleQueue.deQueue();
    Assertions.assertEquals(3, simpleQueue.getSize());
    Assertions.assertEquals(2, simpleQueue.getFront());
    Assertions.assertEquals(4, simpleQueue.getRear());
    simpleQueue.display();
    simpleQueue.deQueue();
    Assertions.assertEquals(2, simpleQueue.getSize());
    Assertions.assertEquals(3, simpleQueue.getFront());
    Assertions.assertEquals(4, simpleQueue.getRear());
    simpleQueue.display();
    simpleQueue.deQueue();
    Assertions.assertEquals(1, simpleQueue.getSize());
    Assertions.assertEquals(4, simpleQueue.getFront());
    Assertions.assertEquals(4, simpleQueue.getRear());
    simpleQueue.display();
    simpleQueue.deQueue();
    Assertions.assertEquals(0, simpleQueue.getSize());
    Assertions.assertEquals(-1, simpleQueue.getFront());
    Assertions.assertEquals(-1, simpleQueue.getFront());
  }
}