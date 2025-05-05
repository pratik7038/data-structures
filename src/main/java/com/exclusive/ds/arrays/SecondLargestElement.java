package com.exclusive.ds.arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 6};
        System.out.println(secondLargestElement(arr));
    }

    private static int secondLargestElement(int[] arr) {
        int max = arr[0];
        int secondMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
        }

        return secondMax;
    }
}
