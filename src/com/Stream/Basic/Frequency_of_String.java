package com.Stream.Basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequency_of_String {

	public static void main(String[] args) {

		String str = "apple";

		Map<Character, Integer> map = new HashMap<>();
		int length = str.length();
		for (int i = 0; i < length; i++) {
			char c = str.charAt(i);
			Integer integer = map.get(c);
			if (map.containsKey(c)) {
				map.put(c, integer + 1);
			} else {
				map.put(c, 1);
			}
		}

		System.out.println(map);

		// Replace the Char in given String

		String input = "opentext";

		char replacletter = 't';

		if (input.indexOf(replacletter) == -1) {
			System.out.println("character is not Present");
			System.exit(0);
		}
		char[] array = input.toCharArray();

		int count = 1;
		for (int i = 0; i < array.length; i++) {

			if (array[i] == replacletter) {
				array[i] = String.valueOf(count).charAt(0);
				count++;

			}
		}

		System.out.println(Arrays.toString(array));

//Find First Non-Repeated Character

//approach-1
		for (int i = 0; i < input.length(); i++) {
			boolean unique = true;
			for (int j = 0; j < input.length(); j++) {

				if (i != j && input.charAt(i) == input.charAt(j)) {
					unique = false;
				}

			}
			if (unique) {
				System.out.println(input.charAt(i));
				break;
			}
		}

//Approach-2

		Map<Character, Long> collect = input.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
//System.out.println(collect);

		Character orElse = collect.entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey)
				.findFirst().orElse(null);

		System.out.println(orElse);

		// Reverse each word in the given String

		String sentn = "hello world";

		String[] words = sentn.split(" ");

		String revwords = "";
		for (String word : words) {
			String revword = "";
			for (int i = word.length() - 1; i >= 0; i--) {

				revword = revword + word.charAt(i);
			}
			revwords = revwords + revword + " ";
		}

		System.out.println(revwords);

		String sentence = "Hello world this is Java";

		String[] splitwords = sentence.split(" ");

		String collect2 = Arrays.stream(splitwords).map(word -> new StringBuilder(word).reverse().toString())
				.collect(Collectors.joining(" "));

		System.out.println(collect2);

	}

}
