package com.exclusive.ds.recursion;

public class PalindormString {
    public static void main(String[] args) {
        String input = "abbcbba";
        if (isPalindrome(input)) {
            System.out.println("its valid palindrome");
        } else {
            System.out.println("its NOT palindrome");
        }
    }

    private static boolean isPalindrome(String input) {
        if (input.charAt(0) != input.charAt(input.length() - 1)) {
            return false;
        }
        if (input.length() == 1 || input.length() == 0) return true;
        return isPalindrome(input.substring(1, input.length() - 2));
    }
}
