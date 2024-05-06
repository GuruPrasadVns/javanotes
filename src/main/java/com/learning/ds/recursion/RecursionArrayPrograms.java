package com.learning.ds.recursion;

public class RecursionArrayPrograms {
	
	public static int binarySearchRecursive(int[] arr, int left, int right, int searchKey) {
		if(left <= right) {
			int mid = left + (right - left)/2;
			if(arr[mid] == searchKey) {
				return mid;
			}
			else if(arr[mid] > searchKey) {
				return binarySearchRecursive(arr, left, mid - 1, searchKey);
			}
			else if(arr[mid] < searchKey) {
				return binarySearchRecursive(arr, mid + 1, right, searchKey);
			}
		}
		return -1;
	}
	
	
	public static int[] reverseArrayRec(int[] arr, int low, int high) {
		if(low > high)
			return arr;
		
		swap(arr, low , high);
		
		return reverseArrayRec(arr, ++low, --high);
	}


	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;			
	}

}
