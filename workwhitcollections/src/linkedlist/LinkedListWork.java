package linkedlist;

import java.util.LinkedList;

/* LinkedList - is keep collection of items which can duplicate.
 * 				LinkedList keep item in Nodes which content value and reference to another node.(value keep data type(item))
 * 
 * 		When use list when need:
 * 					-  add duplicate items- can add whith index and whitout
 * 					-  remove whit index and without
 * 					- can replace items -method -> set(index, item)
 * 
 *  !!! GENERAl - we use linked list when we need keep order and often has to add and remove from beginning(more faster than list) and 
 *  			  use when we don't know size of items
 *   
 */

public class LinkedListWork {

	public static void main(String[] args) {

		// initialization
		LinkedList<Integer> linkList = new LinkedList<>();
		// add items without index

		linkList.add(1);
		linkList.add(2);
		linkList.add(3);
		// read items
		System.out.println("--- receive data ---");
		System.out.println(linkList.get(0));
		System.out.println(linkList.get(1));
		System.out.println(linkList.get(2));

		System.out.println("--- add data without index---");
		printLinkedList(linkList);

		System.out.println("--- add data whit index---");
		// linkList.add(index,item);
		linkList.add(3, 4);
		linkList.add(4, 5);
		printLinkedList(linkList);
		
		System.out.println("--- replace--");
		// replace
		System.out.print("Before replace:");
		printLinkedList(linkList);
		linkList.set(2, linkList.get(0));
		System.out.print("After replace:");
		printLinkedList(linkList);
		System.out.println("--- remove--");
		// remove
		System.out.print("Before remove:");
		printLinkedList(linkList);
		linkList.remove(1);
		System.out.print("After remove:");
		printLinkedList(linkList);
		System.out.println("--- remove by object --");
		linkList.remove(1);
		printLinkedList(linkList);
		

	}

	private static void printLinkedList(LinkedList<Integer> linkList) {

		System.out.print("[HEAD-");
		for (int i = 0; i < linkList.size(); i++) {
			if (i == 0) {
				System.out.print("[" + linkList.get(i) + "]]->");
			} else if (i == linkList.size() - 1) {
				System.out.println("[TAIL-[[" + linkList.get(i) + "]]");
			} else {
				System.out.print("[NODE-[[" + linkList.get(i) + "]]->");
			}
		}
	}

}
