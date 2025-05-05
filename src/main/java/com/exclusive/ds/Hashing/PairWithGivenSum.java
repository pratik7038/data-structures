package com.exclusive.ds.Hashing;

import java.util.HashSet;
import java.util.Set;

public class PairWithGivenSum {
    public static void main(String[] args) {
        int[] arr1 = {3, 2, 8, 15, -8};
        int sum = 17;

//        System.out.println(naiveSolution(arr1, sum));
        System.out.println(efficientSolution(arr1, sum));
    }

    private static boolean efficientSolution(int[] arr1, int sum) {
        Set<Integer> elemSet = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            if (elemSet.contains(sum - arr1[i])) {
                return true;
            } else {
                elemSet.add(arr1[i]);
            }
        }
        return false;
    }

    private static boolean naiveSolution(int[] arr1, int sum) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] + arr1[j] == sum) return true;
            }
        }
        return false;
    }
}
