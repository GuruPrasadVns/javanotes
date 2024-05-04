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

}
