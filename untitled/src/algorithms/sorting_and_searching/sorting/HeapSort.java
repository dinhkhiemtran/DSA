package algorithms.sorting_and_searching.sorting;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HeapSort {

    private Scanner scanner = new Scanner(System.in);

    private void heapify(int arr[], int n, int i) {
        //find largest among root, left child and right child
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }

        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }

        // Swap and continue heapifying if root is not largest
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    private void sort() {

        int arr[] = addElements();

        int n = arr.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Heap sort
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify root element
            heapify(arr, i, 0);
        }
        print(arr);
    }

    private int createSizeOfArray() {
        int size = 0;
        try {
            System.out.print("Create a size of array: ");
            size = scanner.nextInt();
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return size;
    }

    private int[] addElements() {
        int size = createSizeOfArray();
        int[] array = new int[size];
        try {
            for (int i = 0 ; i < size; i++){
                System.out.print("Add elements: ");
                int element = scanner.nextInt();
                array[i] = element;
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return array;
    }

    private void print(int[] array){
        System.out.print("Sorted: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    private void display(){
        sort();
    }

    public static void main(String[] args) {
        HeapSort heapSort = new HeapSort();
        heapSort.display();
    }
}
