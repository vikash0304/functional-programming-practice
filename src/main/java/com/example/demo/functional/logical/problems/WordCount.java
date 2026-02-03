package com.example.demo.functional.logical.problems;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCount {

    public static void main(String[] args) {
        String input = "Java java Java java Spring spring Hibernate";
        Map<String, Long> wordCount = Arrays.stream(input.split("\\s"))
                                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(wordCount);
    }
}
