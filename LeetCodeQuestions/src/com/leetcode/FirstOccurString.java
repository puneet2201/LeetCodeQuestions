package com.leetcode;

public class FirstOccurString {
	
	public static void main(String[] args) {
		System.out.println(firstOccurence("leetcode", "leet"));
	}
	
	public static int firstOccurence(String haystack, String needle) {
		int hlength = haystack.length();
		int nlength = needle.length();
		for(int i=0; i<hlength-nlength+1; i++) {
			if(haystack.charAt(i)==needle.charAt(0)) {
				if(haystack.substring(i, nlength+i).equals(needle)) {
					return i;
				}
			}
		}
		return -1;
		
	}

}
