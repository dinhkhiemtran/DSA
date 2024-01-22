package org.khiemtran.structures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class QueueTest {
  @Test
  @DisplayName("Add element")
  public void testAddElementIntoQueue() {
    Queue queue = new Queue(5);
    queue.add(1);
    queue.add(2);
    queue.add(3);
    queue.add(4);
    queue.add(5);
    queue.display();
    Assertions.assertEquals(5, queue.length());
  }

  @Test
  @DisplayName("Queue is Empty")
  public void testQueueEmpty() {
    Queue queue = new Queue(1);
    queue.add(1);
    queue.remove();
    queue.remove();
    Assertions.assertEquals(0, queue.length());
    queue.add(1);
    Assertions.assertEquals(1, queue.length());
    queue.display();
  }

  @Test
  @DisplayName("Queue is Full")
  public void testQueueFull() {
    Queue queue = new Queue(1);
    queue.add(1);
    queue.add(2);
    queue.add(3);
    Assertions.assertEquals(1, queue.length());
  }

  @Test
  @DisplayName("Remove element from queue")
  public void testRemoveElementFromQueue() {
    Queue queue = new Queue(3);
    queue.add(1);
    queue.add(2);
    queue.add(3);
    Assertions.assertEquals(1, queue.remove());
    Assertions.assertEquals(2, queue.length());
    queue.display();

    Assertions.assertEquals(2, queue.remove());
    Assertions.assertEquals(1, queue.length());
    queue.display();

    Assertions.assertEquals(3, queue.remove());
    Assertions.assertEquals(0, queue.length());
    queue.display();
  }
}