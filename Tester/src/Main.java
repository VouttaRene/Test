import java.util.Iterator;

public class Main {
	
	public static void main (String[] args) {
		System.out.print(round(1.46d,0));
		
	}
	
	private static double round(double value, int decimalPoints) {
	      double d = Math.pow(10, decimalPoints);
	      return Math.round(value * d) / d;
	   }

}
