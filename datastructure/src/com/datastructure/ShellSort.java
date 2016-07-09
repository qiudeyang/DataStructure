package com.datastructure;

/**
 * Created by qiudeyang on 07/07/16.
 */
public class ShellSort {
    public static void shellSort(int[] data){
        //计算最大的h值
        int h = 1;
        while(h <= data.length/3){
            h = h * 3 + 1;
        }
        while(h > 0){
            for (int i = h; i < data.length; i += h) {
                if (data[i] < data[i-h]){
                    int tmp = data[i];
                    int j = i - h;
                    while(j >= 0 && data[j]>tmp){
                        data[j+h] = data[j];
                        j -= h;
                    }
                    data[j+h] = tmp;
                    print(data);    //只有变化时才会打印
                }
            }
            //计算下一个h值
            h = (h - 1)/3;
        }

    }
    public static void print(int[] data){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+"\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] data = new int[]{5, 3, 6, 2, 1, 9, 4, 8, 7};
        print(data);
        shellSort(data);
        print(data);
    }
}
