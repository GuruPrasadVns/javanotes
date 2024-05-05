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

}
