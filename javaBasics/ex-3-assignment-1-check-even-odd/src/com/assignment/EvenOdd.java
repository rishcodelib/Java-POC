package com.assignment;

import java.io.Console;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 23;

		if ( checkEvenOdd(age) == 0) {
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("ODD NUMBER");
		}

	}

	private static int checkEvenOdd(int age) {
		// TODO Auto-generated method stub
		return age / 2;

	}

}
