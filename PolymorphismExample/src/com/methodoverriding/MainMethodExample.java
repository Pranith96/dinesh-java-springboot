package com.methodoverriding;

public class MainMethodExample {

	public static void main(String[] args) {

		Summation summation = new Summation();
		summation.add(2, 3, 4);
		summation.sub(2, 3, 4);

		Summation summation1 = new Summation();
		summation1.add("HI", 3, 4);

		Addition addition = new Summation();
		addition.add(2, 3, 4);
	}

}
