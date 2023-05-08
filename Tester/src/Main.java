import java.util.Iterator;
import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			int number = scanner.nextInt();
		
			System.out.println("Nummer: " + number);
		}
		
		
		
	}
	
//	private static double round(double value, int decimalPoints) {
//	      double d = Math.pow(10, decimalPoints);
//	      return Math.round(value * d) / d;
//	   }

}
