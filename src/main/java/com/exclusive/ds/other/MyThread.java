package com.exclusive.ds.other;

public class MyThread extends Thread {

    public void run() {
        System.out.println(Thread.currentThread().getId() + " is running");
    }
}
