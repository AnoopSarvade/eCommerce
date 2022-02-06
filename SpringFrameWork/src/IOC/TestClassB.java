package IOC;

public class TestClassB {
	
	long n = 6;
	long A[] = {1, 2, 4, 5, 8, 10};
	long X = 9;
	long Answer = 0;
	
	public long SortElement(){
		for(int i=0; i<n; i++) {
			
			
			if(A[i] < X) {
				System.out.println(A[i]);

				Answer+=1;
				
	}
		}
		return Answer;
		}
	
	
	
	
	public static void main(String[] args) {
		
		TestClassB tb = new TestClassB();
		tb.SortElement();
		System.out.println(tb);
	
	}
	}
			


