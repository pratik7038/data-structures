package com.exclusive.ds.mathematics;

public class FactorialNumber {
    public static void main(String args[]){
        int num = 10;
        System.out.println(factorialNum(num));
        System.out.println(factorialNumRecursive(num));
    }

    
    private static int factorialNumRecursive(int num) {
        if(num<2)return 1;
        return num*factorialNumRecursive(num-1);
    }

    private static int factorialNum(int num) {
        int temp= num;
        int factorial = 1;
        while (temp!=1) {
            factorial*=temp;
            temp--;
        }
        return factorial;
    }
}
