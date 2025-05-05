package com.exclusive.ds.Hashing;

import java.util.HashSet;
import java.util.Set;

public class UnionOfArrayElements {
    public static void main(String args[]) {
        int arr1[] = {15, 20, 5, 15};
        int arr2[] = {15, 15, 15, 20, 10};
        System.out.println(distinctElems(arr1, arr2));
    }

    private static int distinctElems(int[] arr1, int[] arr2) {
        Set<Integer> elemSet = new HashSet<>();
        for (int i : arr1) {
            elemSet.add(i);
        }
        for (int i : arr2) {
            elemSet.add(i);
        }
        return elemSet.size();
    }
}
