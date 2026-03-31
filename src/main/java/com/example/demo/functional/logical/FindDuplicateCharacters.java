package com.example.demo.functional.logical;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateCharacters {

    public static void main(String[] args) {
        String input = "duplicate characters";
        input.chars().mapToObj(c-> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(x->x.getValue()>1).forEach(x->System.out.println(x.getKey()));
    }
}
