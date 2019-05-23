/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package SortUsingStream;

import java.util.List;
import java.util.stream.Collectors;

public class SortService {

	public static String sortListAsString(List<Integer> simpleList) {
		StringBuilder sortedList = new StringBuilder();
		
		// First step is to sort the list- this can be done with one line of code, using stream
		List<Integer> sorted = simpleList.stream().sorted().collect(Collectors.toList());
		
		// Now just use a foreach on the sorted list, adding each to the string builder
		sorted.forEach(intVal-> {
			sortedList.append(String.valueOf(intVal)).append(",");
		});
		
		// Remove the trailing comma
		String finalList = sortedList.toString().substring(0, sortedList.length()-1);
		
		return finalList;
	}
    
}
