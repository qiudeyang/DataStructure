package com.datastructure;

/**
 * Created by qiudeyang on 07/07/16.
 */
/*
此程序研究冒泡排序
 */
public class BubbleSort {
    public static void bubbleSort(int[] array){
        int tmp = 0;
        for (int i = 0; i < array.length - 1; i++) {         //先把最大的移到最右边
            for (int j = 0; j < array.length - 1 - i; j++) {
                if(array[j]>array[j+1]){
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
    }
    public static void main(String[] args) {
        int[] array = {3,2,5,1,4};
        bubbleSort(array);
    }
}
