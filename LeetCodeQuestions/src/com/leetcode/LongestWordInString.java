package com.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class LongestWordInString {
	public static void main(String[] args) {
		String str = "I am a java developer with skill springboot, microservices";
		Optional<String> max = Arrays.stream(str.split(" ")).max(Comparator.comparingInt(String::length));
		System.out.println(max);
	}

}
