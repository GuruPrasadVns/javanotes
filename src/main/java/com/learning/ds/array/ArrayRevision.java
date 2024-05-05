package com.learning.ds.array;

public class ArrayRevision {
	
	public static int linearSearch(int[] arr, int searchItem) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == searchItem)
				return i;
		}
		
		return -1;
	}
	
	
	public static int[] leftRotationFirstApproach(int[] arr, int searchIndex) {
		int n = arr.length;
		
		for(int i = 0; i < searchIndex; i++) {
			int temp = arr[0];
			
			for(int j = 1; j < n ; j++) {
				arr[j - 1] = arr[j];
			}
			
			arr[n - 1] = temp;
		}
		
		return arr;
	}
	
	public static int[] rightRotationFirstApproach(int[] arr, int searchIndex) {
		int n = arr.length;
		
		for(int i = 0; i < searchIndex; i++) {
			int temp = arr[n - 1];
			
			for(int j = n - 2; j >=0; j--) {
				arr[j + 1] = arr[j];
			}
			
			arr[0] = temp;
		}
		
		return arr;
	}
}
