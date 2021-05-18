package algorithms;

import datastructures.Node;

public class QuickSort {
    public static void quickSort(Node[] array) {
        quickSort(array, 0 , array.length - 1);
    }

    public static void quickSort(Node[] array, int startIdx, int endIdx) {
        if (startIdx >= endIdx) {
            return;
        }
        int pivotVal = array[(startIdx + endIdx) / 2].value;
        int partitionPoint = getPartitionPoint(array, startIdx, endIdx, pivotVal);
        quickSort(array, startIdx, partitionPoint - 1);
        quickSort(array, partitionPoint, endIdx);
    }

    private static int getPartitionPoint(Node[] array, int startIdx, int endIdx, int pivotVal) {
        while (startIdx <= endIdx) {
            while (array[startIdx].value < pivotVal) {
                startIdx++;
            }

            while (array[endIdx].value > pivotVal ) {
                endIdx--;
            }

            if (startIdx <= endIdx) {
                swap(array, startIdx, endIdx);
                startIdx++;
                endIdx--;
            }
        }
        return startIdx;
    }

    private static void swap(Node[] array, int startIdx, int endIdx) {
        Node temp = array[startIdx];
        array[startIdx] = array[endIdx];
        array[endIdx] = temp;
    }
}
