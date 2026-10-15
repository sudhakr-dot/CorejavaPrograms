package com.core.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test01 {
	public static void main(String[] args) {

		int arr[] = { 2, 1, 5, 6, 7, 8, 1, 6, 8, 2 };

		Arrays.sort(arr);

		//System.out.println(Arrays.toString(arr));

		int count = 1;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == arr[i - 1]) {
				count++;
			} else {
			//	System.out.println(arr[i - 1] + " " + count);
				count = 1;
			}

		}
		//System.out.println(arr[arr.length - 1] + " " + count);

		String s = "sudhakarrrrkk";

		LinkedHashMap<Character, Long> linkedHashMap = s.chars().mapToObj(c -> (char) c).sorted()
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

	//	System.out.println(linkedHashMap);

		Optional<Character> map = linkedHashMap.entrySet().stream().max(Map.Entry.comparingByValue())
				.map(e -> e.getKey());

		//System.out.println(map);

		
		  
/*		  int []arr1={2,4,5,8}; int []arr2={3,5,9,11,13};
		  
		  int []res=new int[arr1.length+arr2.length];
		  
		  for(int i=0;i<arr1.length;i++){
		  
		  res[i]=arr1[i];
		  
		  }
		  
		  for(int i=0;i<arr2.length;i++){
		  
		  res[arr1.length+i]=arr2[i];
		  
		  } System.out.println(Arrays.toString(res));
		 

	*/
		int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        int[] mergedArray = mergeSortedArrays(arr1, arr2);

        System.out.println("Merged Sorted Array: " + Arrays.toString(mergedArray));

		
	}
	public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int m = arr1.length, n = arr2.length;
        int[] mergedArray = new int[m + n];
        int i = 0, j = 0, k = 0;

        // Merge the arrays using two-pointer approach  
        while (i < m && j < n) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        // Copy remaining elements from arr1
        while (i < m) {
            mergedArray[k++] = arr1[i++];
        }

        // Copy remaining elements from arr2
        while (j < n) {
            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;
    }

	
	
	
	
	
	
	
	
}
