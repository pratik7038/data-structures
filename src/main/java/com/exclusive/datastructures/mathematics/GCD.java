package com.exclusive.datastructures.mathematics;

public class GCD {
    public static void main(String args[]) {
        int a = 100, b = 201;
        System.out.println(gcd(a, b));
        System.out.println(gcdEuclidianAlgorithm(Integer.max(a, b), Integer.min(a, b)));
        System.out.println(gcdEuclidianAlgorithm1(Integer.max(a, b), Integer.min(a, b)));
    }

    private static int gcdEuclidianAlgorithm1(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcdEuclidianAlgorithm1(b, a % b);

    }

    private static int gcdEuclidianAlgorithm(int a, int b) {
        if (a != b) {
            return gcdEuclidianAlgorithm(Integer.max(a - b, b), Integer.min(a - b, b));
        } else if (a == b)
            return a;
        return b;
    }

    static int gcd(int a, int b) {
        int res = Integer.min(a, b);
        while (res > 1) {
            if (a % res == 0 && b % res == 0)
                return res;
            else
                res--;
        }
        return res;
    }
}
