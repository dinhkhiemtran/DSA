package datastructures;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Queue {

    private static Scanner scanner = new Scanner(System.in);

    private int front;

    private int rear;

    private int CAPACITY;

    private String[] items;

    public Queue(int size) {
        this.front = -1;
        this.rear = -1;
        this.CAPACITY = size;
        this.items = new String[CAPACITY];
    }

    public Boolean isFull() {
        if (front == 0 && rear == CAPACITY - 1) {
            return true;
        }
        return false;
    }

    public Boolean isEmpty() {
        if (front == -1) {
            return true;
        }
        return false;
    }

    public String[] enQueue(String element) {
        try {
            if (isFull()) {
                System.out.println("Full.");
            } else {
                if (!isFull()) {
                    if (front == -1) {
                        this.front = 0;
                    }
                    ++rear;
                    items[rear] = element;
                    System.out.println("Add " + element + " successfully");
                }
            }
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return items;
    }

    public String[] enQueue() {
        try {
            if (isFull()) {
                System.out.println("Full.");
            } else {
                while (!isFull()) {
                    if (front == -1) {
                        this.front = 0;
                    }
                    System.out.print("Add elements(String): ");
                    String elements = scanner.next();
                    ++this.rear;
                    items[rear] = elements;
                    System.out.println("Add " + elements + " successfully");
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return items;
    }

    public String deQueue() {
        String element = "";
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            element = items[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println("Deleted -> " + element);
        }
        return element;
    }

    public String deQueueAllElements(){
        String elements = "";
        while (!isEmpty()){
            elements = items[front];
            if (this.front >= this.rear){
                this.front = -1;
                this.rear = -1;
            }else {
                front++;
            }
            System.out.println("Elements are dequeued: " + elements);
        }
        if (isEmpty()){
            return "Empty.";
        }
        return elements;
    }

    public void display(){
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue.");
        } else {
            System.out.print("Items -> ");
            for (i = front; i <= rear; i++) {
                System.out.print(items[i] + "  ");
            }
            System.out.println("\nFront index-> " + items[front]);
            System.out.println("\nRear index-> " + items[rear]);
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(3);
        queue.enQueue();
        queue.display();
        queue.deQueueAllElements();
        queue.display();

        queue.enQueue("Java");
        queue.enQueue("Javascript");
        queue.enQueue("Go");
        queue.display();
        queue.deQueue();
        queue.display();
    }
}
