package com.leetcode;

public class ProdExceptItSelf {
	
	public static int[] productExceptSelf(int nums[]) {
		int n = nums.length;
		int[] result = new int[n];
		
		for(int i=0; i<n; i++) {
			result[i] = 1;
		}
		
		int leftProd =1;
		for(int i = 0; i<n; i++) {
			result[i] = result[i] * leftProd;
			leftProd = leftProd* nums[i];
			
		}
		
		int rightProd = 1;
		for(int i=n-1; i>=0; i--) {
			result[i] = result[i] * rightProd;
			rightProd = rightProd * nums[i];
		}
		return result;
			
	}
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		int[] result = productExceptSelf(nums);
		
		for(int value : result) {
			System.out.print(value + " ");
		}
	}

}
