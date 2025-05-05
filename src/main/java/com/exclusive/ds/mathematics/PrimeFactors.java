package com.exclusive.ds.mathematics;

public class PrimeFactors {
    public static void main(String[] args) {
        int num = 122;
        primeFactors(num);
    }

    private static void primeFactors(int num) {
        int x = num;
        for (int i = 2; i < num; i++) {
            if (isPrime(i)) {
                while (x % i == 0) {
                    System.out.println(i);
                    x = x / i;
                }
            }
        }
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
