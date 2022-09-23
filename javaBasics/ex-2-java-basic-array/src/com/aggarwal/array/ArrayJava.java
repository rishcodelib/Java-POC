package com.aggarwal.array;

public class ArrayJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		firstExample();
//		secondExample();
//		thirdExample();
//		fourthExample();
		fifthExample();

	}

	private static void fifthExample() {
		// TODO Auto-generated method stub
		int[][] school = new int[4][];
		school[0] = new int[] { 12, 12, 23, 23 };
		school[1] = new int[] { 12, 12, 33, 23 };
		school[2] = new int[] { 12, 12, 25, 23 };
		school[3] = new int[] { 12, 12, 26, 23 };

		for (int i = 0; i < school.length; i++) {
			for (int score : school[i]) {
				System.out.println(score + " ");
			}
			System.out.println();
		}
	}

	private static void fourthExample() {
		// for CREATING Multi-Dimension Array in JAVA

		int[][] marks = { { 12, 21, 23, 32, 44, 5, 34 }, { 12, 32, 43, 54, 56, 66, 34 }, { 12, 12, 23, 23 },
				{ 12, 12, 23, 23 } };
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println(marks[i][j] + " ");
			}
		}
	}

	private static void thirdExample() {
		// TODO Auto-generated method stub
		int[] marks = { 56, 12, 323, 23, 43, 534, 35, 23, 2, 23 };
		// Using FOR EACH Loop
		for (int mks : marks) {
			System.out.println(mks);
		}
	}

	private static void secondExample() {
		// TODO Auto-generated method stub
		final String names[] = new String[5];

		int index = 0;

		do {
			System.out.println("name of PERSON ");
			names[index] = System.console().readLine();
			index++;
		} while (index < 4);
		System.out.println("All VaÏlues are set lets Read Them");

		for (String name : names) {
			System.out.println(name);
		}

	}

	private static void firstExample() {
		// TODO Auto-generated method stub

		final int size = 5;

		final int data[] = new int[size];

		// Using Loop to write to a collection using index.

		for (int i = 0; i < size; i++) {
			data[i] = i + 1;
			System.out.println(i);
		}
// Display Data through FOR-EACH Loop
		for (int i : data) {
			System.out.println("FOR EACHLOOP SAYS " + i);
		}

	}

}
