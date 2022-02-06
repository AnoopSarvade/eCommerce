package collectionFrameWork;

import java.io.*; // to store and a group of object in an array 

public class EmployeeClass {
	
	// instance variable 
	int id;
	String name;
	
	// store the data ( its called as Constructor
	EmployeeClass(int i, String n){
		id = i;
		name = n;
	}
	
	// a Method to display data 
	
	void displayData() {
		System.out.println(id +"\t"+ name);
	}

}
