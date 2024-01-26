package org.khiemtran.structures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DoublyLinkedListTest {
  @Test
  @Tag("task1")
  @DisplayName("Add Element")
  public void testAddElement() {
    DoublyLinkedList linkedList = new DoublyLinkedList();
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);
    linkedList.add(4);
    linkedList.add(5);
    linkedList.display();
    Assertions.assertEquals(5, linkedList.length());
    Assertions.assertEquals(1, linkedList.getHead().getData());
    Assertions.assertEquals(5, linkedList.getTail().getData());
  }

  @Test
  @Tag("task2")
  @DisplayName("Insert Head Node")
  public void testInert() {
    DoublyLinkedList linkedList = new DoublyLinkedList();
    linkedList.add(1);
    linkedList.add(2);
    linkedList.insertHeadNode(0);
    linkedList.display();
    Assertions.assertEquals(0, linkedList.getHead().getData());
    Assertions.assertEquals(3, linkedList.length());
  }

  @Test
  @Tag("task3")
  @DisplayName("Insert")
  public void testEmpty() {
    DoublyLinkedList linkedList = new DoublyLinkedList();
    linkedList.insertHeadNode(1);
    linkedList.display();
    Assertions.assertEquals(1, linkedList.getHead().getData());
    Assertions.assertEquals(1, linkedList.getTail().getData());
    Assertions.assertEquals(1, linkedList.length());
  }

  @Test
  @Tag("task4")
  @DisplayName("Insert")
  public void testInsert() {
    DoublyLinkedList linkedList = new DoublyLinkedList();
    linkedList.add(1);
    linkedList.add(5);
    linkedList.insert(2, 1);
    linkedList.insert(3, 2);
    linkedList.insert(4, 3);
    linkedList.display();
    Assertions.assertEquals(5, linkedList.length());
    Assertions.assertEquals(1, linkedList.getHead().getData());
    Assertions.assertEquals(5, linkedList.getTail().getData());
  }

  @Test
  @Tag("task5")
  @DisplayName("Index out of scope")
  public void testInsertWhenDLLEmpty() {
    DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
    doublyLinkedList.insert(1, 0);
    doublyLinkedList.display();
    Assertions.assertEquals(1, doublyLinkedList.getHead().getData());
    Assertions.assertEquals(1, doublyLinkedList.getTail().getData());
    Assertions.assertEquals(1, doublyLinkedList.length());
  }

  @Test
  @Tag("task6")
  @DisplayName("Insert out of size")
  public void testInsertOutOfSize() {
    DoublyLinkedList linkedList = new DoublyLinkedList();
    linkedList.add(1);
    linkedList.add(2);
    linkedList.insert(3, 3);
    linkedList.display();
  }

  @Test
  @Tag("task6")
  @DisplayName("Remove")
  public void testRemove() {
    DoublyLinkedList linkedList = new DoublyLinkedList();
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);
    linkedList.add(4);
    linkedList.add(5);
    Assertions.assertEquals(5, linkedList.remove());
    Assertions.assertEquals(4, linkedList.getTail().getData());
    Assertions.assertEquals(4, linkedList.remove());
    Assertions.assertEquals(3, linkedList.getTail().getData());
    Assertions.assertEquals(3, linkedList.remove());
    Assertions.assertEquals(2, linkedList.getTail().getData());
    Assertions.assertEquals(2, linkedList.remove());
    linkedList.display();
  }

  @Test
  @Tag("task7")
  @DisplayName("Remove when empty")
  public void testRemoveWhenDLLEmpty() {
    DoublyLinkedList linkedList = new DoublyLinkedList();
    Assertions.assertEquals(-1, linkedList.remove());
    Assertions.assertNull(linkedList.getTail());
    Assertions.assertNull(linkedList.getHead());
  }

  @Test
  @Tag("task8")
  @DisplayName("Remove Head Node")
  public void removeHeadNode() {
    DoublyLinkedList linkedList = new DoublyLinkedList();
    linkedList.add(0);
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);
    linkedList.add(4);
    linkedList.add(5);
    Assertions.assertEquals(0, linkedList.removeHead());
    Assertions.assertEquals(1, linkedList.getHead().getData());
    Assertions.assertNull(linkedList.getHead().getPrev());
    Assertions.assertEquals(2, linkedList.getHead().getNext().getData());
    Assertions.assertEquals(5, linkedList.length());
  }

  @Test
  @Tag("task9")
  @DisplayName("Remove Head when DLL empty")
  public void testRemoveHeadWhenDLLEmpty() {
    DoublyLinkedList linkedList = new DoublyLinkedList();
    Assertions.assertEquals(-1, linkedList.removeHead());
    Assertions.assertNull(linkedList.getHead());
    Assertions.assertNull(linkedList.getTail());
  }

  @Test
  @Tag("task10")
  @DisplayName("Remove Head when only an element")
  public void testRemoveHeadOnlyElement() {
    DoublyLinkedList linkedList = new DoublyLinkedList();
    linkedList.add(1);
    Assertions.assertEquals(1, linkedList.removeHead());
    Assertions.assertNull(linkedList.getTail());
    Assertions.assertNull(linkedList.getHead());
    Assertions.assertEquals(0, linkedList.length());
  }

  @Test
  @Tag("task11")
  @DisplayName("Remove at index")
  public void testRemoveAtIndex() {
    DoublyLinkedList linkedList = new DoublyLinkedList();
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);
    linkedList.add(4);
    linkedList.add(5);
    Assertions.assertEquals(2, linkedList.removeAtIndex(1));
    linkedList.display();
    Assertions.assertEquals(4, linkedList.length());
    Assertions.assertEquals(3, linkedList.getHead().getNext().getData());
  }

  @Test
  @Tag("task12")
  @DisplayName("Remove element when DLL empty")
  public void testRemoveElementWhenDLLEmpty() {
    DoublyLinkedList linkedList = new DoublyLinkedList();
    Assertions.assertEquals(-1, linkedList.removeAtIndex(1));
    Assertions.assertNull(linkedList.getHead());
    Assertions.assertNull(linkedList.getTail());
  }

  @Test
  @Tag("task13")
  @DisplayName("remove element when index = 0")
  public void testRemoveElementIndexZero() {
    DoublyLinkedList linkedList = new DoublyLinkedList();
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);
    Assertions.assertEquals(1, linkedList.removeAtIndex(0));
    Assertions.assertEquals(2, linkedList.getHead().getData());
    Assertions.assertEquals(3, linkedList.getTail().getData());
  }
}