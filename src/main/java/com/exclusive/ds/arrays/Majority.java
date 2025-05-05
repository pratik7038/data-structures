//package com.exclusive.ds.arrays;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class Majority {
//    public static void main(String[] args) {
//        int[] nums = {2, 3, 2, 1, 3, 2};
//        int result = majorityElement(nums);
//        System.out.println(result);  // Output: 2
//    }
//
//    public static int majorityElement(int[] nums) {
//        int count = 0;
//        int candidate = 0;
//
//        for (int num : nums) {
//            if (count == 0) {
//                candidate = num;
//            }
//
//            if (num == candidate) {
//                count++;
//            } else {
//                count--;
//            }
//        }
//        Map<Integer, Integer> m1 = new HashMap<>();
//
//        for(int num : nums){
//            m1.put(num, m1.getOrDefault(num,0)+1);
//        }
//        for(Map.Entry<Integer,Integer> k1 : m1.entrySet()){
//            int key = k1.getKey();
//            int value = k1.getValue();
//            if(value > nums.length / 2){
//                return key;
//            }
//        }
//    }
//        return candidate;
//    }
//
//}
//
