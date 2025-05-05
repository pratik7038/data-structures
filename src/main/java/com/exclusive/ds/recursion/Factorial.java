package com.exclusive.ds.recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(factorial(n));
    }

    private static int factorial(int n) {
        if(n==0) return 1;
        return n*factorial(n-1);
    }
}
