package com.javaArrays;
//Q 2. Write a Java program to calculate the average value of array elements.
//the array is 'int array[ ] = {55, 66, 44, 22, 55, 77}' 
public class ArrayAverage {
	
    public static void main(String[] args) {
    	
        int[] array = {55, 66, 44, 22, 55, 77};
        int sum = 0;
        
     // for each loop
        for (int value : array) {
            sum += value;
        }
    //  calculate avarage
        double average = (double) sum / array.length;
        
        System.out.println("Average value= " + average);
    }
}
