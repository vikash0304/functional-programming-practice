package com.example.demo.functional.logical.problems;

public class StringExamples {

    public static void main(String[] args) {
        String input = "java";
        String inputObj = new String("java");
        String input1 = "java";
        String inputObj1 = new String("java");

        // case 1
        System.out.println(input == input1);
        System.out.println(input.equals(input1));
        System.out.println(input == "java");
        System.out.println(input.equals("java"));

        // case 2
        System.out.println("-----------case 2-------------");
        System.out.println(inputObj == inputObj1);
        System.out.println(inputObj.equals(inputObj1));
        System.out.println(inputObj == "java");
        System.out.println(inputObj.equals("java"));

        // case 3
        System.out.println("-----------case 3-------------");
        System.out.println(input == inputObj);
        System.out.println(input.equals(inputObj));
        System.out.println(inputObj == input);
        System.out.println(inputObj.equals(input));

        System.out.println("-----------case 4-------------");
        testString("java");
    }

    public static void testString(String in) {
        String input = "java";
        System.out.println(input == in);
        System.out.println(input.equals(in));
    }
}
