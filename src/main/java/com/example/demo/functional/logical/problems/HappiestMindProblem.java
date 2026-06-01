package com.example.demo.functional.logical.problems;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 * Example 1
 * Input:
 * strs = ["flower","flow","flight"]
 * Output:
 * "fl
 */
public class HappiestMindProblem {

    public static void main(String[] args) {
        String[] strings = {"flower","flow","flight"} ;
        System.out.println(longestCommonPrefix(strings));
    }

    private static String longestCommonPrefix(String[] strings) {
        String result = strings[0];
        if(strings.length==0) {
            return null;
        } else {

            for(int i=1; i<strings.length; i++) {
                while(!strings[i].startsWith(result)){
                    result = result.substring(0, result.length()-1);
                    if(result.isEmpty()) {
                        return "";
                    }
                }
            }
            return result;
        }

    }

}
