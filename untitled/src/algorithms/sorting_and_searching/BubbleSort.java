package algorithms.sorting_and_searching;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BubbleSort {

    Scanner scanner = new Scanner(System.in);

    private int inputLengthOfArray() {
        int length = 0;
        try {
            System.out.print("Input a length of array: ");
            length = scanner.nextInt();
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        return length;
    }

    private int[] initArray() {
        int length = inputLengthOfArray();
        int[] array = new int[length];
        return array;
    }

    private int[] inputArray() {
        int[] array = initArray();
        int lengthOfArray = array.length;
        for (int i = 0; i < lengthOfArray; i++) {
            System.out.print("Input(Int): ");
            int element = scanner.nextInt();
            array[i] = element;
        }
        return array;
    }

    private int[] bubbleSort() {
        int[] array = inputArray();
        int size = array.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] > array[j]) {
                    swap(array, i, j);
                }
            }
        }
        return array;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private void print() {
        int[] array = bubbleSort();
        int lengthOfArray = array.length;
        System.out.print("Sorted: ");
        for (int i = 0; i < lengthOfArray; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private void display() {
        print();
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.display();
    }

}
