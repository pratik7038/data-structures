package com.exclusive.ds.Hashing;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfArrayElements {
    public static void main(String[] args) {
        int[] arr = {10, 20, 23, 12, 32, 20, 12, 23, 20, 20, 10};
        Map<Integer, Integer> result = countFrequencies(arr);
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    private static Map<Integer, Integer> countFrequencies(int[] arr) {
        Map<Integer, Integer> resMap = new HashMap<>();
        for (int i : arr) {
            resMap.put(i, resMap.getOrDefault(i, 0) + 1);
        }
        return resMap;
    }
}
