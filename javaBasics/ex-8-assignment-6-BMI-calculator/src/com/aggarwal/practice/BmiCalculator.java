package com.aggarwal.practice;

import java.util.Scanner;

// Create Program, to perform BMI Calculator.

public class BmiCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Age");
		int age = sc.nextInt();

		System.out.println("Enter your weight");
		int weight = sc.nextInt();

		System.out.println("Enter your Height");
		int height = sc.nextInt();

		double BMI = weight / (height * height);
		System.out.println("BMI is weight/height X height : " + BMI);

	}

}
