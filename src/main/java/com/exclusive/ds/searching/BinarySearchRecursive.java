package com.exclusive.ds.searching;

public class BinarySearchRecursive {
    public static void main(String args[]) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70};
        int key = 65;
        int low = 0, high = arr.length - 1;
        System.out.println(binarySearchRecursive(arr, low, high, key));
    }

    private static int binarySearchRecursive(int[] arr, int low, int high, int key) {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] > key) {
            return binarySearchRecursive(arr, low, mid - 1, key);
        } else if (arr[mid] < key) {
            return binarySearchRecursive(arr, mid + 1, high, key);
        }
        return -1;
    }
}
