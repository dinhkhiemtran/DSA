package algorithms.sorting_and_searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BucketSort {

    private Scanner scanner = new Scanner(System.in);

    public void bucketSort() {
        float[] arr = addElement();
        int n = arr.length;
        try {
            if (n <= 0)
                return;
            @SuppressWarnings("unchecked")
            ArrayList<Float>[] bucket = new ArrayList[n];

            // Create empty buckets
            for (int i = 0; i < n; i++)
                bucket[i] = new ArrayList<Float>();

            // Add elements into the buckets
            for (int i = 0; i < n; i++) {
                int bucketIndex = (int) arr[i] * n;
                bucket[bucketIndex].add(arr[i]);
            }

            // Sort the elements of each bucket
            for (int i = 0; i < n; i++) {
                Collections.sort((bucket[i]));
            }

            // Get the sorted array
            int index = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0, size = bucket[i].size(); j < size; j++) {
                    arr[index++] = bucket[i].get(j);
                }
            }
        } catch (Exception exception) {
            System.out.println("Exception: " + exception.getMessage());
        }
        print(arr);
    }

    private int createSize() {
        int size = 0;
        try {
            System.out.print("Create a size of array: ");
            size = scanner.nextInt();
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return size;
    }

    private float[] addElement() {
        int size = createSize();
        float[] array = new float[size];
        try {
            for (int i = 0; i < size; i++) {
                System.out.print("Add element: ");
                float element = scanner.nextFloat();
                array[i] = element;
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception exception) {
            System.out.println("Exception: " + exception.getMessage());
        }
        return array;
    }

    private void print(float[] array) {
        System.out.print("Sorted: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BucketSort bucketSort = new BucketSort();
//        float[] arr = {(float) 0.42, (float) 0.32, (float) 0.33, (float) 0.52, (float) 0.37, (float) 0.47,
//                (float) 0.51};
        bucketSort.bucketSort();

//        for (float i : arr)
//            System.out.print(i + "  ");
    }
}
