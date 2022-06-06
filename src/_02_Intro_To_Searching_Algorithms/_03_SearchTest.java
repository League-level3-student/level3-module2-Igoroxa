package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
        String[] array = {"integer", "round", "value"};
    	assertEquals(2, _01_LinearSearch.linearSearch(array, "value"));
    	assertEquals(1, _01_LinearSearch.linearSearch(array, "round"));
    	assertEquals(-1, _01_LinearSearch.linearSearch(array, "multiplication"));
   
    	
        
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
    	int[] array = {0, 1, 2, 3, 4};
        assertEquals(3, _02_BinarySearch.binarySearch(array, 1, 4, 3));
        assertEquals(2, _02_BinarySearch.binarySearch(array, 0, 4, 2));
        assertEquals(-1, _02_BinarySearch.binarySearch(array, 0, 4, 6));
    }
}
