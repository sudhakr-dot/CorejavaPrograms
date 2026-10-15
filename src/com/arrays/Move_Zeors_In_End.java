package com.arrays;

import java.util.Arrays;

public class Move_Zeors_In_End {

	public static void main(String[] args) {

		int arr[] = { 1, 0, 3, 12, 0, 33, 0, 6 };

		int insert = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[insert] = arr[i];
				insert++;
			}
		}

		while (insert < arr.length) {
			arr[insert] = 0;
			insert++;
		}

		System.out.println(Arrays.toString(arr));

	}
}
