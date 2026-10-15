package com.core.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_01 { 
	public static void main(String[] args) {
	List<Integer> al= Arrays.asList(10,20,30,40,56,3,7,13,15,17);
	    
	List<Integer> list = al.stream().filter(i->i%2==0).collect(Collectors.toList());
	List<Integer> list1 = al.stream().filter(i->i%2==1).collect(Collectors.toList());
	
	 System.out.println(list);
	 System.out.println(list1);
	
	}

}
