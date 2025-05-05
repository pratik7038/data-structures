package com.exclusive.ds.Hashing;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String args[]) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("abc", 10);
        hashMap.put("bcd", 20);
        hashMap.put("cde", 30);
        hashMap.put("def", 40);
        hashMap.put("efg", 50);

        System.out.println("size: " + hashMap.size());
        System.out.println("map: " + hashMap);
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("key " + entry.getKey() + " value " + entry.getValue());
        }

        if (hashMap.containsValue(50)) {
            System.out.println("hashmap contains value 50");
        }
    }
}
