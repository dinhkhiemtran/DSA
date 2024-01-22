package org.khiemtran.structures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
  @Test
  @DisplayName("Push element")
  public void testPushElement() {
    Stack stack = new Stack(5);
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.display();
    Assertions.assertEquals(5, stack.length());
  }

  @Test
  @DisplayName("Test Stack empty")
  public void testStackEmpty() {
    Stack stack = new Stack(5);
    stack.pop();
    Assertions.assertEquals(0, stack.length());
  }

  @Test
  @DisplayName("Test pop")
  public void testStackPop() {
    Stack stack = new Stack(5);
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.pop();
    stack.display();
    Assertions.assertEquals(4, stack.length());
    int actual = stack.pop();
    Assertions.assertEquals(4, actual);
    stack.display();
    Assertions.assertEquals(3, stack.length());
    stack.pop();
    stack.display();
    Assertions.assertEquals(2, stack.length());
    stack.pop();
    stack.display();
    Assertions.assertEquals(1, stack.length());
    stack.pop();
    stack.display();
    Assertions.assertEquals(0, stack.length());
  }

  @Test
  @DisplayName("Test Stack is Full")
  public void testStackFull() {
    Stack stack = new Stack(1);
    stack.push(1);
    stack.push(2);
    Assertions.assertEquals(1, stack.length());
  }
}