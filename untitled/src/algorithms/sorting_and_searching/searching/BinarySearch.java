package algorithms.sorting_and_searching.searching;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BinarySearch {

    private static Scanner scanner = new Scanner(System.in);

    private int createSize() {
        int size = 0;
        try {
            System.out.print("Add a size of array: ");
            size = scanner.nextInt();
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception exception) {
            System.out.println("Exception: " + exception.getMessage());
        }
        return size;
    }

    private int[] addElements() {
        int size = createSize();
        int[] array = new int[size];
        try {
            for (int i = 0; i < size; i++) {
                System.out.print("Add elements: ");
                int element = scanner.nextInt();
                array[i] = element;
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        return array;
    }

    private int searchPosition() {
        int pos = 0;
        try {
            System.out.print("Search: ");
            pos = scanner.nextInt();
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return pos;
    }

    private int binarySearch() {
        int array[] = addElements();
        print(array);
        int low = 0;
        int high = array.length - 1;
        int position = searchPosition();
        // repeat until the pointers low and high meet each other
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == position) {
                return mid;
            }
            if (array[mid] < position) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    private void print(int[] array) {
        int lengthOfArray = array.length;
        System.out.print("Array -> ");
        for (int i = 0; i < lengthOfArray; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private void display() {
        int search = binarySearch();
        System.out.println("Position: " + search);
    }

    public static void main(String[] args) {
        BinarySearch search = new BinarySearch();
        search.display();
    }

}
