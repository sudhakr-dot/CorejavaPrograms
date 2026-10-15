package com.kiran;

import java.util.Scanner;
import java.util.TreeMap;

public class He1 {
	
	
	    public static int solve(int N, int[][] A) {
	        // TreeMap to store events (time → change in demand)
	        TreeMap<Long, Long> map = new TreeMap<>();

	        for (int i = 0; i < N; i++) {
	            long l = A[i][0];
	            long r = A[i][1];
	            long x = A[i][2];

	            map.put(l, map.getOrDefault(l, 0L) + x);
	            map.put(r + 1, map.getOrDefault(r + 1, 0L) - x);
	        }

	        long maxChefs = 0;
	        long current = 0;

	        for (long key : map.keySet()) {
	            current += map.get(key);
	            maxChefs = Math.max(maxChefs, current);
	        }

	        return (int) maxChefs;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int N = sc.nextInt();
	        int[][] A = new int[N][3];

	        for (int i = 0; i < N; i++) {
	            A[i][0] = sc.nextInt(); // l
	            A[i][1] = sc.nextInt(); // r
	            A[i][2] = sc.nextInt(); // x
	        }

	        System.out.println(solve(N, A));
	    }
	

}
