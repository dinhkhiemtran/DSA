package algorithms.sorting_and_searching.sorting;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RadixSort {

    private static Scanner scanner = new Scanner(System.in);

    private int createSize() {
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

    private int[] addElement() {
        int size = createSize();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Input element: ");
            int element = scanner.nextInt();
            array[i] = element;
        }
        return array;
    }


    private void countingSort(int array[], int size, int place) {
        try {
            int[] output = new int[size + 1];
            int max = array[0];
            for (int i = 1; i < size; i++) {
                if (array[i] > max) max = array[i];
            }
            int[] count = new int[max + 1];

            for (int i = 0; i < max; ++i)
                count[i] = 0;

            // Calculate count of elements
            for (int i = 0; i < size; i++)
                count[(array[i] / place) % 10]++;

            // Calculate cumulative count
            for (int i = 1; i < 10; i++)
                count[i] += count[i - 1];

            // Place the elements in sorted order
            for (int i = size - 1; i >= 0; i--) {
                output[count[(array[i] / place) % 10] - 1] = array[i];
                count[(array[i] / place) % 10]--;
            }

            for (int i = 0; i < size; i++)
                array[i] = output[i];
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("Exception: " + arrayIndexOutOfBoundsException.getMessage());
        } catch (Exception exception) {
            System.out.println("Exception: " + exception.getMessage());
        }

    }

    private int getMax(int array[], int size) {
        int max = array[0];
        for (int i = 1; i < size; i++)
            if (array[i] > max) max = array[i];
        return max;
    }

    void radixSort() {
        int[] array = addElement();
        int size = array.length - 1;

        // Get maximum element
        int max = getMax(array, size);

        // Apply counting sort to sort elements based on place value.
        for (int place = 1; max / place > 0; place *= 10)
            countingSort(array, size, place);
        print(array);
    }


    private void print(int array[]) {
        System.out.print("Radix sort: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        int[] data = { 121, 432, 564, 23, 1, 45, 788 };
//        int size = data.length;
        RadixSort rs = new RadixSort();
        System.out.println("Sorted Array in Ascending Order: ");
        rs.radixSort();
//        System.out.println(Arrays.toString(data));
    }
}
