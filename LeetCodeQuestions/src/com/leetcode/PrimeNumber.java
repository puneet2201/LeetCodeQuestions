package com.leetcode;

public class PrimeNumber {

	public static void main(String[] args) {
		int number = 3;
		primeNumber(number);
	}
	
	public static void primeNumber(int number) {
		
		int m=0;
		m=number/2;
		
		if(number == 0 || number == 1) {
			System.out.println("Not prime number");
		}
		else {
			int flag =0;
			for(int i=2; i<=m; i++) {
				if(number%i==0) {
					System.out.println("Not prime number");
					flag=1;
					break;
				}
			}
			
			if(flag==0) {
				System.out.println("prime number");
			}
		}
	}
}
