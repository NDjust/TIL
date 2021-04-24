package sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = new int[] {5, 7, 1, 2, 10};


        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && (key < arr[j])) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        System.out.println(Arrays.toString(arr));
    }
}
