package com.leetcode;

import java.util.Arrays;

public class RotateArrays {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int k=3;
		System.out.println(Arrays.toString(rotateArrays(arr, k)));
		
	}
	
	public static int[] rotateArrays(int[] arr, int k) {
		int n= arr.length;
		reverseArray(arr, 0, n-1);
		reverseArray(arr, 0, k-1);
		reverseArray(arr, k, n-1);
		
		return arr;
	}
	
	public static void reverseArray(int[] arr, int start, int end) {
		while(start<=end) {
			int temp=arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

}
