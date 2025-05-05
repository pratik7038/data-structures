package com.exclusive.ds.mathematics;

public class CountNoOfDigits {
    public static void main(String args[]) {
        int num = 1234;
        System.out.println(countDigits(num));
    }

    public static int countDigits(int num) {
        int n = 0;
        while (num % 10 != 0) {
            n++;
            num /= 10;
        }
        return n;
    }
}
