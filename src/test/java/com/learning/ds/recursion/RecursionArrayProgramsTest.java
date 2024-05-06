package com.learning.ds.recursion;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class RecursionArrayProgramsTest {

	@Test
	public void binarySearchRecursiveTest() {
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		assertEquals(1, RecursionArrayPrograms.binarySearchRecursive(arr, 0, arr.length - 1, 20));
		assertEquals(3, RecursionArrayPrograms.binarySearchRecursive(arr, 0, arr.length - 1, 40));
		assertEquals(-1, RecursionArrayPrograms.binarySearchRecursive(arr, 0, arr.length - 1, 5));
	}
	
	@Test
	public void arrayReverseRecTest() {
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		int[] expectedArray = {90,80, 70, 60, 50, 40, 30, 20, 10};
		
		assertArrayEquals(expectedArray, RecursionArrayPrograms.reverseArrayRec(arr, 0, arr.length - 1));
	}

}
