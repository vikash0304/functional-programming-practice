package com.example.demo.functional.logical.problems;

public class LogicalProblems {
//    void print(String a) { System.out.println("String"); }
    void print(Object a) { System.out.println("Object"); }
    void print(Integer a) { System.out.println("Integer"); }

    public static void main(String[] args) {
        LogicalProblems logicalProblems = new LogicalProblems();
        logicalProblems.print(null);
    }
}
