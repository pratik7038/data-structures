package com.exclusive.ds.mathematics;

public class PalindromeNumbers {
    public static void main(String args[]) {
        int num = 12921;
        System.out.println(isPalindrome(num));
    }

    private static boolean isPalindrome(int num) {
        /// if the reverse is true, then the number is palindrome
        int rev = 0;
        int temp = num;
        while (num % 10 != 0) {
            rev *= 10;
            rev += num % 10;
            num /= 10;
        }
        return temp == rev;
    }
}
