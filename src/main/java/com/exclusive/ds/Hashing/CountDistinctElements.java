package com.exclusive.ds.Hashing;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctElements {
    public static void main(String[] args) {
        int arr[] = {10, 10, 10, 20, 20, 30, 40};
//        System.out.println(countDistinctElements(arr));
        System.out.println(countDistinctElementsWithoutSet(arr));
    }

    private static int countDistinctElementsWithoutSet(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            boolean last_occurance = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == num) {
                    last_occurance = false;
                    break;
                }
                last_occurance = true;
            }
            if (last_occurance) res++;
        }
        return res;
    }

    private static int countDistinctElements(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        return set.size();
    }
}
