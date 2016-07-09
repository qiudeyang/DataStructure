package com.datastructure;

/**
 * Created by qiudeyang on 08/07/16.
 */
/*
此程序是递归式斐波那契求法
 */
import java.util.Scanner;
public class Feibonaqi {
    public static int feibonaqi(int i){
        if(i <= 2){
            return 1;
        }else{
            return feibonaqi(i-1)+feibonaqi(i-2);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(feibonaqi(a));
    }
}
