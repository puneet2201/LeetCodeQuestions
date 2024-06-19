package com.leetcode;

public class fibonacciSeries {
	public static void main(String[] args) {
		int nums=10;
		printFibonacci(nums);
		
	}
	
	//0,1,1,2,3,7
	
	public static void printFibonacci(int nums) {
		int a=0;
		int b=1;
		int sum=0;
		for(int i=0; i<nums; i++) {
			System.out.print(a+",");
			sum=a+b;
			a=b;
			b=sum;
			
		}
	}

}
