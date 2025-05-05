package com.exclusive.ds.searching;

public class PairSum {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int target = 71;
        System.out.println(pairExistsNaive(arr, target));
        System.out.println(pairExists(arr, target));
    }

    private static boolean pairExists(int[] arr, int target) {
        int i = arr[0];
        int j = arr[arr.length - 1];
        return true;
    }

    private static boolean pairExistsNaive(int[] arr, int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
