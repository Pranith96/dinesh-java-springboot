package com.methodoverloading;

public class AdditionMain {

	public static void main(String[] args) {

		Addition addition = new Addition();
		addition.add(2, 4);
		addition.add(2, 3, 4);
		addition.add(2, 3, 4, 5);
	}

}
