package com.leetcode;

public class PalindromString {
	
	public static void main(String[] args) {
		String str = "naman";
		System.out.println(palindromString(str));
		
	}

	public static boolean palindromString(String str) {
		//char[] chars=str.toCharArray();
		int i=0;
		int j=str.length()-1;
		while(i<j) {
		if(str.charAt(i)!=str.charAt(j)) {
			return false;
		}
		i++;
		j--;
	}
	return true;
}
}
