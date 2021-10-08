package list;

import java.util.ArrayList;
import java.util.List;

/* List is interface which use to work whit collections of items(those are sequence of items).
 * 
 * When use list:
	I) List give opportunities:
	 	- keep order of items by indexes
	 	- get items by index
	 	- remove items by index or object
	 	- can replace items in sequences whit method - set(index, object)
	 	
!!! General - we use List when we need order of items and can have more than one appearances same item 
				and need keep order of items and need access by index,
				and has more search operation than add and remove.
					 	
*/
public class ListWork {

	
	public static void main(String[] args) {
		// Initialization
		List<String> listOfStrings = new ArrayList<>();
		
		// add items - whit method . add(item)
		//	indexes are places of storage data like a drawer
		// index -> |       0(drawer)	 |        1(drawer)	  |     2(drawer)	  |
		//	 		[ "I'm on postion-1" | "I'm on postion-2" | "I'm on postion-3"]
		
		System.out.println("--- additems in  list ---");
		listOfStrings.add("I'm on postion-1");
		listOfStrings.add("I'm on postion-2");
		listOfStrings.add("I'm on postion-3");
		
		// read from list by index lie choose drawer
		System.out.println("--- read from list ---");
		System.out.println("drawer 0 content string -> " + listOfStrings.get(0));
		System.out.println("drawer 1 content string -> " + listOfStrings.get(1));
		System.out.println("drawer 2 content string -> " + listOfStrings.get(2));
		
		System.out.println("--- check is certain item is exist in list ---");
		System.out.println(listOfStrings.contains("I'm on postion-2"));
		System.out.println(listOfStrings.contains("I'm on postion-4"));
		
		System.out.println("--- check in list items are same ---");
				// true - match
		System.out.println(listOfStrings.get(0).equals("I'm on postion-1"));
				// false - no match
		System.out.println(listOfStrings.get(0).equals("I'm on postion-2"));
		
		System.out.println("--- check in list content specified element ---");
		
				// true - content
		System.out.println(listOfStrings.contains("I'm on postion-2"));
				// false - not content
		System.out.println(listOfStrings.contains("I'm on postion-4"));
		
		System.out.println("--- add element on sertain index ---");
		
		System.out.print("Before insert element->");
		
		printList(listOfStrings);
		
		System.out.print("After insert element->");
		listOfStrings.add(1, "I'm insert into position-1");

		printList(listOfStrings);
		
		System.out.println("--- remove element by index---");
		
		listOfStrings.remove(1);
			printList(listOfStrings);
	
			System.out.println("--- remove element by Object---");
			listOfStrings.remove("I'm on postion-1");
			printList(listOfStrings);
			
			System.out.println("--- replace the element on specific position---");
			listOfStrings.set(0, listOfStrings.get(1));
			printList(listOfStrings);
			
			System.out.println("--- clear all list---");
			
			listOfStrings.clear();
			System.out.println("--- check is clear---");
			System.out.println(listOfStrings.isEmpty());
	}
	
	private static void printList(List<String> str) {
		for(int i = 0; i < str.size(); i++) {
			System.out.print(str.get(i) + " | ");
		}
		System.out.println();
		
		
		
	}
}
