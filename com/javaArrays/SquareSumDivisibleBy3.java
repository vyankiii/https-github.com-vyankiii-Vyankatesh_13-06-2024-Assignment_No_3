package com.javaArrays;
//Q 8. Write a Java program to calculate sum of square of numbers divisible by 3 from an given array.
//the array is 'int[ ] values = {4, 6, 7, 2, 12, 9, 15};'.

public class SquareSumDivisibleBy3 {

	public static void main(String[] args) {
		
		
		int[] values = { 4, 6, 7, 2, 12, 9, 15 };
		int sumOfSquares = 0;

		for (int num : values) {
			if (num % 3 == 0) {
				sumOfSquares += num * num;
			}
		}

		System.out.println("Sum of squares of numbers divisible by 3 = " + sumOfSquares);
	}
}
