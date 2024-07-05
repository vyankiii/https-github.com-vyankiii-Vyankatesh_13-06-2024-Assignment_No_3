package com.javaArrays;
//Q 5. Write a Java program to calculate sum of even numbers from an given array. 
//the array is 'int[ ] values = {4, 6, 7, 2, 13, 9, 5};'.

public class EvenSumCalculator {

	public static void main(String[] args) {
		
		int[] values = { 4, 6, 7, 2, 13, 9, 5 };
		int evenSum = 0;

		for (int num : values) {
			if (num % 2 == 0) {
				evenSum += num;
			}
		}

		System.out.println("Sum of even numbers is = " + evenSum);
	}
}
