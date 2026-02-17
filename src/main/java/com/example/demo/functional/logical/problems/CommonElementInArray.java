//package com.example.demo.functional.logical.problems;
//
//public class CommonElementInArray {
//
//    public static void main(String[] args) {
//
//        int ar1[] = { 1, 5, 10, 20, 40, 80 };
//        int ar2[] = { 5, 6, 7, 20, 30, 40, 50, 80 };
//        int ar3[] = { 3, 4, 15, 20, 30, 40, 50, 60, 77, 80 };
//        int ar4[] = { 3, 4, 15, 20, 30, 40, 50, 60, 77,78,79, 80 };
//        int ar5[] = { 3, 4, 15, 20, 30, 40, 50, 60,64,65,69, 77,78,79, 80 };
//        int result[] = new int[6];
//
//        for(int i=0; i<ar1.length; i++) {
//            if( getCommon(ar2, ar1[i])>0) {
//                result[i] = getCommon(ar2, ar1[i]);
//            } else if( getCommon(ar2, ar1[i])>0) {
//                    result[i] = getCommon(ar3, ar1[i]);
//            }
//        }
//    }
//
//    private static int getCommon(int[] input, int matchElement) {
//        for(int j; j<input.length; j++) {
//            if(matchElement<input[j]) {
//                break;
//            } else if(matchElement==input[j]) {
//                return matchElement;
//            }
//        }
//
//        return 0;
//    }
//}
