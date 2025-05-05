package com.exclusive.ds.arrays;

import java.util.HashMap;
import java.util.Map;

public class FrequenciesInSortedArray {
    public static void main(String[] args) {
        int arr[] = {10, 10, 10, 20, 20, 30, 40};
        printTheFrequencies(arr);
//        printTheFrequenciesOptimised(arr);
    }

    private static void printTheFrequenciesOptimised(int[] arr) {
        int i, count = 1, elem = arr[0];
        boolean lastElem = false;
        for (i = 1; i < arr.length; i++) {
            if (elem == arr[i]) {
                count++;
                if (i == arr.length - 1) lastElem = true;

            } else {
                if (i == arr.length - 1 && arr[i] != arr[i - 1]) {
                    System.out.println(arr[i] + " " + count);
                }
                System.out.println(elem + " " + count);
                elem = arr[i];
                count = 1;
            }
            if (lastElem == true) {
                if (i == arr.length - 1) {
                    System.out.println(arr[i] + " " + count);
                }
            }
        }
    }

    private static void printTheFrequencies1(int[] arr) {
        Map<Integer, Integer> abc = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int freq = (abc.get(arr[i]) == null) ? 0 : abc.get(arr[i]);
            freq++;
            abc.put(arr[i], freq);
        }
        for (int i : abc.keySet()) {
            System.out.println(i + "  " + abc.get(i));
        }
    }

    private static void printTheFrequencies(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }
//        for (int i : freq.keySet()) {
//            System.out.println(i + " " + freq.get(i));
//        }
        for (Map.Entry<Integer, Integer> abc : freq.entrySet()) {
            System.out.println(abc.getKey() + " " + abc.getValue());
        }
    }
}
