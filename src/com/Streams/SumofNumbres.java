package com.Streams;

import java.util.HashSet;
import java.util.Set;

public class SumofNumbres {
	
	
	public static int longestSubstring(String s) {
	    int maxLength = 0;

	    for (int i = 0; i < s.length(); i++) {
	        Set<Character> set = new HashSet<>();

	        for (int j = i; j < s.length(); j++) {
	            char ch = s.charAt(j);

	            if (set.contains(ch)) {
	                break;
	            }

	            set.add(ch);
	            maxLength = Math.max(maxLength, set.size());
	        }
	    }

	    return maxLength;
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {

		String s = "abcabcbb";

		System.out.println(longestSubstring(s));
		/*
		 * int num=1234;
		 * 
		 * 
		 * Stream<String> of = Stream.of(String.valueOf(num).split("")).map(a->a +" ");
		 * // ((String) of).value().stream().mapToInt(i -> i).reduce(0, (x,y) -> x+y);
		 * //integers.values().stream().mapToInt(i -> i).reduce(0, (x,y) -> x+y);
		 * 
		 * 
		 * IntStream chars = String.valueOf(num).chars();
		 * 
		 * int sum = chars.map(Character::getNumericValue).sum();
		 * System.out.println(sum);
		 * 
		 * 
		 * 
		 * String s="Sudhakar"; System.out.println(s); String temp=""; for(int
		 * i=s.length()-1;i>=0;i--){ temp= temp+s.charAt(i);
		 * 
		 * } System.out.println(temp);
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

	}
}
