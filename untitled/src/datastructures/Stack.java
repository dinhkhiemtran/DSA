package datastructures;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Stack {

    private static final Scanner scanner = new Scanner(System.in);

    private int capacity;

    private int[] array;

    private int top;

    public Stack(int size) {
        this.capacity = size;
        this.array = new int[capacity];
        this.top = -1;
    }

    public boolean isFull() {
        return this.top == capacity - 1;
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public int size() {
        return this.top + 1;
    }

    public void push(int element) {
        try {
            if (isFull()) {
                System.out.println("OverFlow\nProgram Terminated\n");
                System.exit(1);
            }
            array[++top] = element;
            System.out.println(element + " is pushed successfully.");
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }

    public void push() {
        try {
            if (isFull()){
                System.out.println("Stack is full.");
            }else {
                while (!isFull()) {
                    System.out.print("Add elements(Int): ");
                    int elements = scanner.nextInt();
                    array[++top] = elements;
                    System.out.println(elements + " hash been pushed successfully.");
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }

    public void popAll() {
        if (isEmpty()){
            System.out.println("Stack is empty.");
        }else {
            while (!isEmpty()) {
                int elements = this.array[top--];
                System.out.println(elements + " is popped successfully.");
            }
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            System.exit(1);
        }
        int element = this.array[top--];
        System.out.println(element + " hash been pop successfully");
    }

    public void print() {
        if (isEmpty()){
            System.out.println("Stack is empty.");
        }else {
            System.out.print("Stack: ");
            for (int i = 0; i < this.top; i++) {
                System.out.print(array[i] + ", ");
            }
            System.out.println();
        }
    }

    public void display1() {
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        print();
        pop();
        System.out.println("Size: " + size());
    }

    public void display2(){
        push();
        print();
        popAll();
        print();
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.display1();
        stack.display2();
    }
}
