package com.exclusive.ds.searching;

public class FindPeakElement {
    public static void main(String[] args) {
        int[] arr = {5, 10, 20, 15, 7};
        int[] arr1 = {10, 20, 15, 5, 23, 67};

        System.out.println(findPeak(arr));
        System.out.println(findPeakEfficient(arr1));

    }

    private static int findPeakEfficient(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {

        }
        return 0;
    }

    private static int findPeak(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                if (arr[i] > arr[i + 1]) {
                    return arr[i];
                }
            } else if (i == arr.length - 1) {
                if (arr[i] > arr[i - 1]) {
                    return arr[i];
                }
            } else {
                if (arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
