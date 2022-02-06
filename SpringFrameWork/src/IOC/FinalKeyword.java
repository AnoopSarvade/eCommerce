package IOC;

/**
 * 
 * Final method cannot be override 
 * final variable is constant it cannot be change 
 * Final class cannot be inherit 
 * 
 * @author anupsarvade
 *
 */

public class FinalKeyword {
	
	//	String i = "anup";
	
	final int MAX = 5;
	final double DOUBLE = 2.33411222;
	
	public final void Final() {
		//MAX = 10;   final variable is constant it cannot be change 
		System.out.println("hi final !");
	}

}

class checkFinal extends FinalKeyword{
	
	/*public final void Final() {          // Final class cannot be inherit 
		System.out.println("hello ");*/
	}
	




