import java.util.Random;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = new int [100];
		int result = 0;
		for(int i = 0; i<array.length; i++) {
			Random random = new Random();
			array[i] = random.nextInt(50);
			System.out.print(array[i] + " ");
		}
		System.out.print("\n");
		//System.out.println(array);
		for(int j = 0; j<array.length; j++) {
			result += array[j];
		}
		System.out.println(result);
		System.out.println(result/array.length);
	}

}
