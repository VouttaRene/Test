import java.util.Random;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int [] array = new int [100];
//		int result = 0;
//		for(int i = 0; i<array.length; i++) {
//			Random random = new Random();
//			array[i] = random.nextInt(50);
//			System.out.print(array[i] + " ");
//		}
//		System.out.print("\n");
//		//System.out.println(array);
//		for(int j = 0; j<array.length; j++) {
//			result += array[j];
//		}
//		System.out.println(result);
//		System.out.println(result/array.length);
		
		
		
//		String date = "21.11.2022";
//		Scanner scanner = new Scanner(System.in);
//		
//		String birthdate = scanner.next();
//		
//		char[] birthDateCharArr = new char[birthdate.length()];
//		
//        for (int i = 0; i < birthdate.length(); i++) {
//            birthDateCharArr[i] = birthdate.charAt(i);
//        }
//        
        int dayInt = Integer.parseInt(String.valueOf(birthDateCharArr[0]) + String.valueOf(birthDateCharArr[1]));
        int monthInt = Integer.parseInt(String.valueOf(birthDateCharArr[3]) + String.valueOf(birthDateCharArr[4]));
        int yearInt = Integer.parseInt(String.valueOf(birthDateCharArr[6]) + String.valueOf(birthDateCharArr[7]) + String.valueOf(birthDateCharArr[8]) + String.valueOf(birthDateCharArr[9]));
////        for(char dates : birthDateCharArr) {
////        	System.out.print(dates);
////        }
//        System.out.println();
//        
//        System.out.print(dayInt + " ");
//        System.out.print(monthInt + " ");
//        System.out.print(yearInt);
		
		for(int i = 0; i < 10000000; i++) {
			int random = (int)Math.random()*10;
			if(random >= 10) {
				System.out.println("True");
			}
		}
		
		System.out.println("End!");
		
		
		
	}

}
