package com.exclusive.ds.recursion;

public class GenerateSubsetsOfString {
    public static void main(String args[]) {
        String input = "ABC";
        int i = 0;
        String curr = "";
        subset(input, curr, i);
    }

    private static void subset1(String input, String curr, int i) {
        if (i == curr.length()) {
            System.out.println(curr);
        }
        subset1(input, curr, i);
        subset1(input, curr + input.charAt(i), i + 1);
    }

    private static void subset(String input, String curr, int i) {
        if (i == input.length()) {
            System.out.println(curr);
            return;
        }
        subset(input, curr, i + 1);
        subset(input, curr + input.charAt(i), i + 1);

    }
}
