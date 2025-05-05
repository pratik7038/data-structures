package com.exclusive.ds.arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 30, 30, 30};
//        int[] ans = removeDuplicates(arr);
        int[] ans = removeDuplicatesOptimized(arr);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

    private static int[] removeDuplicatesOptimized(int[] arr) {
        int res = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[res - 1]) {
                arr[res] = arr[i];
                res++;
            }
        }
        return arr;
    }

    private static int[] removeDuplicates(int[] arr) {
        int[] ans = new int[arr.length];
        int elem = arr[0];
        ans[0] = elem;
        int ansIndex = 1;
        for (int i = 1; i < arr.length - 1; i++) {
            if (elem != arr[i]) {
                elem = arr[i];
                ans[ansIndex++] = elem;
            }
        }
        return ans;
    }
}
