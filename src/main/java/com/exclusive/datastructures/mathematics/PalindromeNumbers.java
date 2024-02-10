package com.exclusive.datastructures.mathematics;

public class PalindromeNumbers {
    public static void main(String args[]) {
        int num = 12921;
        System.out.println(isPalindrome(num));
    }

    private static boolean isPalindrome(int num) {
        /// if the reverse is true, then the number is palindrome
        int reverse = 0;
        int n = num;
        while (n > 0) {
            reverse*=10;
            reverse += (n % 10) ; 
            n /= 10;
        }
         return (num == reverse);
    }
}

//time complexity = ϴ(d)
