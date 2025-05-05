package com.exclusive.ds.recursion;

public class NToOne {
    public static void main(String[] args) {
        func(10);
    }

    private static void func(int n) {
        if (n == 0) return;
        System.out.println(n);
        func(n - 1);
    }
}
