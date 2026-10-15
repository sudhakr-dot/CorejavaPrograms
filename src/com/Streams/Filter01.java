package com.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter01 {
 
	public static void main(String []args) {
	
		List<String> citys=Arrays.asList("Hyderabad","goa","Bangalore","Delhi");
		
		List<String> collect = citys.stream().filter(a->a.length()>=5).collect(Collectors.toList());
		
		collect.forEach(System.out::println);
		
		//List<Integer,String> list=new ArrayList<>();
		
	
	}
	
}

class User_Demo{
	
	private int id;
	private String name;
	
	public User_Demo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	 }
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}