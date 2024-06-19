package com.leetcode;

import java.util.Arrays;

public class PlusOneQuestion {
	public static void main(String[] args) {
		int digit[] = {9};
		System.out.println(Arrays.toString(isPlusOne(digit)));
		
	}
	
	public static int[] isPlusOne(int[] digit) {
		int n=digit.length;
		for(int i=n-1; i>=0; i--) {
			if(digit[i]<9) {
				digit[i]++;
				return digit;
			}
			digit[i]=0;
		}
		int[] newNumber = new int[n+1];
		newNumber[0]=1;
		return newNumber;
	}

}
