package org.khiemtran.structures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StackTest {
  private Stack stack;

  @Test
  @DisplayName("Stack is full.")
  public void testPushWhenStackIsFull() {
    stack = new Stack(3);
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.display();
    Assertions.assertEquals(3, stack.getSize());
    Assertions.assertEquals(2, stack.getTop());
  }

  @Test
  @DisplayName("Stack push")
  public void testPush() {
    stack = new Stack(5);
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    Assertions.assertEquals(4, stack.getTop());
    Assertions.assertEquals(5, stack.getSize());
    stack.display();
  }

  @Test
  @DisplayName("Pop when stack is empty")
  public void testPopWhenStackIsEmpty() {
    stack = new Stack(1);
    stack.pop();
    Assertions.assertEquals(0, stack.getSize());
    Assertions.assertEquals(-1, stack.getTop());
    stack.display();
  }

  @Test
  @DisplayName("Pop")
  public void testPod() {
    stack = new Stack(5);
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.pop();
    Assertions.assertEquals(4, stack.getSize());
    Assertions.assertEquals(3, stack.getTop());
    stack.pop();
    Assertions.assertEquals(3, stack.getSize());
    Assertions.assertEquals(2, stack.getTop());
    stack.pop();
    Assertions.assertEquals(2, stack.getSize());
    Assertions.assertEquals(1, stack.getTop());
    stack.pop();
    Assertions.assertEquals(1, stack.getSize());
    Assertions.assertEquals(0, stack.getTop());
    stack.pop();
    Assertions.assertEquals(0, stack.getSize());
    Assertions.assertEquals(-1, stack.getTop());
  }
}