package com.learning.ds.array;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArrayRevisionTest {
	
	@Test
	public void linearSearchTest() {
		int[] arr = { 10, 50, 30, 70, 80, 60, 20, 90, 40 };
		
		assertEquals(6, ArrayRevision.linearSearch(arr, 20));
		assertEquals(-1, ArrayRevision.linearSearch(arr, 100));
	}
	
	@Test
	public void leftRotationFirstApproach() {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int[] expectedArray = { 3, 4, 5, 6, 1, 2 };
		
		assertArrayEquals(expectedArray, ArrayRevision.leftRotationFirstApproach(arr, 2));
  	}
	
	@Test
	public void rightRotationFirstApproach() {
		int[] arr = {1, 2, 3, 4, 5, 6};
		int[] expectedArray = {5, 6, 1, 2, 3, 4};
		
		assertArrayEquals(expectedArray, ArrayRevision.rightRotationFirstApproach(arr, 2));
  	}

}
