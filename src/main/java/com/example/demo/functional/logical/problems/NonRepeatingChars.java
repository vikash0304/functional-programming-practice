package com.example.demo.functional.logical.problems;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatingChars {

    public static void main(String[] args) {
        String input = "suhas";

       /* Optional<Character> resultOpt = input.chars().mapToObj(c-> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(c->c.getValue()==1)
                .map(e->e.getKey())
                .findFirst();

        if(resultOpt.isPresent()) {
            System.out.println(resultOpt.get());
        } */

        Map<Character, Long> result = input.chars().mapToObj(c-> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().sorted(Map.Entry.<Character, Long>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,
                        (k,v)->v, LinkedHashMap::new));

        System.out.println(result);

    }
}
