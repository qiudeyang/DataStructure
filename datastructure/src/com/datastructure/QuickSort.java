package com.datastructure;

/**
 * Created by qiudeyang on 07/07/16.
 */
public class QuickSort {
    public static void quickSort(int[] array){
        qsort(array,0,array.length-1);
    }
    private static void qsort(int[] array,int low,int high){
        if (low < high){
            int pivot = partition(array,low,high);   //将数组分为两部分
            qsort(array,low,pivot-1);     //递归排序左子数组
            qsort(array,pivot+1,high);    //递归排序右子数组
        }
    }
    private static int partition(int[] array,int low,int high){
        int pivot = array[low];      //记录枢纽
        while(low < high){
            while(low < high && array[high] >= pivot){
                high--;
            }
            array[low]=array[high];       //交换比枢纽小的记录到左端
            while(low < high && array[low] <= pivot){
                low++;
            }
            array[high]=array[low];      //交换比枢纽大的记录到右端
        }
        array[low] = pivot;
        return low;    //返回枢纽的位置
    }
    public static void main(String[] args) {
        int[] array = {7,3,5,11,2};
        quickSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
    }
}
