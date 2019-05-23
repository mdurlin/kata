/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package SortUsingStream;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class SortServiceTest {
	
	/* This project will contain test kata that demonstrate 
	 * how to leverage Java 8 Streams to manage Sorting of various Collections
	 */
	
	// First, start with a simple ArrayList with 3 integers and expect a sorted list of string
	@Test
	public void SortSimpleArray() {
		List<Integer> simpleList = new ArrayList<Integer>();
		simpleList.add(4);
		simpleList.add(2);
		simpleList.add(20);
		
		String expected = "2,4,20";
		String actual = SortService.sortListAsString(simpleList);
		
		assertTrue(expected.equals(actual));
	}
	
}
