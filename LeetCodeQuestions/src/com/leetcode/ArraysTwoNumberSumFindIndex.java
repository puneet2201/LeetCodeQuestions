package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class ArraysTwoNumberSumFindIndex {
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int target = 9;
		System.out.println(Arrays.toString(sumOfTwo(arr, target)));   //
		
	}

	public static int[] sumOfTwo(int[] arr, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<arr.length; i++) {
			int req_num = target - arr[i];
			if(map.containsKey(req_num)) {
				int[] arr1 = {map.get(req_num), i};
				return arr1;
				
			}
			map.put(arr[i], i);
		}
		return null;
		
	}
}
