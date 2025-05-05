package com.exclusive.ds.Hashing;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithGivenSum {
    public static void main(String args[]) {
        int arr[] = {5, 8, 6, 13, 3, -1};
        int sum = 22;
//        System.out.println(naiveSolution(arr, sum));
        System.out.println(efficientSolution(arr, sum));

    }

    private static boolean efficientSolution(int[] arr, int resultSum) {
        Set<Integer> prefixSum = new HashSet<>();
        int currentSum = 0;
        for (int i : arr) {
            currentSum += i;
            if (prefixSum.contains(currentSum - resultSum)) return true;
            if (currentSum == resultSum) return true;
            prefixSum.add(currentSum);
        }
        return false;
    }

    private static boolean naiveSolution(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];
                if (currentSum == sum) {
                    return true;
                }
            }
        }
        return false;
    }
}
