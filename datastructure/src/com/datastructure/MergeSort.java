package com.datastructure;

/**
 * Created by qiudeyang on 07/07/16.
 */
public class MergeSort {
    static  int number = 0;
    private static void printArray(String pre, int[] a) {
        System.out.println(pre);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
    }

    private static void mergeSort(int[] a) {
        System.out.println("开始排序:");
        sort(a, 0, a.length - 1);
    }

    private static void sort(int[] a, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        sort(a, left, mid);    //先把左边的排好序才会执行下面的
        sort(a, mid + 1, right);    //再把右边的排好序
        merge(a, left, mid, right);   //最后合并，这里还是有疑问
    }

    private static void merge(int[] a, int left, int mid, int right) {
        int[] tmp = new int[a.length];
        int r1 = mid + 1;
        int tIndex = left;
        int cIndex = left;
        //逐个归并
        while(left <= mid && r1 <= right){
            if (a[left] <= a[r1]){
                tmp[tIndex++]=a[left++];
            }else {
                tmp[tIndex++]=a[r1++];
            }
        }
        while(left <= mid){
            tmp[tIndex++] = a[left++];
        }
        while(r1 <= right){
            tmp[tIndex++]=a[r1++];
        }
        System.out.println("第"+(++number)+"趟排序:\t");
        while(cIndex <= right){
            a[cIndex]=tmp[cIndex];
            System.out.print(a[cIndex]+"\t");
            cIndex++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {26, 5, 98, 108, 28, 99, 100, 56, 34, 1};
        printArray("排序前：", a);
        mergeSort(a);
        printArray("排序后:", a);
    }
}
