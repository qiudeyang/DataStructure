package com.datastructure;

/**
 * Created by qiudeyang on 07/07/16.
 */
/*
此文件研究合并两个已排好序的数组
 */
public class MergeTwoSortedArray {
    public static void mergeTwoSortedArray(int[] array1,int[] array2,int[] array3){
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < array1.length && j < array2.length){
            if (array1[i] <= array2[j]){
                array3[k++] = array1[i++];
            }else{
                array3[k++] = array2[j++];
            }
        }
        while(i < array1.length){
            array3[k++] = array1[i++];
        }
        while(j < array2.length){
            array3[k++] = array2[j++];
        }
        for (int l = 0; l < array3.length; l++) {
            System.out.print(array3[l]+"\t");
        }
    }
    public static void main(String[] args) {
        int[] array1 = {1,4,8,11};
        int[] array2 = {2,3,7,10};
        int[] array3 = new int[array1.length+array2.length];
        mergeTwoSortedArray(array1,array2,array3);
    }
}
