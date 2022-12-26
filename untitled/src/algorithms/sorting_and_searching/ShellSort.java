package algorithms.sorting_and_searching;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShellSort {

    private static Scanner scanner = new Scanner(System.in);

    public int createSizeOfArray(){
        int size = 0;
        try {
            System.out.print("Input a size of array: ");
            size = scanner.nextInt();
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Exception: " + "Input wrong type.");
        }catch (Exception exception){
            System.out.println("Exception: " + exception.getMessage());
        }
        return size;
    }

    public int[] addElement(){
        int size = createSizeOfArray();
        int[] array = new int[size];
        try{
            for (int i = 0 ; i < size; i++){
                System.out.print("Add elements: ");
                int elements = scanner.nextInt();
                array[i] = elements;
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Exception: " + inputMismatchException.getMessage());
        }catch (Exception exception){
            System.out.println("Exception: " + exception.getMessage());
        }
        return array;
    }

    private void shellShort(){
        int[] array = addElement();
        int n = array.length;
        for (int interval = n / 2; interval > 0; interval /= 2){
            for (int i = interval ; i < n; i += 1){
                int temp = array[i];
                int j;
                for (j = i ; j >= interval && array[j - interval] > temp; j -= interval){
                    array[j] = array[j  - interval];
                }
                array[j] = temp;
            }
        }
        print(array);
    }

    public void print(int[] array){
        System.out.print("Array: ");
        for (int i = 0 ; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ShellSort shellSort = new ShellSort();
        shellSort.shellShort();
    }
}
