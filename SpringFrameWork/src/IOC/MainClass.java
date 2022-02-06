package IOC;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		int[] a = null;
		Arrays.sort(a);
		
		Connection conn = Connection.createObject();
		Connection connobj = Connection.createObject();
		Connection conn2 = Connection.createObject();
		
		
		System.out.println(conn.hashCode());
		System.out.println(connobj.hashCode());
		System.out.println(conn2.hashCode());
		
		if(conn== connobj&& connobj==conn2) {
			System.out.println("three objects point to same memory ");
		}
		else {
			System.out.println("three objects NOT point to same memory ");
		}
				
	}

}
