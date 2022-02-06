package strings;

public class StringClass {

	public static void main() {

		char S1 = 'R';
		int n = 8;
		String S = "RGRGRGGG";
		String s2 = null;
		int rCount = 0, gCount = 0, resp = 0;
		System.out.println("char  " + "rCount  " + "gCount");
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print(S.charAt(i) + "       ");
			if (S.charAt(i) == 'R') {

				rCount++;
			} else if (S.charAt(i) == 'G') {
				gCount++;
			}
			System.out.println(rCount + "       " + gCount);

		}
		resp = Math.min(rCount, gCount);

		/*
		 * if(rCount < gCount){ resp = rCount; }else { resp = gCount; }
		 */
		System.out.println();
		System.out.println();
		System.out.println("resp  =  " + resp);
	}

	public int countCamelCase(String s) {
		int c = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				c= c+1;
			}
		}
		System.out.println(c);
		return c;
	}

	public static void main(String[] args) {
		StringClass sc = new StringClass();
		StringBuilder sb = new StringBuilder();
		String s = null;
		//s.tr
		//StringClass.main();
		//sc.countCamelCase("qweRTYUI");

	}
	
	
}
