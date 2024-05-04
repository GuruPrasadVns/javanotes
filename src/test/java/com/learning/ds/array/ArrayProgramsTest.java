package com.learning.ds.array;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayProgramsTest {
	
	@Test
	public void linearSearchTest() {
		int[] arr = {10, 50, 30, 70, 80, 60, 20, 90, 40};
		int searchKey = 20;
		
		assertEquals(6, ArrayPrograms.linearSearch(arr, searchKey));
		assertEquals(-1, ArrayPrograms.linearSearch(arr, 100));
	}
	
	
	@Test
	public void leftRotationFirstApproach() {
		int[] arr = {1, 2, 3, 4, 5, 6};
		int[] expectedArray = {3, 4, 5, 6, 1, 2};
		
		assertArrayEquals(expectedArray, ArrayPrograms.leftRotation(arr, 2));
  	}
	
	@Test
	public void rightRotationFirstApproach() {
		int[] arr = {1, 2, 3, 4, 5, 6};
		int[] expectedArray = {5, 6, 1, 2, 3, 4};
		
		assertArrayEquals(expectedArray, ArrayPrograms.rightRotation(arr, 2));
  	}

}
