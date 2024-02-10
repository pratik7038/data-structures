package com.exclusive.datastructures.mathematics;

public class CountNoOfDigits {
    public static void main(String args[]){
        int num = 135791;
        System.out.println(countDigits(num)); 
    }

    private static int countDigits(int num) {
        int digits = 0;
        while (num>0) {
            digits++;
            num/=10;
        }
        return digits;
    }
}
