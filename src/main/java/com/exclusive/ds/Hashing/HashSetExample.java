package com.exclusive.ds.Hashing;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String args[]) {

        Set<String> hashSet = new HashSet<>();
        hashSet.add("Here");
        hashSet.add("is");
        hashSet.add("the");
        hashSet.add("clarity");
        hashSet.remove("the");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.print(str + " ");
        }
    }
}
