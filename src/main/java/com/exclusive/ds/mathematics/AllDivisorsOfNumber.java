package com.exclusive.ds.mathematics;

public class AllDivisorsOfNumber {
    /// example
    // input: 100
    // output: 1 2 4 5 10 25 20 50 100

    public static void main(String[] args) {
        int num = 16;
        // allDivisors(num);
        allDivisorsEfficient(num);

    }

    private static void allDivisorsEfficient(int num) {
        /// we see that divisors occur in pair
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
                if (i * i != num)
                    System.out.println(num / i);
            }
        }
    }

    private static void allDivisors(int num) {
        if (num < 1)
            return;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }

}
