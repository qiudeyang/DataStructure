package com.datastructure;

/**
 * Created by qiudeyang on 08/07/16.
 */
/*
此程序研究选择排序，比SelectSort效率高
 */
public class SelectSort1 {
    public static void selectSort1(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[min]>array[j]){
                    min = j;
                }
            }
            if (min != i){
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
    }
    public static void main(String[] args) {
        int[] array = {3,1,4,5,2};
        selectSort1(array);
    }
}
