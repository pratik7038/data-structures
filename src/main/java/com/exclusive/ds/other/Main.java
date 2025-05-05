package com.exclusive.ds.other;

public class Main {
    public static void main(String[] args) {
//        MyThread thread1 = new MyThread();
//        thread1.start();
        int prices[] = {7, 1, 5, 3, 6, 4};
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += (prices[i] - prices[i - 1]);
            }
        }
        char[] a = new char[0];
        a.toString();
        String s = "";
//        s.toCharArray()
//        a.charAt(1);
        System.out.println(profit);
    }
}
