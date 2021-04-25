package sort;

import java.util.Arrays;

public class MergeSort {


    public void mergeSort(int[] arr, int left, int right) {
        if (left == right) {
            return;
        }

        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, right);
    }

    public void merge(int[] arr, int left, int right) {
        int[] temp = new int[arr.length];
        int mid = (left + right) / 2;
        int L = left;
        int R = mid + 1;
        int K = left;

        while (L <= mid && R <= right) {
            temp[K++] = arr[L] <= arr[R] ? arr[L++] : arr[R++];
        }

        if (L > mid) {
            for (int i = R; i <= right; i++) {
                temp[K++] = arr[i];
            }
        } else {
            for (int i = L; i <= mid; i++) {
                temp[K++] = arr[i];
            }
        }

        for (int i = left; i <= right; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] arr = new int[] {5, 1, 2, 10, 9, 8};
        mergeSort.mergeSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}
