package com.javaArrays;
//Q 10. Write a Java program to calculate sum of odd and even numbers from an given array.     
//      int[ ] values = {24, 39, 36, 47, 27, 13, 66, 69, 55};

public class OddEvenFind {

	public static void main(String[] args) {
		int[] values = { 24, 39, 36, 47, 27, 13, 66, 69, 55 };
		int evenSum = 0;
		int oddSum = 0;

		for (int num : values) {
			if (num % 2 == 0) {
				evenSum += num;
			} else {
				oddSum += num;
			}
		}

		System.out.println("Sum of even numbers: " + evenSum);
		System.out.println("Sum of odd numbers: " + oddSum);
	}
}
