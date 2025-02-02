package SortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        InsertionSortMethod(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    // O(n^2) time | O(1) space - Worst Case
    // O(n) time | O(1) space - Best Case
    public static void InsertionSortMethod(int arr[], int n) {
        int countShifts = 0;
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                countShifts++;
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        System.out.println("Number of Shifts: " + countShifts);
    }
}
