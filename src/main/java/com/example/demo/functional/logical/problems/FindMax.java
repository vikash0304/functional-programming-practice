package com.example.demo.functional.logical.problems;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Find maximum value from a given list of integers
 */
public class FindMax {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 20, 70, 80, 50, 17, 67);
        Optional<Integer> max = nums.stream().max(Integer::compare);
        System.out.println("Maximum value: "+max.get());
    }
}
