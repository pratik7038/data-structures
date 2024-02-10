package com.exclusive.datastructures.mathematics;

public class IsPrime {
    public static void main(String args[]) {
        int num = 4;
        System.out.println(isPrime(num));
    }

    private static boolean isPrime(int num) {
        if (num < 2)
            return false;
        if (num == 2)
            return true;
        for (int i = 2; i*i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
