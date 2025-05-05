package com.exclusive.ds.arrays;

public class subArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printAllSubArray(arr, 0);
    }

    private static void printAllSubArray(int[] arr, int start) {
//        if (end < start) return;

        for (int i = start; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();

        printAllSubArray(arr, start);
        printAllSubArray(arr, start + 1);
    }
}
