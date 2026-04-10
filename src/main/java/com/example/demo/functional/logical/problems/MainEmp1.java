package com.example.demo.functional.logical.problems;

import com.example.demo.functional.logical.Employee1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainEmp1 {

    public static void main(String[] args) {

        List<Employee1> list = Arrays.asList(new Employee1(1, "vikash", 10000.0),
                new Employee1(2, "mohan", 20000.0),
                new Employee1(3, "rohan", 23000.0),
                new Employee1(4, "sohan", 12000.0),
                new Employee1(2, "xohan", 8000.0)
        );

        Optional<Double> secondHighest = list.stream()
                .map(Employee1::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        List<Employee1> emp = list.stream().filter(e->e.getSalary().equals(secondHighest.get())).collect(Collectors.toList());

        secondHighest.ifPresent(aDouble -> System.out.println(emp.get(0).getName() +" ->Second Highest salary: " + aDouble));
    }
}
