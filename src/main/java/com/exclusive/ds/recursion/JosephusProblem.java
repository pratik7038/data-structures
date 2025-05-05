package com.exclusive.ds.recursion;

public class JosephusProblem {
    public static void main(String args[]) {
        int n = 5;
        int k = 3;
        System.out.println(jos(n, k));
    }

    private static int jos(int n, int k) {
        if (n == 0) return 0;
        return (jos(n - 1, k) + k) % n;
    }
}
