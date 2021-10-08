package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/* Set - give opportunities not repeat objects , here has no guarantee order of items
 *  !!! - if won't to keep order use -> LinkedHashSet 
 *  													if won't natural order implement Comparable
 *  !!! - if won't to keep data sorted use -> TreeSet /  
 *  												  \
 *  													if won't specific order implement Comparator
 *  !!! - convert set to list - list.addAll(customSet);
 *  
 * !!! GENERALY - use when need unique values
 */
public class WorkHashSet {

	public static void main(String[] args) {

		// possible initialization

		// don't keep order
		Set noOrder = new HashSet<>();
		// keep order - it means order of incoming
		Set order = new LinkedHashSet<>();
		// make sorted data
		Set sorted = new TreeSet<>();

		// add element to set
		System.out.println("--- don't keep order ---");
		noOrder.add(1);
		noOrder.add(3);
		noOrder.add(4);
		noOrder.add(2);
		System.out.println(noOrder);

		System.out.println("--- keep order of input ---");
		order.add(1);
		order.add(3);
		order.add(4);
		order.add(2);
		System.out.println(order);
		
		System.out.println("--- sorted data by criteria in this case is natural(it mean implemet Comparabale ---");
		sorted.add(4);
		sorted.add(3);
		sorted.add(2);
		sorted.add(1);
		System.out.println(sorted);
		
		// remove
		System.out.println("--- remove from set ---");
		noOrder.remove(3);
		System.out.println(noOrder);
		
	}


}
