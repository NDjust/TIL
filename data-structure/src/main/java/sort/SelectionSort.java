package sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = new int[] {5, 7, 1, 2, 10};

        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIdx] > arr[j]) {
                    minIdx = j;
                }
            }

            swap(i, minIdx, arr);
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void swap(final int i, final int minIdx, final int[] arr) {
        int temp = arr[minIdx];
        arr[minIdx] = arr[i];
        arr[i] = temp;
    }
}
