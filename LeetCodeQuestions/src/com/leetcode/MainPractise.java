package com.leetcode;


public class MainPractise {
	public static void main(String[] args) {
		String str = "The sky is blue";
		System.out.println(isMainPractise(str));
		
	}
	public static String isMainPractise(String str) {
		String[] word = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i=word.length-1; i>=0; i--) {
			sb.append(word[i]);
			sb.append(" ");
		}
		return sb.toString();
	}

}
