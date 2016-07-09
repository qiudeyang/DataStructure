package com.datastructure;

import java.util.Scanner;

/**
 * Created by qiudeyang on 08/07/16.
 */
/*
此程序研究计算斐波那契的线性算法，O（N）算法。
 */
public class LinearFeibonaqi {
    public static int linearfeibonaqi(int n){
        if(n <= 1){
            return 1;
        }
        int last = 1;
        int nextToLast = 1;
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            answer = last + nextToLast;
            nextToLast = last;
            last = answer;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(linearfeibonaqi(a));
    }
}
