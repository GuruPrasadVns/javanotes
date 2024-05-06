package com.learning.ds.array;

// https://www.geeksforgeeks.org/array-data-structure/?ref=lbp

public class ArrayPrograms {


	
	public static int[] findLargestThreeElements(int[] arr) {
		int[] result = new int[3];
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		int thirdMax = Integer.MIN_VALUE;
		
		int n = arr.length;
		
		for(int index = 0; index < n; index++) {
			
			if(arr[index] > thirdMax) {
				firstMax = secondMax;
				secondMax = thirdMax;
				thirdMax = arr[index];
			}
			else if(arr[index] > secondMax) {
				firstMax = secondMax;
				secondMax = arr[index];
			}
			else if(arr[index] > firstMax) {
				firstMax = arr[index];
			}
		}
		
		result[0] = firstMax;
		result[1] = secondMax;
		result[2] = thirdMax;
		
		return result;
	}
	
}
