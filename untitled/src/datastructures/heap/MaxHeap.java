package datastructures.heap;

import java.util.ArrayList;

public class MaxHeap {

    public void heapify(ArrayList<Integer> array, int i) {
        // Find the largest among root, left child and right child
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < array.size() && array.get(left) > array.get(largest)) {
            largest = left;
        }
        if (right < array.size() && array.get(right) > array.get(largest)) {
            largest = right;
        }

        if (largest != i) {
            int temp = array.get(largest);
            array.set(largest, array.get(i));
            array.set(i, temp);

            heapify(array, largest);
        }
    }

    // Function to insert an element into the tree
    void insert(ArrayList<Integer> arrayList, int newNum) {
        int size = arrayList.size();
        if (size == 0) {
            arrayList.add(newNum);
        } else {
            arrayList.add(newNum);
            for (int i = size / 2 - 1; i >= 0; i--) {
                heapify(arrayList, i);
            }
        }
    }

    // Function to delete an element from the tree
    void deleteNode(ArrayList<Integer> arrayList, int num) {
        int size = arrayList.size();
        int i;
        for (i = 0; i < size; i++) {
            if (num == arrayList.get(i))
                break;
        }

        int temp = arrayList.get(i);
        arrayList.set(i, arrayList.get(size - 1));
        arrayList.set(size - 1, temp);

        arrayList.remove(size - 1);
        for (int j = size / 2 - 1; j >= 0; j--) {
            heapify(arrayList, j);
        }
    }

    // Print the tree
    void printArray(ArrayList<Integer> array, int size) {
        for (Integer i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Driver code
    public static void main(String args[]) {

        ArrayList<Integer> array = new ArrayList<Integer>();
        int size = array.size();

        MaxHeap h = new MaxHeap();
        h.insert(array, 3);
        h.insert(array, 4);
        h.insert(array, 9);
        h.insert(array, 5);
        h.insert(array, 2);

        System.out.println("Max-Heap array: ");
        h.printArray(array, size);

        h.deleteNode(array, 4);
        System.out.println("After deleting an element: ");
        h.printArray(array, size);
    }
}
