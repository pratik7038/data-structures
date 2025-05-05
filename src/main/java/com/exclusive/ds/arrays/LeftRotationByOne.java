package com.exclusive.ds.arrays;

public class LeftRotationByOne {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 12, 43};
        arr = leftRotationByOne(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static int[] leftRotationByOne(int[] arr) {
        int temp = arr[0], i = 0;
        for (i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[i] = temp;
        return arr;
    }
}
