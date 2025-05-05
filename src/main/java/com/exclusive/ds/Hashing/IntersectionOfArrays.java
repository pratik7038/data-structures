package com.exclusive.ds.Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IntersectionOfArrays {
    public static void main(String args[]) {
        int[] arr1 = {10, 15, 20, 25, 30, 50};
        int[] arr2 = {30, 5, 15, 80, 20};

//        intersectionOfArrays(arr1, arr2); //using hashmap
        intersectionOfArrays2(arr1, arr2); //using hashset
    }

    private static void intersectionOfArrays2(int[] arr1, int[] arr2) {
        Set<Integer> elemSet = new HashSet<>();
        for (int i : arr2) {
            elemSet.add(i);
        }
        for (int i : arr1) {
            if (elemSet.contains(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static void intersectionOfArrays(int[] arr1, int[] arr2) {
        Map<Integer, Integer> arrMap = new HashMap<>();
        for (int i : arr1) {
            if (!arrMap.containsKey(i)) {
                arrMap.put(i, 1);
            }
        }
        //map is filled with unique key and 1 occurance
        for (int i : arr2) {
            if (arrMap.containsKey(i)) {
                arrMap.put(i, 0);
            }
        }

        for (int i : arr1) {
            if (arrMap.get(i) == 0) {
                System.out.print(i + " ");
            }
        }

    }
}
