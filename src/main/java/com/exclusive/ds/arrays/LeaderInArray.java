package com.exclusive.ds.arrays;

public class LeaderInArray {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 6, 5, 2};
        printLeaders(arr);
    }

    private static void printLeaders(int[] arr) {
        if (arr.length == 0) return;
        int element = arr[arr.length - 1];
        System.out.print(element + " ");
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > element) {
                element = arr[i];
                System.out.print(element + " ");
            }
        }
    }
}
