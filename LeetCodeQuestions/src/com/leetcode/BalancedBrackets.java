package com.leetcode;

import java.util.Stack;

public class BalancedBrackets {
	public static void main(String[] args) {
		String str = "{({[]})}";
		System.out.println(isBalancedBracket(str));
	}
	public static boolean isBalancedBracket(String str) {
		Stack<Character> stack = new Stack<>();
		for(char c : str.toCharArray()) {
			if(c=='{' || c=='(' || c=='[') {
				stack.add(c);
			}
			else {
				if(stack.isEmpty()) {
					return false;
				}
				if(c=='}' && stack.peek()!= '{') {
					return false;
				}
				if(c==')' && stack.peek()!= '(') {
					return false;
				}
				if(c==']' && stack.peek()!= '[') {
					return false;
				}
				stack.pop();
			}
			
		}
		return stack.isEmpty();
	}

}
