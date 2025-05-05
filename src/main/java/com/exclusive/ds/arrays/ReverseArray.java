package com.exclusive.ds.arrays;

public class ReverseArray {
    public static void main(String args[]) {
        int[] arr = {10, 210, 312, 2321};
        reverseArray(arr);
    }

    private static void reverseArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int temp = arr[high];
            arr[high] = arr[low];
            arr[low] = temp;
            low++;
            high--;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
