package SortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        SelectionSortMethod(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    // O(n^2) time | O(1) space - Worst Case
    // O(n^2) time | O(1) space - Best Case
    public static void SelectionSortMethod(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

}
