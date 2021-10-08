package linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

class TestFindUniqueNumberLinkedList {

	@Test
	void test() {

		Integer[] nums = { 1, 2, 2, 1, 4, 4, 5 };
		
		Integer[] secondNums = { 1, 2, 5, 2, 1 };
		
		Integer[] thirdNums = { 1, 5, 1 };
		
		Integer[] fourthNums = { 1, 5, 1, 1 };
		
		Integer[] lastNums = { 5 };
		
		

		LinkedList<Integer> firstDuplicateList = new LinkedList<>(Arrays.asList(nums));

		List<Integer> firstresult = FindNotDuplicateNumber.findUniqueNumber(firstDuplicateList);
		
		List<Integer> secondResult =  FindNotDuplicateNumber.findUniqueNumber(new LinkedList<>(Arrays.asList(secondNums)));
	
		List<Integer> thirdResult =  FindNotDuplicateNumber.findUniqueNumber(new LinkedList<>(Arrays.asList(thirdNums)));
		
		List<Integer> fourthResult =  FindNotDuplicateNumber.findUniqueNumber(new LinkedList<>(Arrays.asList(fourthNums)));
		
		List<Integer> lastResult =  FindNotDuplicateNumber.findUniqueNumber(new LinkedList<>(Arrays.asList(lastNums)));
		
		List<Integer> expected = new ArrayList<>();
		expected.add(5);
		
		
		
		
		// TEST
		assertEquals(expected, firstresult);
		
		assertEquals(expected, secondResult );
		
		assertEquals(expected, thirdResult );
		
		assertEquals(expected, fourthResult ); // here problem expected=5 actual =5,1 issue -not work whit even list
		
		assertEquals(expected, lastResult );

	}

}
