package com.exclusive.ds.searching;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {10, 20, 25, 30, 50};
        int target = 30;
        System.out.println(binarySearch(target, arr));

    }

    public static int binarySearch(int target, int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (low <= high) {
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            }
            mid = (low + high) / 2;
        }
        return -1;
    }
}
