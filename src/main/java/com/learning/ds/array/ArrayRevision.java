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
	
	
	public static int[] leftRotationUsingTempArray(int[] arr, int searchIndex) {
		int n = arr.length;
		int[] tempArray = new int[n];
		
		int j = 0;
		
		for(int i = 0 + searchIndex; i < n ; i++) {
			tempArray[j++] = arr[i];
		}
		
		int k = 0;
		
		for(; j < n; j++) {
			tempArray[j] = arr[k++];
		}
		
		return tempArray;
	}
	
	// {1, 2, 3, 4, 5, 6}
	// {5, 6, 1, 2, 3, 4}
	public static int[] rightRotationUsingTempArray(int[] arr, int searchIndex) {
		int n = arr.length;
		int[] temp = new int[n];
		
		int j = 0;
		
		for(int i = 2; i < n; i++) {
			temp[i] = arr[j++];
		}
		
		int k = 0;
		
		for( ; j < n; j++) {
			temp[k++] = arr[j];
		}
		
		return temp;
	}
}
