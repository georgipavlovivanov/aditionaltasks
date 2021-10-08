package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*In the given array with N numbers (N - odd number), 
you have duplicate values without one .
 Write a function that will return that one value 
 write unit test - input data
 */

// !!! Try to make time complexity O(N)
public class FindNitDuplicateNumber {

	
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		
		nums.add(1);
		nums.add(1);
		nums.add(3);
		nums.add(3);
		nums.add(2);
		
		Set uniqueNumber = findUniqueNumber(nums);
		
		System.out.println(uniqueNumber);
	}
	
	private static Set findUniqueNumber(List<Integer> nums) {
		
		Set set = new HashSet<>();
		
		for(int i = 0; i < nums.size(); i++) {
			Integer nextNum =  nums.get(i);
			if(set.contains(nextNum)) {
				set.remove(nextNum);
			} else {
				set.add(nextNum);
			}
			
		}
		
		
		return set;
	}
	
}
