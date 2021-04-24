package sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = new int[] {5, 7, 1, 2, 10};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(i, j, arr);
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void swap(final int i, final int j, final int[] arr) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
