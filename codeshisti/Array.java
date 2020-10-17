package com.codeshisti;

import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(Arrays.toString(numbers));
        //older syntax

        int[] integers = {1,2,3,4,2};
        System.out.println(integers.length);
        //in java arrays have fixed size
        //sort this array like this
        Arrays.sort(integers);
        System.out.println(Arrays.toString(integers));

    }
}
