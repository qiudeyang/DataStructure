package com.datastructure;

/**
 * Created by qiudeyang on 08/07/16.
 */
/*
此程序研究选择排序
 */
public class SelectSort {
    public static void selectSort(int[] array){
        int tmp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]>array[j]){
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
    }
    public static void main(String[] args) {
        int[] array = {3,2,5,1,4};
        long start = System.currentTimeMillis();
        selectSort(array);
        System.out.println("所用时间:"+(System.currentTimeMillis() -  start));
    }
}
