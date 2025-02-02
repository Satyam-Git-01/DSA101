package SortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        // int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length;
        BubbleSortMethod(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    // O(n^2) time | O(1) space - Worst Case
    // O(n) time | O(1) space - Best Case
    public static void BubbleSortMethod(int arr[], int n) {
        int countComparisons = 0; // n*(n-1)/2 in worst case and n-1 in best case
        int numberOfPasses = 0;  // n-1 in worst case and 1 in best case
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                countComparisons++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            numberOfPasses++;
            if (!swapped) {
                break;
            }
        }
        System.out.println("Number of comparisons: " + countComparisons);
        System.out.println("Number of passes: " + numberOfPasses);
    }
}
