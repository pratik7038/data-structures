package com.exclusive.ds.mathematics;

public class TrailingZeros {
    public static void main(String args[]) {
        int num = 100;
        System.out.println(trailingZerosCount(num));
    }

    private static int trailingZerosCount(int num) {
        int res = 0;
        while (num > 0) {
            res += num / 5;
            num /= 5;
        }
        return res;
    }
}
