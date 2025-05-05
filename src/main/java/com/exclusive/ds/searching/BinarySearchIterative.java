package com.exclusive.ds.searching;

public class BinarySearchIterative {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 52, 65};
        int key = 52;
//        System.out.println(linearSearchIterative(arr, key));
        System.out.println(binarySearchIterative(arr, key));
    }

    private static int binarySearchIterative(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        int mid = (low + high) / 2;
        while (high >= low) {
            mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else if (arr[mid] < key) {
                low = mid + 1;
            }
        }

        return -1;
    }

    private static int linearSearchIterative(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }
}
