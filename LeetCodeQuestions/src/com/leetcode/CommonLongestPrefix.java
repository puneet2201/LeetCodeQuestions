package com.leetcode;

import java.util.Arrays;

public class CommonLongestPrefix {
	public static void main(String[] args) {
		String[] str = {"apple", "aplet","apps", "application"};
		System.out.println(commomLongestPrefix(str));
		
	}
	
	public static String commomLongestPrefix(String[] str) {
		Arrays.sort(str);
		String str1 = str[0];
		String str2 = str[str.length-1];
		int i=0;
		while(i<str1.length()) {
			if(str1.charAt(i)==str2.charAt(i)) {
				i++;
			}
			else {
				break;
			}
		}
		return i==0?"":str1.substring(0, i);
		
		
		
	}

	
}
