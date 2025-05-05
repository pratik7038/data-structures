package com.exclusive.ds.arrays;

public class MaxDifference {
    ///Maximum value of arr[j] - arr[i] such that j > i
    public static void main(String[] args) {
        int arr[] = {2, 3, 10, 6, 4, 8, 1};

//        System.out.print(findMaxDiff(arr));
        System.out.print(findMaxDiffOptimized(arr));
    }

    private static int findMaxDiffOptimized(int[] arr) {
        int res = arr[1] - arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res = Integer.max(res, arr[i] - min);
            min = Integer.min(min, arr[i]);
        }
        return res;
    }

    private static int findMaxDiff(int[] arr) {
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                res = Integer.max(res, arr[j] - arr[i]);
            }
        }
        return res;
    }
}
