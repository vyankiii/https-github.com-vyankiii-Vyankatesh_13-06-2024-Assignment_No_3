package com.javaArrays;
//Q 1. Write a Java program to sum values of an given array. the array is 'int[ ] values = {34, 56, 78, 20, 78, 90, 74};'.

public class ArraySum {

	public static void main(String[] args) {

		int[] values = { 34, 56, 78, 20, 78, 90, 74 };
		int sum = 0;

		// for each loop
		for (int num : values) {
			sum += num;
		}

		System.out.println("Sum of array values: " + sum);
	}
}
