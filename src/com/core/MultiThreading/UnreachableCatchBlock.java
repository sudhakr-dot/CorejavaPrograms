package com.core.MultiThreading;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

  class UnreachableCatchBlock {

	public static void main(String[] args) {

		String str = "sudhakar";

		Map<Character, Long> list = str.chars().mapToObj(c -> (char) c)
				.filter(c -> !(c == 'a' || c == 'e' || c == 'o' || c == 'i' || c == 'u'))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(list);
		String name = null;

		try {
			System.out.println(name = "hello");
		} catch (NullPointerException e) {
			// TODO: handle exception
		} catch (Exception ese) {
			// TODO: handle exception
		}

	}
}
