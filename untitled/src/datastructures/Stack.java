package datastructures;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Stack {

    private static final Scanner scanner = new Scanner(System.in);

    private int capacity;

    private int[] array;

    private int top;

    public Stack(int size) {
        this.array = new int[size];
        this.capacity = size;
        this.top = -1;
    }

    public Boolean isFull() {
        return this.top == this.array.length - 1;
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
            System.out.println("Inserting: " + element);
            array[++top] = element;
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }

    public int[] push() {
        try {
            while (!isFull()) {
                System.out.print("Add elements(Int): ");
                int elements = scanner.nextInt();
                array[++top] = elements;
            }
            System.out.println("Full.");
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return array;
    }

    public int[] popAll() {
        while (!isEmpty()) {
            int elements = this.array[top--];
            System.out.println("Element is popped: " + elements);
        }
        return this.array;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("STACK EMPTY.");
            System.exit(1);
        }
        int element = this.array[top--];
        System.out.print("Element is popped: ");
        return element;
    }

    public void print() {
        System.out.print("Stack: ");
        for (int i = 0; i < this.top; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    public void loadStackInt() {
        System.out.println(push());
        print();
        System.out.println(popAll());
        print();
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        print();
        System.out.println(pop());
        System.out.println("Size: " + size());
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.loadStackInt();
    }
}
