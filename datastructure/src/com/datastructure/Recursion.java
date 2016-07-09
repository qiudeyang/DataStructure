package com.datastructure;

/**
 * Created by qiudeyang on 08/07/16.
 */
public class Recursion {
    public static double recursion(int n){
        if (n == 0){
            return 1.0;
        }else {
            double sum = 0.0;
            for (int i = 0; i < n; i++) {
                sum += recursion(i);
            }
            return 2 * sum / n + n;
        }
    }
    public static void main(String[] args) {
        System.out.println(recursion(10));
    }
}
