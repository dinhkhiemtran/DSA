package algorithms.sorting_and_searching.searching;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LinearSearch {

    private static Scanner scanner = new Scanner(System.in);

    private int createSizeOfArray() {
        int size = 0;
        try {
            System.out.print("Input a size of array: ");
            size = scanner.nextInt();
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return size;
    }

    private int[] addElements() {
        int size = createSizeOfArray();
        int[] array = new int[size];
        int lengthOfArray = array.length;
        try {
            for (int i = 0; i < lengthOfArray; i++) {
                System.out.print("Add elements: ");
                int element = scanner.nextInt();
                array[i] = element;
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception exception) {
            System.out.println("Exception: " + exception.getMessage());
        }
        return array;
    }

    private int search() {
        int pointer = 0;
        try {
            System.out.print("Search: ");
            pointer = scanner.nextInt();
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception exception) {
            System.out.println("Exception: " + exception.getMessage());
        }
        return pointer;
    }

    private int linearSearch() {
        int[] array = addElements();
        int searchPointer = search();
        int size = array.length;
        for (int i = 0; i < size; i++) {
            if (array[i] == searchPointer) {
                System.out.print("Position: ");
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();
        int verifyNumber = linearSearch.linearSearch();
        System.out.println(verifyNumber);
    }

}
