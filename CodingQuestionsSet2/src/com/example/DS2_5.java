package com.example;

import java.util.Arrays;

public class DS2_5 {
	public <T> T removeChar(T[] arr) {
		Arrays.sort(arr);
		return arr[arr.length-3];
	}
}
