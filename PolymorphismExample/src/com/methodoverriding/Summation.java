package com.methodoverriding;

public class Summation extends Addition {

	public void add(String a, int b, int c) {
		System.out.println("Summation: " + (a + b + c));
	}
	
	public void sub(int a, int b, int c) {
		System.out.println("summation : " + (a + b + c));
	}
}
