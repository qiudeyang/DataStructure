package com.datastructure;

/**
 * Created by qiudeyang on 06/07/16.
 */
/*
此文件研究插入排序
 */
public class InsertSort {
    public static void insertSort(int[] array){
        int length = array.length;   //数组长度
        int j;         //当前值的位置
        int i;        //指向j前的位置
        int key;      //当前要进行插入排序的值
        for (j = 1; j < length; j++) {         //从数组的第二个位置开始遍历值
            i = j - 1;
            key = array[j];
            while(i >= 0 && array[i] > key){   //如果array[i]<=key，则什么也不做
                array[i+1] = array[i];  //a[i]比当前值大时，a[i]向后移一位，空出i的位置，好让下一次循环的值后移。
                i--;
            }
            array[i+1]=key;    //将当前值插入
        }
        for (int k = 0; k < length; k++) {
            System.out.println(array[k]);
        }
    }
    public static void main(String[] args) {
        int[] array = {3,2,5,1,6};
        insertSort(array);
    }
}
