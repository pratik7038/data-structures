package com.exclusive.ds.Hashing;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithSumZero {
    public static void main(String[] args) {
        int[] arr = {-3, 4, -3, -1, 1};

        System.out.println(isSubArrayPresent(arr));

    }

    private static boolean isSubArrayPresent(int[] arr) {
        ///we need to maintain prefix sum
        Set<Integer> prefixSum = new HashSet<>();
        int sum = 0;
        for (int i : arr) {
            sum += i;
            if (prefixSum.contains(sum)) return true;
            if (sum == 0) return true;
            prefixSum.add(sum);
        }

        return false;
    }

}
