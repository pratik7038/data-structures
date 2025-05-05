package com.exclusive.ds.arrays;

public class LeftRotationByD {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int d = 3;
        arr = leftRotationByD(arr, d);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static int[] leftRotationByD(int[] arr, int d) {
        d = d % arr.length;
        if (d == 0) return arr;
        int[] tempArr = new int[d];
        for (int i = 0; i < d; i++) {
            tempArr[i] = arr[i];
        }
        for (int i = d; i < arr.length; i++) {
            arr[i - d] = arr[i];
        }

        for (int i = d; i < arr.length; i++) {
            arr[i] = tempArr[i - d];
        }
        return arr;
    }
}