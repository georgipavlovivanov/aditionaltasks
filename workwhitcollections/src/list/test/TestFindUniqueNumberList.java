package list.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import list.FindNotDuplicateNumber;

class TestFindUniqueNumberList {

	@Test
	void test() {
		
		Integer[] nums = { 1, 2, 2, 1, 4, 4, 5 };
		
		Integer[] secondNums = { 1, 2, 5, 2, 1 };
		
		Integer[] thirdNums = { 1, 5, 1 };
		
		Integer[] fourthNums = { 1, 5, 1, 1 };
		
		Integer[] lastNums = { 5 };

		
		List fNumbers = new ArrayList<>(Arrays.asList(nums));
		
		List sNumbers = new ArrayList<>(Arrays.asList(secondNums));
		
		List tNumbers = new ArrayList<>(Arrays.asList(thirdNums));
		
		List fourthNumbers = new ArrayList<>(Arrays.asList(fourthNums));
		
		List lNumbers = new ArrayList<>(Arrays.asList(lastNums));
		
		FindNotDuplicateNumber list = new FindNotDuplicateNumber();
		
		
		
		List<Integer>  expected = new ArrayList<>();
		 
		 
		 
		 expected.add(5);
		 
		assertEquals(expected,list.findUnique(fNumbers) );
		
		assertEquals(expected,list.findUnique(sNumbers) );
		
		assertEquals(expected,list.findUnique(tNumbers) );
		
		assertEquals(expected,list.findUnique(fourthNumbers) );
		
		assertEquals(expected,list.findUnique(lNumbers) );
		
	}

}
