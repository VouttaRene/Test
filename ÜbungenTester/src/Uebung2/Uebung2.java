package Uebung2;

public class Uebung2 {
	
	public static void main(String[] args) {
	
		//Aufgabe 7 aufrufe
		int a = 3;
		System.out.println(calc1(a));
		System.out.println(fak(a));
		
		//Aufgabe 8 aufrufe
		int b = 3;
		System.out.println(calc2(a, b));
		
	}
	
	//Aufgabe 7: iterativ vorgegeben
	private static int calc1(int n) {
		 int i = 1;
		 int result = 1;
		 while(i < n) {
		 result *= (++i);
		 }
		 return result;
		}
	//Aufgabe 7: rekursiv gewandelt
	private static int fak(int n) {
		int i = 1;
		int result = 1;
		if( i < n) {
			return n * fak(n-1);
		}else {
			return 1;
		}
	}
	
	//Aufgabe 8: rekursiv vorgegeben
	public static int calc2(int a, int b) {
		 int r = a % b;
		 if (r == 0) {
		return b;
		 }
		 return calc2(b, r);
		}
	
	//Aufgabe 8: iterativ gewandelt
	

}
