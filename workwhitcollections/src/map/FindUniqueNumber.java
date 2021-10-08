package map;

import java.util.ArrayList;
import java.util.Collections;import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*In the given array with N numbers (N - odd number), 
you have duplicate values without one .
 Write a function that will return that one value 
 write unit test - input data
 */

// !!! Try to make time complexity O(N)
public class FindUniqueNumber {

	
	
	public static void main(String[] args) {
List<Integer> nums = new ArrayList<>();
		
		nums.add(1);
		nums.add(1);
		nums.add(3);
		nums.add(3);
		nums.add(2);
		System.out.println(findUniqueNumber(nums));
		
	}
	
	
 static int findUniqueNumber(List<Integer> nums) {
		
		HashMap<Integer,Integer > duplicates = new HashMap<>();
		
		for(Integer nextNum : nums) {
			if(!duplicates.containsKey(nextNum)) {
				duplicates.put(nextNum, 1);
			} else {
				// idea of part after comma is increment counter
				duplicates.put(nextNum, duplicates.get(nextNum)+1);
			}
		}
	
		List<Map.Entry<Integer, Integer>> ascendingOrder = new ArrayList<>(duplicates.entrySet());
				
		// Sort the list
			Collections.sort(ascendingOrder,new Comparator<Map.Entry<Integer, Integer>>() {

				@Override
				public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
					return o1.getValue() - o2.getValue();
				}
			});
			
			
		return ascendingOrder.get(0).getKey();
	}
}
