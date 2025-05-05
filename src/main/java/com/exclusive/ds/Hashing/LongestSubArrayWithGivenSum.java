package com.exclusive.ds.Hashing;

import java.util.HashSet;
import java.util.Set;

public class LongestSubArrayWithGivenSum {
    public static void main(String args[]) {
        int arr[] = {5, 8, -4, -4, 9, -2, 2};
        int sum = 0;
        System.out.println(lengthOfLongestSubArrayWithGivenSum(arr, sum));
    }

    private static int lengthOfLongestSubArrayWithGivenSum(int[] arr, int sum) {
        Set<Integer> integers = new HashSet<>();
        int currentSum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            currentSum += arr[i];
////            if(integers.contains(currentSum))
//        }
        return 0;
    }
}
