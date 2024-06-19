package com.leetcode;

public class RemoveDuplicateElement {
	
	public static void main(String[] args) {
		int[] nums = {(int) 1,1,2,3,3,4,5,5,6,6,6,6};
		
		System.out.println(removeDupElement(nums));
		
	}
	public static int removeDupElement(int[] nums) {
		int count=0;
		for(int i=0; i<nums.length; i++) {
			if(i<nums.length-1 && nums[i]==nums[i+1]) {
				continue;
			}
			else {
				nums[count]=nums[i];
				count++;
			}
		}
		return count;
	}

}
