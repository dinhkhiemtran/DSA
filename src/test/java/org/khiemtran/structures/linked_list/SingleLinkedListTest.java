package org.khiemtran.structures.linked_list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SingleLinkedListTest {
  private SingleLinkedList singleLinkedList;

  @Test
  public void testEmpty() {
    singleLinkedList = new SingleLinkedList();
    singleLinkedList.display();
    Assertions.assertEquals(0, singleLinkedList.getSize());
  }

  @Test
  public void testAddElementWhenLinkedListEmpty() {
    singleLinkedList = new SingleLinkedList();
    singleLinkedList.add(1);
    singleLinkedList.display();
    Assertions.assertEquals(1, singleLinkedList.getHead().getData());
    Assertions.assertEquals(1, singleLinkedList.getSize());
  }

  @Test
  public void testAddElementWhenLinkedListNotEmpty() {
    singleLinkedList = new SingleLinkedList();
    singleLinkedList.add(1);
    singleLinkedList.add(2);
    singleLinkedList.add(3);
    singleLinkedList.display();
    Assertions.assertEquals(1, singleLinkedList.getHead().getData());
    Assertions.assertEquals(2, singleLinkedList.getHead().getNext().getData());
    Assertions.assertEquals(3, singleLinkedList.getHead().getNext().getNext().getData());
    Assertions.assertEquals(3, singleLinkedList.getSize());
  }

  @Test
  public void testAddHeadWhenEmpty() {
    singleLinkedList = new SingleLinkedList();
    singleLinkedList.addHead(1);
    Assertions.assertEquals(1, singleLinkedList.getHead().getData());
    Assertions.assertEquals(1, singleLinkedList.getSize());
  }

  @Test
  public void testAddHeadNotEmpty() {
    singleLinkedList = new SingleLinkedList();
    singleLinkedList.addHead(3);
    singleLinkedList.addHead(2);
    singleLinkedList.addHead(1);
    singleLinkedList.addHead(0);
    singleLinkedList.display();
    Assertions.assertEquals(0, singleLinkedList.getHead().getData());
    Assertions.assertEquals(1, singleLinkedList.getHead().getNext().getData());
    Assertions.assertEquals(2, singleLinkedList.getHead().getNext().getNext().getData());
    Assertions.assertEquals(3, singleLinkedList.getHead().getNext().getNext().getNext().getData());
    Assertions.assertEquals(4, singleLinkedList.getSize());
  }

  @Test
  public void testInsertEmpty() {
    singleLinkedList = new SingleLinkedList();
    singleLinkedList.insert(1, 0);
    Assertions.assertEquals(1, singleLinkedList.getHead().getData());
    Assertions.assertEquals(1, singleLinkedList.getSize());
  }

  @Test
  public void testInsetEqualSize() {
    singleLinkedList = new SingleLinkedList();
    singleLinkedList.add(1);
    singleLinkedList.add(2);
    singleLinkedList.insert(3, 2);
    Assertions.assertEquals(3, singleLinkedList.getHead().getNext().getNext().getData());
    Assertions.assertEquals(3, singleLinkedList.getSize());
  }

  @Test
  public void testInsetIndexZero() {
    singleLinkedList = new SingleLinkedList();
    singleLinkedList.add(1);
    singleLinkedList.add(2);
    singleLinkedList.insert(0, 0);
    Assertions.assertEquals(0, singleLinkedList.getHead().getData());
    Assertions.assertEquals(3, singleLinkedList.getSize());
  }

  @Test
  public void testInsert() {
    singleLinkedList = new SingleLinkedList();
    singleLinkedList.add(0);
    singleLinkedList.add(5);
    singleLinkedList.insert(1,1);
    singleLinkedList.insert(2,2);
    singleLinkedList.insert(3,3);
    singleLinkedList.insert(4,4);
    singleLinkedList.display();
    Assertions.assertEquals(0, singleLinkedList.getHead().getData());
    Assertions.assertEquals(1, singleLinkedList.getHead().getNext().getData());
    Assertions.assertEquals(2, singleLinkedList.getHead().getNext().getNext().getData());
    Assertions.assertEquals(3, singleLinkedList.getHead().getNext().getNext().getNext().getData());
    Assertions.assertEquals(4, singleLinkedList.getHead().getNext().getNext().getNext().getNext().getData());
    Assertions.assertEquals(5, singleLinkedList.getHead().getNext().getNext().getNext().getNext().getNext().getData());
    Assertions.assertEquals(6, singleLinkedList.getSize());
  }

  @Test
  public void testRemoveLinkedListEmpty() {
    singleLinkedList = new SingleLinkedList();
    Assertions.assertEquals(-1, singleLinkedList.remove());
    Assertions.assertEquals(0, singleLinkedList.getSize());
  }

  @Test
  public void testRemove() {
    singleLinkedList = new SingleLinkedList();
    singleLinkedList.add(1);
    singleLinkedList.add(2);
    singleLinkedList.add(3);
    singleLinkedList.add(4);
    singleLinkedList.add(5);
    Assertions.assertEquals(5, singleLinkedList.remove());
    Assertions.assertEquals(4, singleLinkedList.getSize());
    Assertions.assertEquals(4, singleLinkedList.remove());
    Assertions.assertEquals(3, singleLinkedList.getSize());
    Assertions.assertEquals(3, singleLinkedList.remove());
    Assertions.assertEquals(2, singleLinkedList.getSize());
    Assertions.assertEquals(2, singleLinkedList.remove());
    Assertions.assertEquals(1, singleLinkedList.getSize());
    Assertions.assertEquals(1, singleLinkedList.remove());
    Assertions.assertEquals(0, singleLinkedList.getSize());
    singleLinkedList.display();
  }

  @Test
  public void testRemoveHeadWhenLinkedListEmpty() {
    singleLinkedList = new SingleLinkedList();
    Assertions.assertEquals(-1, singleLinkedList.removeHead());
    Assertions.assertEquals(0, singleLinkedList.getSize());
  }

  @Test
  public void testRemoveHead() {
    singleLinkedList = new SingleLinkedList();
    singleLinkedList.add(1);
    singleLinkedList.add(2);
    singleLinkedList.add(3);
    singleLinkedList.add(4);
    singleLinkedList.add(5);
    Assertions.assertEquals(1, singleLinkedList.removeHead());
    Assertions.assertEquals(4, singleLinkedList.getSize());
    Assertions.assertEquals(2, singleLinkedList.removeHead());
    Assertions.assertEquals(3, singleLinkedList.getSize());
    Assertions.assertEquals(3, singleLinkedList.removeHead());
    Assertions.assertEquals(2, singleLinkedList.getSize());
    Assertions.assertEquals(4, singleLinkedList.removeHead());
    Assertions.assertEquals(1, singleLinkedList.getSize());
    Assertions.assertEquals(5, singleLinkedList.removeHead());
    Assertions.assertEquals(0, singleLinkedList.getSize());
  }

  @Test
  public void testRemoveIndexWhenLinkedListEmpty() {
    singleLinkedList = new SingleLinkedList();
    Assertions.assertEquals(-1, singleLinkedList.removeIndex(2));
    Assertions.assertEquals(0, singleLinkedList.getSize());
  }

  @Test
  public void testRemoveIndexAtZero() {
    singleLinkedList = new SingleLinkedList();
    singleLinkedList.add(1);
    Assertions.assertEquals(1, singleLinkedList.removeIndex(0));
    Assertions.assertEquals(0, singleLinkedList.getSize());
  }

  @Test
  public void testRemoveIndex() {
    singleLinkedList = new SingleLinkedList();
    singleLinkedList.add(1);
    singleLinkedList.add(2);
    singleLinkedList.add(3);
    singleLinkedList.add(4);
    singleLinkedList.add(5);
    Assertions.assertEquals(2, singleLinkedList.removeIndex(1));
    Assertions.assertEquals(4, singleLinkedList.getSize());
    Assertions.assertEquals(4, singleLinkedList.removeIndex(2));
    Assertions.assertEquals(3, singleLinkedList.getSize());
    Assertions.assertEquals(3, singleLinkedList.removeIndex(1));
    Assertions.assertEquals(2, singleLinkedList.getSize());
    Assertions.assertEquals(5, singleLinkedList.removeIndex(1));
    Assertions.assertEquals(1, singleLinkedList.getSize());
    Assertions.assertEquals(1, singleLinkedList.removeIndex(0));
    Assertions.assertEquals(0, singleLinkedList.getSize());
  }
}