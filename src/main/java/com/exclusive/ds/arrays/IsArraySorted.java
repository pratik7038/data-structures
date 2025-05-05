package com.exclusive.ds.arrays;

public class IsArraySorted {
    public static void main(String args[]) {
        int[] arr = {1000, 210, 312, 2321};
        checkIfArrayIsSorted(arr);
    }

    private static void checkIfArrayIsSorted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("not sorted");
            }
        }
    }
}