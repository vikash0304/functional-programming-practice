package com.example.demo.functional.logical.problems;

import java.util.Arrays;
import java.util.List;

public class SumOfIntegers {

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(10, 20, 70, 80, 50, 17, 67);
        int sum = input.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
