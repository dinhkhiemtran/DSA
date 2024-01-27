package org.khiemtran.structures.linked_list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.khiemtran.structures.linked_list.SingleLinkedList;

class SingleLinkedListTest {
  @Test
  @DisplayName("Length")
  public void testLength() {
    SingleLinkedList singleLinkedList = new SingleLinkedList();
    Assertions.assertEquals(0, singleLinkedList.length());
    singleLinkedList.add(1);
    singleLinkedList.display();
    Assertions.assertEquals(1, singleLinkedList.length());
  }

  @Test
  @DisplayName("Peak")
  public void testPeak() {
    SingleLinkedList linkedList = new SingleLinkedList();
    linkedList.add(1);
    linkedList.add(2);
    Assertions.assertEquals(1, linkedList.peak().getData());
  }

  @Test
  @DisplayName("Add elements")
  public void testAddElementIntoSingleLinkedList() {
    SingleLinkedList linkedList = new SingleLinkedList();
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);
    linkedList.add(4);
    linkedList.add(5);
    Assertions.assertEquals(5, linkedList.length());
    linkedList.display();
  }

  @Test
  @DisplayName("Insert elements")
  public void testInsertElements() {
    SingleLinkedList singleLinkedList = new SingleLinkedList();
    singleLinkedList.add(1);
    singleLinkedList.add(5);
    singleLinkedList.insert(2,1);
    singleLinkedList.insert(3,2);
    singleLinkedList.insert(4,3);
    singleLinkedList.insert(6, 5);
    Assertions.assertEquals(6, singleLinkedList.length());
    singleLinkedList.display();
  }

  @Test
  @DisplayName("Insert Head")
  public void testInsertHead() {
    SingleLinkedList linkedList = new SingleLinkedList();
    linkedList.add(2);
    linkedList.insertHead(1);
    Assertions.assertEquals(2, linkedList.length());
    linkedList.display();
  }

  @Test
  @DisplayName("Remove last element")
  public void testRemoveLastNode() {
    SingleLinkedList singleLinkedList = new SingleLinkedList();
    singleLinkedList.add(1);
    singleLinkedList.add(2);
    singleLinkedList.add(3);
    Assertions.assertEquals(3, singleLinkedList.removeLastNode());
    singleLinkedList.display();
    Assertions.assertEquals(2, singleLinkedList.removeLastNode());
    singleLinkedList.display();
    Assertions.assertEquals(1, singleLinkedList.removeLastNode());
    singleLinkedList.display();
    Assertions.assertEquals(-1, singleLinkedList.removeLastNode());
    singleLinkedList.display();
  }

  @Test
  @DisplayName("Remove first element")
  public void testRemoveFirstNode() {
    SingleLinkedList linkedList = new SingleLinkedList();
    linkedList.add(1);
    linkedList.add(2);
    Assertions.assertEquals(1, linkedList.removeFirstNode());
    linkedList.display();
    Assertions.assertEquals(2, linkedList.removeFirstNode());
    linkedList.display();
    Assertions.assertEquals(-1, linkedList.removeFirstNode());
    linkedList.display();
  }

  @Test
  @DisplayName("Remove at index")
  public void testRemoveAtIndex() {
    SingleLinkedList linkedList = new SingleLinkedList();
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);
    linkedList.add(4);
    linkedList.add(5);
    System.out.println(linkedList.length());
    Assertions.assertEquals(4, linkedList.removeAtIndex(3));
    linkedList.display();
    Assertions.assertEquals(2, linkedList.removeAtIndex(1));
    linkedList.display();
    Assertions.assertEquals(3, linkedList.removeAtIndex(1));
    linkedList.display();
    Assertions.assertEquals(5, linkedList.removeAtIndex(1));
    linkedList.display();
    Assertions.assertEquals(1, linkedList.removeAtIndex(0));
    linkedList.display();
    linkedList.add(1);
    Assertions.assertEquals(-1, linkedList.removeAtIndex(6));
    Assertions.assertEquals(1, linkedList.removeAtIndex(0));
    Assertions.assertEquals(-1, linkedList.removeAtIndex(1));
  }
}