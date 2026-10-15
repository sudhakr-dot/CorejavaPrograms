package com.Streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class GroupingBy01 {
	public static void main(String[] args) {

		List<String> citys = Arrays.asList("Hyderabad", "goa", "Bangalore", "Delhi", "Hyderabad", "goa");

		/*
		 * Map<Object, Long> map = citys.stream().collect(Collectors .groupingBy(a->a,
		 * Collectors.counting()));
		 * 
		 * List<String> list = citys.stream().sorted().collect(Collectors.toList());
		 * 
		 * //System.out.println(list);
		 *
		 */ LinkedHashMap<String, Long> collect2 = citys.stream()
				.collect(Collectors.groupingBy(a -> a, LinkedHashMap::new, Collectors.counting()));

 List<String> map2 = collect2.entrySet().stream().filter(e -> e.getValue() == 1).map(e -> e.getKey()).collect(Collectors.toList());
		System.out.println(map2);
		
		/*
		 * System.out.println(map);
		 * 
		 * 
		 * Long max = Collections.max(map.values()); System.out.println(max);
		 * 
		 * List<Object> list2 =
		 * (map.entrySet().stream().filter(a->a.getKey()==max).map(Map.Entry::getKey).
		 * collect(Collectors.toList()));
		 * 
		 * System.out.println(list2);
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * ArrayList<Account> al=new ArrayList<Account>(); al.add(new Account(1, "ravi",
		 * 1000d)); al.add(new Account(2, "ram", 40000d)); al.add(new Account(3, "hari",
		 * 10000d)); al.add(new Account(4, "ravfsfsai", 50000d)); al.add(new Account(5,
		 * "wewr", 90000d)); al.add(new Account(6, "rasdfvi", 200d));
		 * 
		 * List<Account> collect =
		 * al.stream().sorted(Comparator.comparingDouble(Account::getBalance)).collect(
		 * Collectors.toList());
		 * 
		 * List<Account> SotredBasedonNames =
		 * al.stream().sorted(Comparator.comparing(Account::getAccountname)).collect(
		 * Collectors.toList());
		 * 
		 * 
		 * 
		 * 
		 * 
		 * System.out.println(SotredBasedonNames);
		 * 
		 * 
		 * 
		 * for(Account acc:SotredBasedonNames) {
		 * 
		 * System.out.println(acc.getAccid()
		 * +"  "+acc.getAccountname()+"  "+acc.getBalance());
		 * 
		 * }
		 * 
		 * 
		 * 
		 */

	}
}
