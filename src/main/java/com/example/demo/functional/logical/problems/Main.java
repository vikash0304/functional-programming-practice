package com.example.demo.functional.logical.problems;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String input = "java is a programming language and java is platform independant language";

        Map<String, Integer> wordCountMap = new HashMap<>();

        String[] words = input.trim().split("\\s");
        for(String i : words) {
            if(wordCountMap.containsKey(i)){
                wordCountMap.put(i, wordCountMap.get(i)+1);
            } else {
                wordCountMap.put(i, 1);
            }
        }
        System.out.println(wordCountMap);
    }
    }

