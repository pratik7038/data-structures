package com.exclusive.ds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DataStructuresApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataStructuresApplication.class, args);
        int[] arr = {10, 20, 20, 30, 30, 30};
        int[] ans = RemoveDuplicatesOptimized(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

    private static int[] RemoveDuplicatesOptimized(int[] arr) {

        int res = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[res]) {
                res++;
                arr[i] = arr[res];
            }
        }

        return arr.clone();
    }

}
