package com.datastructure;

/**
 * Created by qiudeyang on 08/07/16.
 */
public class MatrixMultiply {
    public static int[][] multiply(int[][] array1,int[][] array2){
        int n = array1.length;
        int[][] array3 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array3[i][j] = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    array3[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array3[i][j]+"\t");
            }
            System.out.println();
        }
        return array3;
    }
    public static void main(String[] args) {
        int[][] array1 = {{1,3},{2,4}};
        int[][] array2 = {{4,2},{3,1}};
        multiply(array1,array2);
    }
}
