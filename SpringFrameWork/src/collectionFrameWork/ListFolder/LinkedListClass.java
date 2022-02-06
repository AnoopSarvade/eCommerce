package collectionFrameWork.ListFolder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * POINTs to Remember 
 * 		- group of elements in the form of nodes 
 * 		- inserting and removing the element from linkedlist is done quickly 
 * 		- it will allow duplicates 
 */
public class LinkedListClass {
	
	public static void main(String[] args) throws IOException {
		
		//create an empty linked list to store strings 
		LinkedList<String> ll = new LinkedList<String>();
		
		//add some names to linked list 
		ll.add("china");
		ll.add("India");
		ll.add("America");
		ll.add("America");
		ll.add("Canada");
		
		// display the elements in the linked list
		System.out.println(ll);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String element;
		int position, choice =0;
		
		//menu
		
		while(choice <4) {
			
			System.out.println("\nLINKEDLIST OPERATIONS");
			System.out.println("1 Add an elements");
			System.out.println("2 Remove an element");
			System.out.println("3 change an element");
			System.out.println("4 Exit");
			
			System.out.print("your choice");
			choice = Integer.parseInt(br.readLine());
			
			//perform a task depending on user choice
			switch(choice) {
			
			case 1:	System.out.println("Enter the element:  ");
					element = br.readLine();
					System.out.println("At what position?  ");
					position = Integer.parseInt(br.readLine());
					ll.add(position -1, element);
					break;
					
			case 2: System.out.println("At what position?  ");
					position = Integer.parseInt(br.readLine());
					ll.remove(position -1);
					break;
					
			case 3:	System.out.println("Enter the position:  ");
					position = Integer.parseInt(br.readLine());
					System.out.println("Enter the element:  ");
					element = br.readLine();
					//System.out.println("At what position?  ");
					ll.set(position -1, element);
					break;
					
					default: return;
			}
				// use Iterator to retrieve the elements
				System.out.println("List= ");
				Iterator it = ll.iterator();
				while(it.hasNext()) {
					System.out.print(it.next()+" ");
				}
		}
		
	}
	

}
