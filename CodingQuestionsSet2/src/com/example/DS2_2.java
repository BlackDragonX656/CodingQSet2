package com.example;

public class DS2_2 {
	void swap(int a, int b) {
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
	}
}
