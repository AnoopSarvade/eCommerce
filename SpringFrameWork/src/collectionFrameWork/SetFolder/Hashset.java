package collectionFrameWork.SetFolder;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
/**
 * HashSet will not allow duplicates 
 * Hashset not follow order 
 * 
 * @author anupsarvade
 *
 */
public class Hashset {
	
	public static void main(String[] args) {
		
		// create the Hashset to store String 
		HashSet<String> hs = new HashSet<String>();
		
		//Store some string elements 
		hs.add("china");
		hs.add("India");
		hs.add("America");
		hs.add("America");
		hs.add("Canada");
		
		// view the Hashset
		System.out.println("Hashset"+ hs);
		
		// add an iterator to hs
		/*
		 * for(int i=0; i<n; i++)
		 */
		Iterator it = hs.iterator();  
		
		// display element by element by iterator 
		System.out.println("Elements using Iterator");
		
		while (it.hasNext()) {  // why we are not writting the any condition here ???
			String s = (String) it.next(); // type casting
			System.out.println(s);
		}

	}

}
