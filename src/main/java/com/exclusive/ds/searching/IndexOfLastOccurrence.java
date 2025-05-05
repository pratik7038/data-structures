package com.exclusive.ds.searching;

public class IndexOfLastOccurrence {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 60, 60, 60};
        int key = 60;
        int high = arr.length - 1;
        int low = 0;
        System.out.println(lastOccurrence(arr, low, high, key));
    }

    private static int lastOccurrence(int[] arr, int low, int high, int key) {
        if (high < low) return -1;
        int mid = (low + high) / 2;

        if (arr[mid] == key) {
            if (mid == 0 || arr[mid] != arr[mid - 1]) {
                return mid;
            } else return lastOccurrence(arr, mid + 1, high, key);
        } else if (arr[mid] > key) {
            return lastOccurrence(arr, low, mid - 1, key);
        } else if (arr[mid] < key) {
            return lastOccurrence(arr, mid + 1, high, key);
        }
        return -1;
    }
}
