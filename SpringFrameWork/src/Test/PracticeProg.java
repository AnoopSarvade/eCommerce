package Test;

import java.util.ArrayList;

public class PracticeProg {
	
	
	public static void main(String[] args) {
		
		int a[][] = {{1,2,3}, {4,5,6}, {7, 8,9}}; // 2d array
		int b[] = {3, 6, 9,4}; 
		int n = a.length;  // 3
		int n1 =b.length;
        int sum = 0;
        
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        
        for(int i =0; i <n; i++){
            for(int j =0; j<n; j++){
            	if(i==j) {
            		sum = sum + a[i][j];
            	}
            }
        }
        arrayList.add(sum);
        System.out.println(arrayList);
        System.out.println();
        int max = 0;
        for(int i =0; i<n1; i++) {
        	if(b[i] > max) {
        		max = b[i];
        	}
        		
        }
        System.out.println(max);
        arrayList.add(max);
        
       System.out.println(arrayList);  
    
      // return arrayList;
    }
	
	

}
