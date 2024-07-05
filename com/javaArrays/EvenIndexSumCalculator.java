package com.javaArrays;
//Q 7.Write a Java program to calculate sum of numbers at even index from an given array. 
//the array is 'int[ ] values = {4, 6, 7, 2, 13, 9, 5};'.

public class EvenIndexSumCalculator {
	
    public static void main(String[] args) {
    	
        int[] values = {4, 6, 7, 2, 13, 9, 5};
        int evenIndexSum = 0;

        for (int i = 0; i < values.length; i +=2) {
        	
            evenIndexSum += values[i];
        }
        // 4 +7 + 13+ 5 = 29
        System.out.println("sum of numbers even index = " + evenIndexSum);
    }
}

