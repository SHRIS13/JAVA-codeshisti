package com.codeshisti;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args){

        int[][] numbers =new int[2][3];
        numbers[0][0]=1;
        System.out.println(Arrays.deepToString(numbers));
        //using curly braces
        int[][] number ={{1,2,3},{4,5,6}};
        System.out.println("\n\t"+Arrays.deepToString(number));
        //now after 2D we have the 3D below

        int[][][] integers =new int[2][3][5];
        integers[0][0][0]=1;
        System.out.println("\n"+Arrays.deepToString(integers));
    }
}
