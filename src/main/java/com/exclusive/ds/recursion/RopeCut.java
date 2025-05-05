package com.exclusive.ds.recursion;

public class RopeCut {
    public static void main(String args[]) {
        int n = 23;
        int c1 = 11, c2 = 9, c3 = 12;
        System.out.println(cutTheRope(n, c1, c2, c3));
    }

    private static int cutTheRope(int n, int c1, int c2, int c3) {
        if (n == 0) return 0;
        if (n < 0) return -1;

        int res = Integer.max(Integer.max(cutTheRope(n - c1, c1, c2, c3), cutTheRope(n - c2, c1, c2, c3)), cutTheRope(n - c3, c1, c2, c3));

        if (res == -1) return -1;
        return res + 1;
    }
}

//        23
//        /|\
//       12 14 11
//       /|\
//      1 3 0
//            \
//              rope is finished