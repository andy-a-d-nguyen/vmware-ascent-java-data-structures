package algorithms;

import datastructures.Node;

public class BubbleSort {

    public static void bubbleSort(Node[] array) {
        boolean isSorted = false;
        int last = array.length - 1;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < last; i++) {
                if (array[i].value > array[i + 1].value) {
                    swap(array, i, i + 1);
                    isSorted = false;
                }
            }
            last--;
            // every loop puts the largest number of the loop at the end (bubbles the largest element to the end) and therefore we don't need to check that element again
        }
    }

    private static void swap(Node[] array, int i, int j) {
        Node temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
