package com.leetcode;

public class ReverseWordInString {
	
	public static void main(String[] args) {
		System.out.println(reverseWord("The Sky is blue "));
	}

	public static String reverseWord(String str) {
		String[] word=str.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i=word.length-1; i>=0;i--) {
			sb.append(word[i]);
			sb.append(" ");
			
		}
		return sb.toString().trim();
		
	}
}
