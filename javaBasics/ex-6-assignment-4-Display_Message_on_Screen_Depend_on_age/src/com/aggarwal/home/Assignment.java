package com.aggarwal.home;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {

		System.out.println("Enter your Age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		if (age < 16) {
			System.out.println("You Can NOT DRIVE");
		}
		if (age < 18) {
			System.out.println("You Can NOT VOTE");
		}
		if (age < 25) {
			System.out.println("You Can NOT RENT a CAR");
		}
		if (age > 25) {
			System.out.println("DO ANYTHING");
		}

	}
}
