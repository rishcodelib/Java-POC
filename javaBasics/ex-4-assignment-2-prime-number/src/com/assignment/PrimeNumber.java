package com.assignment;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		int i, m = 0, flag = 0;

		System.out.println("Enter the  number to check prime.");

		Scanner sc = new Scanner(System.in);

		// Getting Number

		int n = sc.nextInt();

		// Dividing the number by 2

		m = n / 2;

		for (i = 2; i <= m; i++) {

			if (n % i == 0) {
				System.out.println("Not a Prime");
				flag = 1;
				break;
			}

		}

		if (flag == 0) {
			System.out.println("Number is Prime");
		}
		
	}

}
