package com.exclusive.datastructures.mathematics;

public class PrimeFactorsEfficient {
    public static void main(String[] args) {
        int num = 122;
        primeFactors(num);
    }

    private static void primeFactors(int num) {
        int x = num;
        for (int i = 2; i*i < num; i++) {
            while (x % i == 0) {
                System.out.println(i);
                x = x / i;
            }
        }
        if(x>1)System.out.println(x);
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
