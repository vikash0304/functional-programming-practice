package com.example.demo.functional.logical.problems;

import java.util.Hashtable;

public class PairSum {

	public static void main(String[] args) {
		int[] input = {1, 2, 3, 4, 5};
        int sum = 5;
 
        //findAllPairs(input, sum);
        findAllPairsUsingHashTable(input, sum);

	}

	private static void findAllPairs(int[] input, int sum) {
		for(int i=0; i<input.length; i++) {
			for(int j = i+1; j<input.length; j++) {
				if(input[i]+input[j] ==sum) {
					System.out.println("Pairs are: ("+input[i]+","+input[j]+")");
				}
			}
		}
		
	}
	
	private static void findAllPairsUsingHashTable(int[] input, int sum) {
		Hashtable<Integer, Integer> h = new Hashtable<>();
		for(int i=0; i<input.length; i++) {
			int k = sum-input[i];
			
			h.put(i, input[i]);
		}
		
	}

}
