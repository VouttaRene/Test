
public class Array {

	final static double pi = Math.PI;
	public static void main(String[] args) {
		int a = 2;
		System.out.println(volumeChristmasBall(a));
	}
	public static double volumeChristmasBall(int radius) {
		System.out.println(Math.pow(radius, 3));
		return ((double)4/3)*(pi*(Math.pow(radius, 3)));
	}
	
	

}
