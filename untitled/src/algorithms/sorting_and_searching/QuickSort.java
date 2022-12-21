package algorithms.sorting_and_searching;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class QuickSort {

    private static Scanner scanner = new Scanner(System.in);

    private int[] array;

    private int CAPACITY;

    public QuickSort() {
        CAPACITY = 0;
    }

    public int inputCapacity() {
        try {
            System.out.print("Input a length of array: ");
            CAPACITY = scanner.nextInt();
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return CAPACITY;
    }

    public int[] inputElements(){
        int size = inputCapacity();
        array = new int[size];
        for (int i = 0; i < size; i++){
            System.out.print("Add elements: ");
            int elements = scanner.nextInt();
            array[i] = elements;
        }
        return array;
    }

    public int partition(int array[], int low, int high) {

        // choose the rightmost element as pivot
        int pivot = array[high];

        // pointer for greater element
        int i = (low - 1);

        // traverse through all elements
        // compare each element with pivot
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {

                // if element smaller than pivot is found
                // swap it with the greatr element pointed by i
                i++;

                // swapping element at i with element at j
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }

        // swapt the pivot element with the greater element specified by i
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // return the position from where partition is done
        return (i + 1);
    }

    public void quickSort(int array[], int low, int high) {
        if (low < high) {

            // find pivot element such that
            // elements smaller than pivot are on the left
            // elements greater than pivot are on the right
            int pi = partition(array, low, high);

            // recursive call on the left of pivot
            quickSort(array, low, pi - 1);

            // recursive call on the right of pivot
            quickSort(array, pi + 1, high);
        }
    }

    public void print(){
        int[] array = inputElements();
        System.out.print("Arrays: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void  display(){
        int[] array = inputElements();
        int lengthOfArray = array.length;
        quickSort(array,0, lengthOfArray - 1);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        quickSort.display();
    }

}
