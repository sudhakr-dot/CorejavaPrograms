package com.Stream.Basic;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream_Ligical {
	public static void main(String[] args) {
		
		String str="IamLearning";
		String str1="I am Learning Stream API in java";
		
		   List<Character> list = str.chars().distinct().mapToObj(c->(char)c).collect(Collectors.toList());
           System.out.println(list);	
           
           
           int [] arr= {234,12,34,45,7,3,1};
           
              for(int i=0;i<arr.length;i++) {
            	  for(int j=0;j<arr.length;j++) {
            		  if(arr[i]<arr[j]) {
            		    int temp=arr[i];
            		      arr[i]=arr[j];
            		        arr[j]=temp;
            	  }
              }
              }
              
              System.out.println(Arrays.toString(arr));
             
           
              int num=21;
              
             boolean isPrime=  num > 1 && IntStream.rangeClosed(2,(int)Math.sqrt(num)).noneMatch(i->num %i==0);
            
       //  boolean isPrime = number > 1 &&IntStream.rangeClosed(2, (int)Math.sqrt(number)).noneMatch(i -> number % i == 0);
              
         
         System.out.println(isPrime);
         
           //  List<Integer> list2 = IntStream.range(1, 10).boxed().collect(Collectors.toList());
          //   System.out.println();
              
      
         
           List<Integer> asList = Arrays.asList(3,1,5,67,98,100);
             Optional<Integer> findFirst = asList.stream().sorted((a,b)->b.compareTo(a)).skip(1).findFirst();
                
              System.out.println(findFirst);
              
              
           
	}
  
}
