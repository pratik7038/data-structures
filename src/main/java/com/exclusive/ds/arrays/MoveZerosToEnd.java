package com.exclusive.ds.arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {8, 9, 0, 0, 0, 10, 20};
//        arr = modifiedArray(arr);
        arr = modifiedArrayOptimised(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static int[] modifiedArrayOptimised(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {

                count++;
            }
        }
        return arr;
    }

    private static int[] modifiedArray(int[] arr) { //O(n2)
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] != 0) {
                        arr[i] = arr[j];
                        arr[j] = 0;
                    }
                }
            }
        }
        return arr;
    }
}
