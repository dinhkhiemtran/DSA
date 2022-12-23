package algorithms.sorting_and_searching;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InsertionSort {

    private static Scanner scanner = new Scanner(System.in);

    public int createLengthOfArray() {
        int lengthOfArray = 0;
        try {
            System.out.print("Input a length of array: ");
            lengthOfArray = scanner.nextInt();
            return lengthOfArray;
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception exception) {
            System.out.println("Exception: " + exception.getMessage());
        }
        return lengthOfArray;
    }

    public int[] createArray() {
        int lengthOfArray = createLengthOfArray();
        int[] array = new int[lengthOfArray];
        for (int i = 0; i < lengthOfArray; i++) {
            System.out.print("Input elements: ");
            int element = scanner.nextInt();
            array[i] = element;
        }
        return array;
    }

    private int[] insertionSort(int[] array) {
        int lengthOfArray = array.length;
        if (array != null) {
            for (int i = 0; i < lengthOfArray; i++) {
                int key = array[i];
                int j;
                for (j = i - 1; j >= 0 && key < array[j]; j--) {
                    array[j + 1] = array[j];
                }
                array[j + 1] = key;
            }
        }
        return array;
    }

    private void print(int[] array) {
        if (array != null) {
            int lengthOfArray = array.length;
            System.out.print("Sorted: ");
            for (int i = 0; i < lengthOfArray; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }

    public void display() {
        int[] arraySorted = insertionSort(createArray());
        print(arraySorted);
    }

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.display();
    }
}
