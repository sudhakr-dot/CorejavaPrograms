package com.Streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Find_heighest {
	
	public static void main(String[] args) {
		
		int[] input = {123, 456, 896};
		
		/*
		 * int[] output = Arrays.stream(input) .map(num -> num % 10) .toArray();
		 * 
		 * System.out.println("Output: " + Arrays.toString(output));
		 */
		 
		
		int[] output = Arrays.stream(input)
                .map(number -> String.valueOf(number) // Convert each number to a string
                        .chars()                    // Convert the string to an IntStream of characters
                        .map(Character::getNumericValue) // Convert each character to its numeric value
                        .max()                        // Find the maximum value
                        .orElse(0))                   // Default to 0 if no value is present
                .toArray();                           // Collect the results into an array

        // Print the output array
        System.out.println("Output: " + Arrays.toString(output));
        
        LinkedList<Integer> linkedlist=new LinkedList<>();
        
        
        
        
		
	}

}
