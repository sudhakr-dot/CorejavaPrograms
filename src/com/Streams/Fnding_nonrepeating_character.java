package com.Streams;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Fnding_nonrepeating_character {
	
	public static void main(String[] args) {
		String str="sudhakar";
		char[] input = str.toCharArray();
		
		Map<Character,Integer> map=new HashMap<>();
		
		for(Character c:input) {
			
			map.put(c,map.getOrDefault(c, 0)+1);
		}
		
		for(Entry<Character,Integer> e:map.entrySet()) {
			
			if(e.getValue()==1) {
			System.out.println(e.getKey());
			}
		}
		
		
	
		
		
		
		
	}

}
