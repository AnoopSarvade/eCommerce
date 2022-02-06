package collectionFrameWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Group {

	// Main Method 
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// to accept the data from Keyboard 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// create EmployeeClass type array with size 5
		EmployeeClass arr[] = new  EmployeeClass[5];
		
		// to store 5 employee data into the array
		for(int i=0; i<5; i++) {
			System.out.println("Enter id :  ");
			int id = Integer.parseInt(br.readLine());
			
			System.out.println("Enter Name :  ");
			String name = br.readLine();
			
			arr[i] = new EmployeeClass(id, name);
		}
		
		System.out.println("The employee data is:"); 
		
		//display the Employee data from the array 
		for(int i=0; i<arr.length; i++) {
			arr[i].displayData();
		}

	}
}
