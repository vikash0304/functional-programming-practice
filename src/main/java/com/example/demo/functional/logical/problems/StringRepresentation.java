package com.example.demo.functional.logical.problems;

import java.math.BigInteger;

/**
 * String representation to a given number
 * 100- hundred
 * 1234: one thousand two hundred thirty four
 */
public class StringRepresentation {

    static String[] oneToNinteen = {" ", "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen",
            "sixteen", "seventeen", "eighteen", "nineteen"};
    static String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static void main(String[] args) {
        long input =100001000l;
        String result = convertTostring(input, true);
        System.out.println("String representation: "+result);
    }

    public static String convertTostring(long input, boolean isBiggerNumber) {

        if(input==0 && isBiggerNumber) {
            return "zero";
        }

        if(input<20) {
            return oneToNinteen[(int)input];
        }
        if(input<100) {
            return tens[(int)input/10] + oneToNinteen[0] + oneToNinteen[(int)input%10];
        }
        //512
        if(input<1000) {
            return oneToNinteen[(int)input/100]+" hundred " + convertTostring((int)input%100, false);
        }
        //5123
        if(input<100000) {
            return convertTostring((int)input/1000, false) + " thousand " + convertTostring((int)input%1000, false);
        }
        if(input<10000000) {
            return convertTostring(input/100000, false) + " lakh " + convertTostring(input%100000, false);
        }
        if(input<900000000) {
            return convertTostring(input/10000000, false) + " crore " + convertTostring(input%10000000, false);
        }
        return "Invalid Number";
    }
}
