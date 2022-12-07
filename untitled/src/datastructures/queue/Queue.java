package datastructures.queue;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Queue {

    private static Scanner scanner = new Scanner(System.in);

    private int front;

    private int rear;

    private  int CAPACITY;

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
                System.out.println("Simple queue is full.");
            } else {
                if (!isFull()) {
                    if (front == -1) {
                        this.front = 0;
                    }
                    ++rear;
                    items[rear] = element;
                    System.out.println(element + " has been enqueued successfully");
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
                System.out.println("Simple queue is full.");
            } else {
                while (!isFull()) {
                    if (front == -1) {
                        this.front = 0;
                    }
                    System.out.print("Enqueue: ");
                    String elements = scanner.next();
                    ++this.rear;
                    items[rear] = elements;
                    System.out.println(elements + " has been enqueue successfully");
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return items;
    }

    public void deQueue() {
        if (isEmpty()) {
            System.out.println("Simple queue is empty.");
        } else {
           String element = items[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println(element + "has been dequeued successfully.");
        }
    }

    public void deQueueAll(){
        if (isEmpty()){
            System.out.println("Simple queue is empty.");
        }else {
            while (!isEmpty()){
                String elements = items[front];
                if (this.front >= this.rear){
                    this.front = -1;
                    this.rear = -1;
                }else {
                    front++;
                }
                System.out.println(elements + " has been dequeued successfully.");
            }
        }
    }

    public void print(){
        int i;
        if (isEmpty()) {
            System.out.println("Simple queue is empty.");
        } else {
            System.out.print("Simple queue -> ");
            for (i = front; i <= rear; i++) {
                System.out.print(items[i] + "  ");
            }
            System.out.println("\nFront index-> " + items[front]);
            System.out.println("\nRear index-> " + items[rear]);
        }
    }

    public void display1(){
        enQueue("Java");
        enQueue("Javascript");
        enQueue("Go");
        print();
        deQueue();
        print();
    }

    public void display2(){
        enQueue();
        print();
        deQueueAll();
        print();
    }

    public static void main(String[] args) {
        Queue queue = new Queue(3);
        queue.display1();
        queue.display2();
    }
}
