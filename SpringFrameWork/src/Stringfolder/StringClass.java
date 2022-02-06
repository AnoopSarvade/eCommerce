package Stringfolder;

public class StringClass {
	
	/*
	 * String is immutable class because whenever we refer to String variable 
	 * it will create new memory allocation in string pool and old reference will go to garbage collection
	 * add()//remove()// many methods are there 
	 */

	public static void main(String[] args) {
		String s = new String("AnooP Sarvade");
		String s1 = "Kumar";
		String s2 = "anoop";
		String s3 = "  anoop    sarvade  ";
		String s4 = "anooP";
		String s5 = s2;
		System.out.println(s.length());  // tell the length of the String 
		System.out.println(s.charAt(4)); // tells the element index 
		
		System.out.println(s.substring(7)); // subString starts from that elements 
		System.out.println(s.substring(2,7)); // including 2 index and excluding 7 index
		
		System.out.println(s.concat(s1));  // it will attach another string 
		
		System.out.println(s.indexOf("a")); // every elemnet have index so it will tell the index
		System.out.println(s.indexOf("a",8)); // if same element are there , after which element starts
		
		System.out.println(s.lastIndexOf("a")); // from last index it will start 
		
		System.out.println("anoop".equals("aNoop")); // false // "anoop".equals("anoop") true
		
		System.out.println(s3.trim()); // remove the space from first and last 
		
		System.out.println(s2 == s5); // compare with reference 
		
		System.out.println(s2.equals(s5)); // compare with content 
		
		System.out.println(s2.replace("anoop", "knoop"));
		
		
	}

}
