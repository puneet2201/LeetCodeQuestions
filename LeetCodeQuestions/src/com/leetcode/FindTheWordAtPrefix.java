package com.leetcode;

public class FindTheWordAtPrefix {

	public static void main(String[] args) {
		String str1 = "this problem is very easy problem";
		String str2 = "pro";
		System.out.println(isWordfind(str1, str2));
		
	}
	public static int isWordfind(String str1, String str2) {
		String[] word = str1.split(" ");
		for(int i=1; i<word.length; i++) {
			if(word[i].startsWith(str2)){
				//System.out.println(word[i]);
				return i+1;
			}
		}
		return -1;
		
	}
}
