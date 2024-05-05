package com.learning.ds.array;

// https://www.geeksforgeeks.org/array-data-structure/?ref=lbp

public class ArrayPrograms {

	
	// Time Complexity : O(log N)
	// Space Complexity : O(N)
	public static int binarySearchRecursive(int[] arr, int left, int right, int searchKey) {
		if(left <= right) {
			int mid = left + (right - left)/2;
			
			if(arr[mid] == searchKey)
				return mid;
			
			if(arr[mid] < searchKey)
				return binarySearchRecursive(arr, mid + 1, right, searchKey);
			
			else
				return binarySearchRecursive(arr, left, mid - 1, searchKey);
		}
		return -1;
	}
	
	
	public static int[] reverseArrayIterative(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		
		while(left < right) {
			swap(arr, left++, right--);
		}
		
		return arr;
	}

	private static void swap(int[] arr, int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
	
	public static int[] reverseArrayRecursive(int[] arr, int left, int right) {
		if(left > right)
			return arr;
		swap(arr, left, right);
		return reverseArrayRecursive(arr, ++left, --right);
	}
	
	
	// Time Complexity: O(N * d)
	//Auxiliary Space : O(1)
	public static int[] leftRotation(int[] arr, int d) {
		int n = arr.length;
		
		for(int i = 0 ; i < d; i++) {
			int temp = arr[0];
			int j = 1;
			for(; j < n; j++) {
				arr[j-1] = arr[j];
			}
			
			arr[j - 1] = temp;
		}
		
		return arr;
	}

	// Time Complexity: O(N * d)
	//Auxiliary Space : O(1)
	public static int[] rightRotation(int[] arr, int d) {
		int n = arr.length;
		
		for(int i = 0 ; i < d; i++) {
			int temp = arr[n - 1];
			int j = n - 2;
			
			for(; j >=0 ; j--) {
				arr[j + 1] = arr[j];
			}
			
			arr[j + 1] = temp;
		}
		
		return arr;
	}
	
	// Time Complexity : O(N)
	// Space Complexity : O(N)
	public static int[] leftRotationUsingTempArray(int[] arr, int d) {
		int n = arr.length;
		int[] tempArray = new int[n];
		
		int i = 0;
		for(int j = d; j < n; j++) {
			tempArray[i] = arr[j];
			i++;
		}
		
		int k = 0;
		for(int j = i; j < n; j++) {
			tempArray[j] = arr[k];
			k++;
		}
		return tempArray;
	}
	
	
	public static int[] rightRotationUsingTempArray(int[] arr, int d) {
		int n = arr.length;
		int[] tempArray = new int[n];
		
		int i = 0;
		
		for(int j = d; j < n; j++) {
			tempArray[j] = arr[i++];
		}
		
		int k= 0;
		
		while(i < n) {
			tempArray[k++] = arr[i++];
		}
		return tempArray;
	}
	
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
