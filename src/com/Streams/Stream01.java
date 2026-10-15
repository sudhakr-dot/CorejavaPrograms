package com.Streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class Stream01 {
   public static void main(String []args) {
	   
	   String []arr= {"raj","Ram","Ravi","Rama"};
	   
	        Stream<String> stream = Arrays.stream(arr);
	   
	        stream.forEach(a->System.out.print(a +"   " ));
   }
}
