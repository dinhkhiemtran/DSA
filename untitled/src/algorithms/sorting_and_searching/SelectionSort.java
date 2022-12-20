package algorithms.sorting_and_searching;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SelectionSort {

    private static Scanner scanner = new Scanner(System.in);

    private int inputLengthOfArray() {
        int length = 0;
        try {
            System.out.print("Input a length of array: ");
            length = scanner.nextInt();
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception exception) {
            System.out.println("Exception: " + exception.getMessage());
        }
        return length;
    }

    private int[] inputElements() {
        int length = inputLengthOfArray();
        int[] array = new int[length];
        try {
            for (int i = 0; i < array.length; i++) {
                System.out.print("Input elements: ");
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

    public int[] selectionSort(int[] array) {
        int lengthOfArray = array.length;
        if (array != null) {
            for (int i = 0 ; i < lengthOfArray; i++){
                int min = i;
                for (int j = i + 1; j < lengthOfArray; j++){
                    if (array[min] > array[j]){
                        min = j;
                    }
                }
                if (i != min){
                    swap(array, i, min);
                }
            }
        }
        return array;
    }

    public void swap(int[] array, int i, int min){
        int temp = array[i];
        array[i] = array[min];
        array[min] = temp;
    }

    public void print(int[] array){
        int lengthOfArray = array.length;
        System.out.print("Sorted: ");
        for (int i = 0; i < lengthOfArray; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void display(){
        int[] arraySorted = selectionSort(inputElements());
        print(arraySorted);
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.display();
    }

}
