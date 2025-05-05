package com.exclusive.ds.other;

public class Singleton {
    private static Singleton singletonInstance;

    private Singleton() {
    }

    public void showMessage() {
        System.out.println("hello from singleton");
    }

    public static Singleton getInstance() {
        if (singletonInstance == null) {
            synchronized (Singleton.class) {
                if (singletonInstance == null) singletonInstance = new Singleton();
            }
        }
        return singletonInstance;
    }

    public static void main(String[] args) {
        Singleton singleton = new Singleton();
        singleton.showMessage();
        ;
    }

}
