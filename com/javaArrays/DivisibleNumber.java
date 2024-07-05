package com.javaArrays;
//Q 9.Write a java program to find the numbers which are divisible by 3 and 4 from a given array.
//int values[] = {56, 45, 30, 69, 28, 18, 60}

public class DivisibleNumber {

	public static void main(String[] args) {

		int[] values = { 56, 45, 30, 69, 28, 18, 60 };

		System.out.print("Numbers divisible by 3 and 4: ");
		for (int num : values) {
			if (num % 3 == 0 && num % 4 == 0) {
				System.out.println(num);
			}
		}
	}
}
