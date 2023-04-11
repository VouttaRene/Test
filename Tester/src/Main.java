
public class Main {
		private static char[ ] a = {'t','u','v','w','x','y','z','?'};
		public static void main(String[ ] argv) {
		System.out.println(pr(1));
		System.out.println("Boolean Aufgabe:");
		boolean runs = true;
		for(int i = 0; i < 5; i++) {
		while(runs) {
		System.out.println(i);
		if(i > -1) {
		runs = false;
		}
		}
		}

		}
		public static String pr(int i) {
		String s = "";
		if(i >= 0 && i < a.length) {
		s = a[i] + pr(i+2);// + a[i];
		}
		return s;
		}
		
		
		

}
