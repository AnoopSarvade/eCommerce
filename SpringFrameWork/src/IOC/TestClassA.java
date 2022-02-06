package IOC;

import java.util.Arrays;
import java.util.Scanner;

public class TestClassA {

	public static void main(String args[]) {
		int n, sum = 0, max, min;
		double average = 0;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter elements you want to input in array: ");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the elements:");
		for(int j=0; j<n; j++) {
			a[j] = s.nextInt();
		}
		max = a[0];
		min = a[0];
		//min = Arrays.stream(a).min().getAsInt();
		;
		
		// Arrays.sort(a);
		for (int i = 0; i < n; i++) {
			
			sum += a[i];
			average = (double) sum / a.length;
			if (a[i] >= max) {
				max = a[i];
			}
			
			 if (a[i] <= min) {
			  min = a[i];
			 
		}
		/*min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}*/
		}
		System.out.println("Sum is: " + sum);
		System.out.println("Average is: " + average);
		System.out.println("Max is: " + max);
		System.out.println("Min is: " + min);
	}
}
