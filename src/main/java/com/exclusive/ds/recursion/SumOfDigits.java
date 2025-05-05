package com.exclusive.ds.recursion;

public class SumOfDigits {
    public static void main(String args[]) {
        int n = 3561312;
        System.out.println(sumOfDigits(n));
    }

    private static int sumOfDigits(int n) {
        if (n < 1) return 0;
        return n % 10 + sumOfDigits(n / 10);
    }
}
