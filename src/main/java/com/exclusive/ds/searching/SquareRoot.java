package com.exclusive.ds.searching;

public class SquareRoot {
    public static void main(String args[]) {
        int num = 40;
        //System.out.println(squareRoot(num));
        System.out.println(squareRootEfficient(num));

    }

    private static int squareRootEfficient(int num) {
        int low = 1, high = num;
        int mid = (low + high) / 2;
        int square = mid * mid;
        int ans = -1;
        while (high >= low) {
            mid = (low + high) / 2;
            square = mid * mid;
            if (mid * mid > num) {
                high = mid - 1;
            } else if (mid * mid < num) {
                low = mid + 1;
                ans = mid;
            } else if (mid * mid == num) {
                return mid;
            }
        }
        return ans;
    }

    private static int squareRoot(int num) {
        int i;
        for (i = 1; i * i < num; i++) {
            if (num == i * i) return i;
        }
        return i - 1;
    }
}
