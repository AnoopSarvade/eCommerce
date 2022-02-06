package Book;

import java.util.Scanner;

public class LeapYear {

	
		
		public static void leapYear() {
		
		System.out.println("Enter a year");
		Scanner sc = new Scanner(System.in);
		
		int year = Integer.parseInt(sc.nextLine());
		
		if(year % 100 ==0 && year % 400==0) {
			System.out.println("its a leap");
		}else if(year % 100 !=0 && year % 4==0) {
			System.out.println("its a leap");
		}else {
			System.out.println("its NOT a leap");
		}
		

	}
	/*
	 * fibonacci means adding previous two number 
	 * 0  1  1  2  3  5  8	
	 */
		public static void fibonacci() {
			
			
			int f1 = 0, f2 =1, f3 =0, count =3;
			System.out.println("Enter the N value   :");
			
			Scanner sc = new Scanner(System.in);
			 int n = sc.nextInt();
			 
			 f3 = f1+f2;
			 System.out.print(f1+" "+f2+" "+f3);
			
			while(count < n) {
				f1 = f2;
				f2 = f3;
				f3 = f1 +f2;
				System.out.print(" "+f3);
				count++;
			}
			
			
			
		}
		
		public static void main(String[] args) {
			fibonacci();
}
}
