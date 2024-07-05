package com.javaArrays;

//Q 6. Write a Java program to calculate sum of odd numbers from an given array. the array is
//'int[ ] values = {24, 36, 47, 27, 13, 9, 5};'

public class OddSumCalculator {

	public static void main(String[] args) {

		int[] values = { 24, 36, 47, 27, 13, 9, 5 };
		int oddSum = 0;

		for (int num : values) {
			if (num % 2 != 0) {
				oddSum += num;
			}
		}

		System.out.println("Sum of odd numbers = " + oddSum);
	}
}
