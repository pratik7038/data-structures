package com.exclusive.ds.searching;

public class CountOnes {
    public static void main(String args[]) {
        int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        int firstOcc = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == 0) {
                low = mid + 1;
            } else if (arr[mid] == 1) {
                if (arr[mid - 1] == 0 || mid == 0) {
                    firstOcc = mid;
                    break;
                } else {
                    high = mid - 1;
                }
            }
        }
        System.out.println("Count of 1s is : " + (arr.length - firstOcc));
    }
}
