package com.example.demo.functional.logical;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCountDemo {
    public static void main(String[] args) {
        String input = "Java java Java java Spring spring Hibernate";
        Map<String, Long> wordCount = Arrays.stream(input.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        System.out.println(wordCount);
    }
}
