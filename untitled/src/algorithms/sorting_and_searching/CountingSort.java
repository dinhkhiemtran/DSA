package algorithms.sorting_and_searching;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CountingSort {

    Scanner scanner = new Scanner(System.in);

    public int createSize(){
        int size = 0;
        try {
            System.out.print("Input a size of array: ");
            size = scanner.nextInt();
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Exception: " + "Input wrong type.");
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
        return size;
    }

    private int[] createArray(){
        int size = createSize();
        int[] array = new int[size];
        try {
            for (int i = 0 ; i < size; i++){
                System.out.print("Add elements: ");
                int element = scanner.nextInt();
                array[i] = element;
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Exception: " + "Input wrong type.");
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
        return array;
    }

    private void countSort() {
        int[] array = createArray();
        int size = array.length;
        int[] output = new int[size + 1];

        // Find the largest element of the array
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max)
                max = array[i];
        }
        int[] count = new int[max + 1];

        // Initialize count array with all zeros.
        for (int i = 0; i < max; ++i) {
            count[i] = 0;
        }

        // Store the count of each element
        for (int i = 0; i < size; i++) {
            count[array[i]]++;
        }

        // Store the cummulative count of each array
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // Find the index of each element of the original array in count array, and
        // place the elements in output array
        for (int i = size - 1; i >= 0; i--) {
            output[count[array[i]] - 1] = array[i];
            count[array[i]]--;
        }

        // Copy the sorted elements into original array
        for (int i = 0; i < size; i++) {
            array[i] = output[i];
        }
        print(array);
    }

    private void print(int[] array){
        if (array != null){
            System.out.print("Sorted Array in Ascending Order: ");
            for (int i = 0 ; i < array.length; i++){
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CountingSort cs = new CountingSort();
        cs.countSort();
    }
}
