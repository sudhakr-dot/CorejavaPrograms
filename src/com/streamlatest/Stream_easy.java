package com.streamlatest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Stream_easy {

	public static void main(String[] args) {
	
	List<Integer> list = Arrays.asList(1,3,4,5,6,7,8);
		
	List<Integer> collect = list.stream().filter(v->v%2==0).collect(Collectors.toList());
	System.out.println(collect);
	List<Integer> list2 = list.stream().filter(v->v%2==0).map(v->v*v).collect(Collectors.toList());
	
	System.out.println(list2);
	
	
	Optional<Integer> first = list.stream().sorted().filter(v->v>5).findFirst();
	
	System.out.println(first.get());
	
	
	Integer reduce = list.stream().reduce(0,(a,b)->a+b);
	System.out.println(reduce);
	
	}
	
}
