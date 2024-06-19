package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LexicographyString {
	public static void main(String[] args) {
		String str = "welcometojava";
		int n=3;
		List<String> list = new ArrayList<>();
		for(int i=0; i<=str.length()-n; i++) {
			list.add(str.substring(i, i+n));
		}
		Collections.sort(list);
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));

	}
	

}
