package algorithms;

import datastructures.Node;

public class MergeSort {
    public static void mergeSort(Node[] array) {
        mergeSort(array, new Node[array.length], 0, array.length - 1);
    }

    public static void mergeSort(Node[] array, Node[] temp, int leftIdx, int rightIdx) {
        if (leftIdx >= rightIdx) {
            return;
        }
        int midIdx = (leftIdx + rightIdx) / 2;
        mergeSort(array, temp, leftIdx, midIdx);
        mergeSort(array, temp, midIdx + 1, rightIdx);
        mergeHalves(array, temp, leftIdx, rightIdx);
    }

    private static void mergeHalves(Node[] array, Node[] temp, int leftStartIdx, int rightEndIdx) {
        int leftEndIdx = (leftStartIdx + rightEndIdx) / 2;
        int rightStartIdx = leftEndIdx + 1;
        int arrSize = rightEndIdx - leftStartIdx + 1;

        int left = leftStartIdx;
        int right = rightStartIdx;
        int index = leftStartIdx;

        while (left <= leftEndIdx && right <= rightEndIdx) {
            if (array[left].value <= array[right].value) {
                temp[index] = array[left];
                left++;
            } else {
                temp[index] = array[right];
                right++;
            }
            index++;
        }
        System.arraycopy(array, left, temp, index, leftEndIdx - left + 1);
        System.arraycopy(array, right, temp, index, rightEndIdx - right + 1);
        System.arraycopy(temp, leftStartIdx, array, leftStartIdx, arrSize);
    }
}
