package com.datastructure;

/**
 * Created by qiudeyang on 08/07/16.
 */
public class ArrayRecursion {
    public static double arrayRecursion(int n){
        double[] data = new double[n+1];
        data[0] = 1.0;
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                sum += data[j];
            }
            data[i] = 2 * sum / i + i;
        }
        return data[n];
    }
    public static void main(String[] args) {
        System.out.println(arrayRecursion(10));
    }
}
