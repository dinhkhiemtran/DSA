package datastructures.queue;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CircularQueue {

    private static Scanner scanner = new Scanner(System.in);

    private int front;

    private int rear;

    private int[] items;

    private int CAPACITY;

    public CircularQueue(int size) {
        this.front = -1;
        this.rear = -1;
        this.CAPACITY = size;
        this.items = new int[CAPACITY];
    }

    public boolean isFull() {
        if (this.front == 0 && this.rear == this.CAPACITY - 1) {
            return true;
        }
        if (this.front == this.rear + 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (this.front == -1) {
            return true;
        }
        return false;
    }

    public void enQueue(int element) {
        if (isFull()) {
            System.out.println("Circular queue is full.");
        } else {
            if (this.front == -1) {
                this.front = 0;
            }
            this.rear = (this.rear + 1) % CAPACITY;
            this.items[rear] = element;
            System.out.println(element + " is added successfully.");
        }
    }

    public void deQueue() {
        try {
            if (isEmpty()) {
                System.out.println("Circular queue is empty.");
            } else {
                int element = this.items[this.front];
                if (this.front >= this.rear) {
                    this.front = -1;
                    this.rear = -1;
                }
                ++this.front;
                System.out.print(element + " has been dequeued: ");
            }
        } catch (Exception exception) {
            System.out.println("Exception: " + exception.getMessage());
        }
    }

    public void enQueue() {
        try {
            if (isFull()) {
                System.out.println("Circular queue is full.");
            } else {
                while (!isFull()) {
                    if (this.front == -1) {
                        this.front = 0;
                    }
                    System.out.print("Enqueue(Int): ");
                    int elements = scanner.nextInt();
                    this.rear = (this.rear + 1) % CAPACITY;
                    this.items[rear] = elements;
                    System.out.println(elements + " is added successfully.");
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }

    public void deQueueAll() {
        int element = 0;
        try {
            if (isEmpty()){
                System.out.println("Circular queue is empty.");
            }else {
                while (!isEmpty()){
                    element = this.items[this.front];
                    if (this.front == this.rear){
                        this.front = -1;
                        this.rear = -1;
                    }else {
                        this.front = (this.front + 1) % CAPACITY;
                    }
                    System.out.println(element + " has been dequeued.");
                }
            }
        } catch (Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
    }

    public void print() {
        try {
            if (isEmpty()) {
                System.out.println("Circular queue is empty.");
            } else {
                System.out.print("Circular Queue -> ");
                for (int i = this.front; i <= this.rear; i++) {
                    System.out.print(this.items[i] + ", ");
                }
                System.out.println();
                System.out.println("Front -> " + items[front] + " has a " + "position -> " + front);
                System.out.println("Rear -> " + items[rear] + " has a " + "position -> " + rear);
            }
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }

    public void display1() {
        enQueue(1);
        enQueue(2);
        enQueue(3);
        enQueue(4);
        enQueue(5);
        print();
        deQueue();
        print();
    }

    public void display2() {
        enQueue();
        print();
        deQueueAll();
        print();
    }

    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(5);
        circularQueue.display2();
    }

}
