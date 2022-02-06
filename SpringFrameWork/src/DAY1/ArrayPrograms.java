package DAY1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ArrayPrograms {

	public void sumOfNumber() {

		int size = 4;
		int arr[] = { 1, 2, 3, 4 };
		int sum = 0;

		for (int i = 0; i < size; i++) {
			sum = arr[i] + sum;

		}
		System.out.println(sum);

	}

	/**
	 * find out the all values EXCEPT two greatest values
	 * 
	 */

	public void lowerNumber() {

		int arr[] = { 2, 8, 7, 1, 5 };
		int n = 5;
		int greatestValue = 6;

		for (int i = 0; i < n; i++) {
			if (arr[i] < greatestValue) {

				System.out.println(arr[i]);
			}

		}

	}

	public static int largestNumber() {
		int n = 5;
		int arr[] = { 1, 8, 7, 56, 90 };
		int largeNumber = -1;

		for (int i = 0; i < n; i++) {
			if (arr[i] > largeNumber) {
				largeNumber = arr[i];

			}
		}
		System.out.println(largeNumber);
		return largeNumber;
	}

	public void rev() {

		Integer qrr[] = { 4, 3, 1, 10, 2, 6 };

		int n = qrr.length;
		Integer temp;

		for (int i = 0; i < n / 2; i++) {
			temp = qrr[i]; // t = a
			qrr[i] = qrr[n - 1 - i]; // a = b
			qrr[n - 1 - i] = temp; // b = t

			System.out.print(qrr[i] + " ");

		}
		for (int j = 0; j < n; j++) {
			System.out.print(qrr[j] + " ");
		}

	}

	public void thirdLargest() {

		int arr[] = { 100, 30, 80, 45, 32, 67, 88, 93, 23, 54};  
		int sum = 0;
		int n = arr.length;
		int k = 8;  // if 100 value are then how to find smallest value 
		
		

		if (n > 1) {
			System.out.println(n-1);
		}

		Arrays.sort(arr);
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");	
		}
		
		System.out.println(arr[1]);

	}

	public void missingNumber() {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int N = arr.length;
		int n = 8;

		int sum_of_miss_num = (n * (n + 1) / 2);
		int s = 0;
		for (int i = 0; i < N; i++) {
			// System.out.print(" "+i+" "+" IIIIIII");
			// System.out.print(s+" SSSSSSS");
			// System.out.println(" ");
			s = s + arr[i];
		}
		System.out.println(sum_of_miss_num - s);

	}

	/**
	 * check wheather its a palindrome or not if YES print palindrome if NO print it
	 * not palindrome
	 * 
	 * @param n
	 */

	public static int checkPalindrome(int num) {

		String str = Integer.toString(num);

		// System.out.println(str.length());
		// int str_n = str.length();

		StringBuilder sb = new StringBuilder(str);

		sb.reverse();
		String str_rev = sb.toString();

		if (str.equals(str_rev)) { // false
			return 1;
		} else { // why its going to else , when condition satisfied
			return 0;
		}

	}

	public void arrayPalindrome() {
		int n = 3;
		int arr[] = { 121, 111, 121 };
		int answer = 1;
		int flag = 0;

		for (int i = 0; i < n; i++) {

			flag = ArrayPrograms.checkPalindrome(arr[i]);
			if(flag == 0) {
				answer =0;
				break;
			}
		}
		if (answer == 0) {
			System.out.println("its not a palindrome");
			;
		} else {

			System.out.println("palindrome");

		}
	}

	public static void duplicateElements() {

		int arr[] = { 1, 1, 1, 5, 7, 10, 20, 30 };
		int n = 8;
		int firstNum = 0;
		int nextNum = 1;
		SortedSet<Integer> set = new TreeSet<Integer>();
		
		/*for (int i = 0; i < n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[i]+"     "+arr[j]+"      i"+i+"        j"+j);
				}
			}
		}*/
		
		for(int i = 0; i<n; i++) {
			set.add(arr[i]);
		}
		System.out.println(set);
		
	}
	
	public static void nestedLooops() {
		
		int n = 5;
		
		
		for(int i = 1; i<=n; i++) {
			System.out.println("*"+" ");
			for(int j =1; j<=i; j++) {
				System.out.print("*"+" ");
			}
		}
		for(int i = n-1; i>=-1; i--) {
			System.out.println("*"+" ");
			for(int j =1; j<=i; j++) {
				System.out.print("*"+" ");
			}
		}
		
//		String s = "Anup";
//		String s1 = "Sarvade";
//		String s3 = s.concat(s1);
//		
//		
//		StringBuilder sb = new StringBuilder(s3);
//		//sb.reverse();
//		System.out.println(sb);
//		sb.delete(3, 6);
//		String str_rev = sb.toString(); 
//		System.out.println(str_rev);
//	}
//		 static void delAlternate() {
//		       String s = "";
//		     String S= "Hello world";
//		           for(int index =0; index<S.length(); index++){
//		           if(index % 2 == 0 ){
//		              Character c =  S.charAt(index);
//		               s = s+Character.toString(c);
//		           }
//		       }
//		           System.out.println(s);
//		   }
	}
		 
	public void secLargest() {
		int arr[] = { 12, 35, 35, 1, 10, 34, 1 };
		int n = arr.length;
		List<Integer> list = new ArrayList<>();

		for( int i=0; i<n; i++ ){
		    list.add(arr[i]);
		    
		}
		System.out.println(list);
		
		SortedSet<Integer> set = new TreeSet<Integer>().descendingSet();
		set.addAll(list);
		System.out.println(set);
		
		Iterator value = set.iterator();
		
		int p = 1;

		while (value.hasNext()) {
		    if( p == 2 ){
		        System.out.println(value.next());
		        break;
		    }
		    else{
		        value.next();
		    }
		    p++;
		}

	}
	/*
	 * always check half of the array to compare with remaining half 
	 */
	
	public static boolean isPerfect(int a[], int n) {
		boolean answer = true;
		for (int i = 0; i < n / 2; i++) {
			if (a[i] != a[n - i - 1]) {
				answer = false;
				System.out.println("NOT PERFECT");
				break;
			} 
		}
		System.out.println("PERFECT");
		return answer;
	}
	
	public static int[] findIndex() {
		int arr[]= {1, 2, 3, 4, 5, 5,};
		int n = 6;
		int key = 5; 
		int first = 0, last =0, flag =0 ;
		int answer[]= new int[2]; // array declaration 
		
		for(int i=0; i<n; i++) {
			if(arr[i] == key ) {
				if(flag == 0) {
				first = i;
				}
				last = i;
				flag = 1;
			}
		}
		answer[0] = first;
		answer[1] = last;
			return answer;
	}
	
	public long seriesSum(int n, int a[]) {
		int answer =0;
		
		for(int i =0; i<n; i++) {
			answer = a[i]+answer;
			
		}
		System.out.print(answer+" ");
		
		return answer;
	}
		
	
	public void loops() {
		
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
	}
	
	public static void main(String args[]) {
		ArrayPrograms ap = new ArrayPrograms();
		
		for(int i=10; i>=1; i--) {
			if(i>5) {
				continue;
			}
			System.out.print(i+"  ");
		}
		
		int a[]= {1,2,3,4,5};
		int n = a.length;
		
		// ap.sumOfNumber();
		 //ap.lowerNumber();
		// ap.largestNumber();
		// ArrayPrograms.largestNumber();
		// ap.rev();
		// ap.thirdLargest();
		// ap.missingNumber();
		// ArrayPrograms.checkPalindrome(3);
		 //ap.arrayPalindrome();
		//ArrayPrograms.duplicateElements();
		//ArrayPrograms.nestedLooops();
		//ArrayPrograms.delAlternate();
		 //ap.secLargest();
		//ArrayPrograms.isPerfect(a, n);
		//ArrayPrograms.findIndex();
		//ap.seriesSum(n, a);
	}

}
