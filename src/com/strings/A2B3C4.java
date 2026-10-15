package com.strings;

import java.util.HashMap;
import java.util.Map;

public class A2B3C4 {
	public static void main(String[] args) {

		String str="a4b3c4";
		 // char[] charArray = str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
		
			if(Character.isAlphabetic(str.charAt(i))) {
				System.out.print(str.charAt(i));
			}else  {
				
				int range = Character.getNumericValue(str.charAt(i));
				
				for (int j =0; j<range-1; j++) {
					System.out.print(str.charAt(i-1));

				}
				 
			}
		}
		
		String str2="aabbbcccc";
		
		Map<Character, Integer> map=new HashMap<>();
		
		
		for(char c:str2.toCharArray()) {
			
			if(map.containsKey(c)) {
			//	map.put(c,map.getOrDefault(c, 0)+1);
				 Integer count = map.get(c) ;
				map.put(c,count+1);
			}else {
				map.put(c, 1);
			}
		}
		
		System.out.println();
		for(char key:map.keySet()) {
			
			System.out.print(key+""+map.get(key));
		}
		System.out.println();
		System.out.println(map);
	
		
	String input="aabbbcccc";
		
  StringBuffer result =new StringBuffer();		
	
		int count=1;
  for(int i=1;i<input.length();i++){
	  
	  if(input.charAt(i)==input.charAt(i-1)) {
		  count++;
	  }else {
		  result.append(input.charAt(i-1));
		  result.append(count);
		  count=1;
	  }
  }
  result.append(input.charAt(input.length()-1));
  result.append(count);
  System.out.println(result);		
		
	}

}
