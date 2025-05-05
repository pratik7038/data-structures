package com.exclusive.ds.recursion;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int n=11;
        System.out.println(getSum(n));
        System.out.println(sumEfficient(n));
    }

    private static int sumEfficient(int n) { 
        return (((n * (n+1))/2));
    }

    private static int getSum(int n) {
        if(n==0)return 0;
        return n + getSum(n-1);
    }
}
