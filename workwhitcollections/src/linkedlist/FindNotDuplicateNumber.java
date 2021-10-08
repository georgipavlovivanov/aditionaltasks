package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*In the given array with N numbers (N - odd number), 
you have duplicate values without one .
 Write a function that will return that one value 
 write unit test - input data
 */

// !!! Try to make time complexity O(N)
public class FindNotDuplicateNumber {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(1);
		linkedList.add(5);
		linkedList.add(1);
		linkedList.add(1);
//		linkedList.add(5);
		
		 List<Integer> uniqueNumber = findUniqueNumber(linkedList);
		System.out.println(uniqueNumber.toString());

	}

	public static List<Integer> findUniqueNumber(LinkedList<Integer> nums) {
		List<Integer> duplicateNumbers = new ArrayList<>();
		
		// iterate trough linkedlist
		
		for(int i = 0; i < nums.size(); i++) {
			Integer nextNumber = nums.get(i);
				
			if(!duplicateNumbers.contains(nextNumber)) {
				duplicateNumbers.add(nextNumber);
			} else if(duplicateNumbers.contains(nextNumber)){
				duplicateNumbers.remove(nextNumber);
			}
			
		}
		// return last item is unique
		return duplicateNumbers;
	}

}
