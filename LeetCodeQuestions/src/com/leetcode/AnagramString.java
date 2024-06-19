package com.leetcode;

import java.util.Arrays;

public class AnagramString {
	public static void main(String[] args) {
		String str1 = "rat";
		String str2 = "cat";
		System.out.println(isAnagram(str1, str2));
		
	}
	public static String isAnagram(String str1 , String str2) {
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		return Arrays.equals(charArray1, charArray2)? "Valid Anagram" : "Not valid anagram";
		
		/*
		 * if(Arrays.equals(charArray1, charArray2)) { return "Valid Anagram"; } else {
		 * return "Not valid anagram"; }
		 */
		
		//System.out.println(charArray1.equals(charArray2));
	}

}
