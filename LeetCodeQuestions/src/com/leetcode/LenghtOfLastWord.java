package com.leetcode;

public class LenghtOfLastWord {
	public static void main(String[] args) {
		String str = "this is the moon    ";
	    String[] word = str.split(" ");
	   
	    System.out.println(word[word.length-1].length());
		
	}

}
