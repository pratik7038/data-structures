package com.exclusive.ds.arrays;

public class Operations {

    public static void main(String args[]) {
        int arr[] = {19, 234, 31, 43, 56};
        int n = 31;
        //search
//        System.out.println(search(arr, n));
        //delete
        int[] arr2 = new int[5];
        arr2 = new int[]{10, 20, 30, 40, 50, 60};
        n = 40;
        arr2 = deleteSingleElement(arr2, n); //replace the last items with -1
        for (int i : arr2) {
            System.out.println(i);
        }
    }

    private static int[] deleteSingleElement(int[] arr, int n) {
        int i = -1;
        for (i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                break;
            }
        }
        for (i = i; i < arr.length - 1; i++) {
            System.out.println(i);
            arr[i] = arr[i + 1];
        }
        arr[i] = -1;
        return arr;
    }

    private static int search(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n)
                return i;
        }
        return -1;
    }
}
