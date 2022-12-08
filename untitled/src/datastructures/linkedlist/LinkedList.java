package datastructures.linkedlist;

public class LinkedList {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void insertAtBeginning(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void insertAfter(Node prev, int data) {
        if (prev == null) {
            System.out.println("The given previous node can not be null.");
        } else {
            Node node = new Node(data);
            node.next = prev.next;
            prev.next = node;
        }
    }

    public void insertAtEnd(int new_data) {
        Node new_node = new Node(new_data);

        if (head == null) {
            head = new Node(new_data);
            return;
        }

        new_node.next = null;

        Node last = head;
        while (last.next != null)
            last = last.next;

        last.next = new_node;
    }

    // Print the linked list
    public void deleteNode(int position) {
        if (head == null) {
            System.out.println("Null.");
        } else {
            Node temp = head;
            if (position == 0) {
                head = temp.next;
            }
            //Find the key to be deleted
            for (int i = 0; temp != null && i < position - 1; i++) {
                temp = temp.next;
            }
            if (temp == null || temp.next == null) {
                System.out.println("Null.");
            }
            Node next = temp.next.next;

            temp.next = next;
        }
    }

    public boolean search(Node head, int elements) {
        Node current = head;
        while (current != null) {
            if (current.data == elements) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void sortLinkedList(Node head) {
        Node current = head;
        Node index = null;
        int temp;

        if (head == null) {
            return;
        } else {
            while (current != null) {
                // index points to the node next to current
                index = current.next;

                while (index != null) {
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    public void printList() {
        Node node = head;
        System.out.print("Linked list-> ");
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insertAtEnd(1);
        linkedList.insertAtBeginning(2);
        linkedList.insertAtBeginning(3);
        linkedList.insertAtEnd(4);
        linkedList.insertAfter(linkedList.head.next, 5);
        linkedList.printList();
        linkedList.deleteNode(0);
        linkedList.printList();
        System.out.println(linkedList.search(linkedList.head, 2));
        linkedList.sortLinkedList(linkedList.head);
        linkedList.printList();
    }
}
