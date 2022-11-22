package com.example;

import java.util.Stack;

public class DS2_7 {
	public static String checkBalance(char[] arr) {
		Stack<Character> s = new Stack<Character>();
		for(char c: arr) {
			if(c == '{' || c == '[' || c == '(') {
				s.push(c);
			}else {
				if(c == '}') {
					if(s.isEmpty() || s.peek() != '{') {
						return "Invalid";
					}
					s.pop();
				}else if(c == ']') {
					if(s.isEmpty() || s.peek() != '[') {
						return "Invalid";
					}
					s.pop();
				}else {
					if(s.isEmpty() || s.peek() != '(') {
						return "Invalid";
					}
					s.pop();
				}
			}
		}
		return "Valid";
	}
	
	public static void main(String[] args) {
		System.out.println(checkBalance("{()}[]".toCharArray()));
	}
}
