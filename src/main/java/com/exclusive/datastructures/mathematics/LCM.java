package com.exclusive.datastructures.mathematics;

public class LCM {
    public static void main(String args[]) {
        int a = 4, b = 6;
        System.out.println(lcm(a, b));
    }

    private static int lcm(int a, int b) {
    
        return a * b / GCD.gcd(a, b);
    }
}
