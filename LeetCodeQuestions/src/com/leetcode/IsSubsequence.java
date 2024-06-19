package com.leetcode;


public class IsSubsequence {
	public static void main(String[] args) {
		String str1= "abx";
		String str2= "ahbgdc";
		System.out.println(isSubsequence(str1, str2));
		
	}
	public static boolean isSubsequence(String str1, String str2) {
		int i = 0;
		int j = 0;
		if(str1.length()==0) {
			return true;
		}
		while(i<str1.length() && j<str2.length()){
			if(str1.charAt(i)==str2.charAt(j)) {
				i++;
				j++;
			}
			else {
				j++;
			}
			
		}
		return i==str1.length() ? true : false;
		
	}

}
