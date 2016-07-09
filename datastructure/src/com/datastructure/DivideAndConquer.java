package com.datastructure;

/**
 * Created by qiudeyang on 08/07/16.
 */
public class DivideAndConquer {
    public static int max(int[] array,int l,int m){
        if(l == m){
            return array[l];
        }
        int i = (l + m)/2;
        int u = max(array,l,i);
        int v = max(array,i+1,m);
        if (u > v){
            return u;
        }else {
            return v;
        }
    }

    public static void main(String[] args) {
        int[] array = {3,2,1,4,8};
        System.out.println(max(array,0,array.length-1));
    }
}
