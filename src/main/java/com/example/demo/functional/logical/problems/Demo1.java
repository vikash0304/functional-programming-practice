package com.example.demo.functional.logical.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("aa", "bb", "cc");
        List<String> list2 = Arrays.asList("cc", "dd", "aa");


//        list1.addAll(list2);
        //output: aa, aa
        //List<String> result = list1.stream().filter(l->list2.contains(l)).collect(Collectors.toList());

        List<String> result = new ArrayList<>();
        list1.stream().forEach(l-> {
                if(l.equals("aa")) {
                    result.add(l);
                }
                if(list2.contains("aa")) {
                    result.add("aa");
                }
        });

        System.out.println(result);
    }
}
