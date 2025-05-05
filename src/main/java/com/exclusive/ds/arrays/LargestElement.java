package com.exclusive.ds.arrays;

public class LargestElement {
    public static void main(String args[]) {
        int arr[] = new int[]{10, 2000, 432, 235, 25};
//        System.out.println(largestElem(arr));
        System.out.println(largestElemIndex(arr));
    }

    private static int largestElemIndex(int[] arr) {
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private static int largestElem(int[] arr) {
        int elem = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (elem < arr[i]) {
                elem = arr[i];
            }
        }
//      System.out.println(elem);
        return elem;
    }

}
