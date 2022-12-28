package algorithms.sorting_and_searching.searching;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TernarySearch {

    private static Scanner scanner = new Scanner(System.in);

    private int findMid1(int left, int right) {
        return left + (right - left) / 3;
    }

    private int findMid2(int left, int right) {
        return right - (right - left) / 3;
    }

    private int ternarySearch(int left, int right, int keySearch, int array[]) {

        if (right >= left) {

            int mid1 = findMid1(right, left);
            int mid2 = findMid2(right, left);

            //check if key searching is present at any mid
            if (array[mid1] == keySearch) {
                return mid1;
            }
            if (array[mid2] == keySearch) {
                return mid2;
            }

            //since key is not present at mid,
            //check in which region it is present
            //then check repeat the Search operation
            //in that region

            if (keySearch < array[mid1]) {
                // the key search lies in between 1 and mid1
                return ternarySearch(left, mid1 - 1, keySearch, array);
            } else if (keySearch > array[mid2]) {
                // the key lies in between mid2 and r
                return ternarySearch(mid2 + 1, right, keySearch, array);
            } else {
                return ternarySearch(mid1 + 1, mid2 - 1, keySearch, array);
            }
        }
        return -1;
    }

    private int createLengthOfArray() {
        int lengthOfArray = 0;
        try {
            System.out.print("Create a capacity of array: ");
            lengthOfArray = scanner.nextInt();
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return lengthOfArray;
    }

    private int[] addElements() {
        int lengthOfArray = createLengthOfArray();
        int[] array = new int[lengthOfArray];
        try {
            for (int i = 0; i < lengthOfArray; i++) {
                System.out.print("Add elements: ");
                int elements = scanner.nextInt();
                array[i] = elements;
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception exception) {
            System.out.println("Exception: " + exception.getMessage());
        }
        return array;
    }

    private int[] sortArray() {
        int[] array = addElements();
        int lengthOfArray = array.length;
        for (int i = 0; i < lengthOfArray; i++) {
            for (int j = i + 1; j < lengthOfArray; j++) {
                if (array[i] > array[j]) {
                    swap(array, i, j);
                }
            }
        }
        System.out.println("Sorted: ");
        print(array);
        return array;
    }

    private int inputKeySearch() {
        int key = 0;
        try {
            System.out.print("Search: ");
            key = scanner.nextInt();
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception exception){
            System.out.println("Exception: " + exception.getMessage());
        }
        return key;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private void print(int[] array){
        int lengthOfArray = array.length;
        System.out.print("Array -> ");
        for (int i = 0 ; i < lengthOfArray; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private void display(){
        int[] array = sortArray();
        int right = array.length;
        int left = 0;
        int keySearch = inputKeySearch();
        int search = ternarySearch(left, right, keySearch, array);
        System.out.println("Position: " + search);
    }

    public static void main(String[] args) {
        TernarySearch ternarySearch = new TernarySearch();
        ternarySearch.display();
    }
}
