package com.Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MargeTwoLists {

	public static void main(String []args) {
		
		List<Integer> list=Arrays.asList(10,29,39,45);
		
		List<Integer> list1=Arrays.asList(10,29,59,45);

		List<Integer> list2 = Stream.concat(list.stream(),list1.stream()).collect(Collectors.toList());
		
		System.out.println(list2);
		
		List<Integer> list3 = list2.stream().distinct().collect(Collectors.toList());
		System.out.println(list3);
		
		Collections.reverse(list3);
	
		System.out.println(list3);
		
		List<Integer> collect = IntStream.range(0,list3.size()).mapToObj(n->list3.get(list3.size()-1)).collect(Collectors.toList());


		System.out.println(collect);
		
		
		
		 List<Integer> original = Arrays.asList(10, 20, 30, 40, 50);

	        List<Integer> reversed = IntStream.range(0, original.size())
	                .mapToObj(i -> original.get(original.size() - 1 -i))
	                .collect(Collectors.toList());

	        System.out.println("Original List: " + original);
	        System.out.println("Reversed List: " + reversed);

		
		
		
		
		
		
		
		
		
		
		
	}
}
