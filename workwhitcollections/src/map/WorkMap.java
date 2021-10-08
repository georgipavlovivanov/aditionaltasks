package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

// Use Map when need pair of data - Map<KEY, VALUE> shorthand-> Map<k,v>
// represent graphically: 
/*        Map
  	[ key -> value]    both are cold entry
  
  	[ key -> value]
  
  	[ key -> value]
  
 */

/*							need natural order use  TreeMap<K,V> - but need implement Comparable		
 	- if need sorted data  /
 						  \ need specific order use TreeMap - but implement Comparator
 	- if no need order fast search and input use HashMap<K,V>					  

 */


public class WorkMap {
	public static void main(String[] args) {
		// initialization
		// no order
		Map <String,Integer> hm = new HashMap<>();
			System.out.println("--- no order ---");
		hm.put("1", 1);
		hm.put("2", 2);
		hm.put("3", 3);
		hm.put("4", 4);
//		hm.put("4", 5);
		
		System.out.println(hm);
		
		// order 
		Map<String,Integer> tm = new TreeMap<>();
		System.out.println("---  order ---");

		tm.put("1",1);
		tm.put("2",2);
		tm.put("3",3);
		tm.put("4",4);
//		tm.put("4",5);
		
		System.out.println(tm);
	
		//remove
		System.out.println("---  remove ---");
		hm.remove("1");
		System.out.println(hm);
		
		// iterate map
		for( Integer integer:hm.values()) {
			System.out.println(integer);
		}
	}
}
