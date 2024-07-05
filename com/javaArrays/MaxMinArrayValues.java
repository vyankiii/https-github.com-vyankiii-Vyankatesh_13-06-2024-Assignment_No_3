package com.javaArrays;
//Q 3. Write a Java program to find the maximum and minimum value from a given an array.
//array is 'int array[ ] = {45, 67, 98, 63, 59, 24, 48}' .

public class MaxMinArrayValues {

	public static void main(String[] args) {
		int[] array = { 45, 67, 98, 63, 59, 24, 48 };

		// Initialize max and min with the first element of the array
		int max = array[0], min = array[0];

		// find max and min values
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];
			}
		}

		System.out.println("Maximum value: " + max);
		System.out.println("Minimum value: " + min);
	}
}
