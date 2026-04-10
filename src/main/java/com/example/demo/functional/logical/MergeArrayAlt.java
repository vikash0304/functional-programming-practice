package com.example.demo.functional.logical;

import java.util.ArrayList;
import java.util.List;

public class MergeArrayAlt {

    /**
     * Merges two integer arrays in alternate order into a new array
     *
     * eg: input:
     *
     * arr1 = {1,2,3}
     * arr2 = {4,5,6,7,8}
     *
     * OutPut: {1,4,2,5,3,6,7,8}
     */

    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6,7,8};

        List<Integer> result = new ArrayList<>();
        int maxLength = Math.max(arr1.length, arr2.length);

        for(int i =0; i<maxLength;i++) {
            if(arr1.length>i) {
                result.add(getArrayValue(arr1, i));
            }
            if(arr2.length>i) {
                result.add(getArrayValue(arr2, i));
            }


        }
        System.out.println(result);

    }

    private static int getArrayValue(int[] arr, int inx) {
        return arr[inx];
    }

}
