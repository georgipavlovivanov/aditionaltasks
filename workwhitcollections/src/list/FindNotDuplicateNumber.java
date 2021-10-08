package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/*In the given array with N numbers (N - odd number), 
you have duplicate values without one .
 Write a function that will return that one value 
 write unit test - input data
 */

public class FindNotDuplicateNumber {

	
	public static void main(String[] args) {
		
		List<Integer> dublicateNumbers = new  ArrayList<>();
		
		dublicateNumbers.add(1);
		dublicateNumbers.add(1);
		dublicateNumbers.add(3);
		dublicateNumbers.add(-1);
		dublicateNumbers.add(3);
//		dublicateNumbers.add(5);
		
		List<Integer> uniqueNumber = findUnique(dublicateNumbers);
		System.out.println(uniqueNumber);
	}
	
	
	public static List<Integer> findUnique(List<Integer> numbers) {

		List<Integer> duplicateNumbers = new ArrayList<>();
		// iterate list and check is duplicate
		 for (int i = 0; i < numbers.size(); i++) {
			 int position = numbers.lastIndexOf(numbers.get(i));
			 	if( position > -1) {
			 		if(position != i){
			 			duplicateNumbers.add(numbers.get(position));
			 		}
			 	}
		}
		 numbers.removeAll(duplicateNumbers);
		 
		// return list
		return numbers;
	}
	
}
