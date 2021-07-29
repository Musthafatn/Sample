package com.example;

import java.util.Scanner;

public class Calculator {

	public static void main(final String[] args) {
		final Scanner s = new Scanner(System.in);
		final Long aa;
		final int a = s.nextInt();
		final int b = s.nextInt();
		final int c = add(a, b);
		System.out.println(c);
	}

	public static int add(final int a, final int b) {
		final int x = a;
		final int y = b;
		final int z = x + y;
		return z;
	}

	public static int sub(final int a, final int b) {
		final int x = a;
		final int y = b;
		final int z = x - y;
		return z;
	}

}
