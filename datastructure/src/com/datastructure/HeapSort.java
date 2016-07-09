package com.datastructure;

/**
 * Created by qiudeyang on 08/07/16.
 */
/*
此程序研究堆排序
 */

import java.util.Arrays;

public class HeapSort {
    public static void heapSort(int[] array){
        System.out.println("开始排序");
        int length = array.length;
        for (int i = 0; i < array.length -1; i++) {
            buildMaxHeap(array,length - 1 -i);
            swap(array,0,length - 1 - i);
            System.out.println(Arrays.toString(array));
        }
    }
    public static void swap(int[] array,int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void buildMaxHeap(int[] array,int lastIndex){
        for (int i = (lastIndex - 1)/2; i >= 0 ; i--) {
            int k = i;
            while(k*2+1 <= lastIndex){
                int biggerIndex = 2 * k + 1;
                if (biggerIndex < lastIndex){
                    if (array[biggerIndex]<array[biggerIndex+1]){
                        biggerIndex++;
                    }
                }
                if (array[k]<array[biggerIndex]){
                    swap(array,k,biggerIndex);
                    k=biggerIndex;
                }else {
                    break;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
    }
    public static void main(String[] args) {
        int[] array = {3, 2, 1, 4};
        heapSort(array);
    }
}
