import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int a = 25;
		int b = 1;
		int c = 1993;
		
		int d = 24;
		int e = 12;
		int f = 1992;
		
		String birthday = "25.01.1993";
		System.out.println(birthday.length());
		System.out.println(calculateAge(a,b,c,d,e,f));
		String date = LocalDate.now().toString();
		System.out.println(date);
	}
	public static int calculateAge(int birthDay, int birthMonth, int birthYear, int todayDay, int todayMonth, int todayYear) {		
	        int age = -1;
			if(birthYear < todayYear) {
	        	age = todayYear-birthYear;
	        	if(birthMonth>todayMonth) {
	        		age--;
	        	}else if(birthMonth == todayMonth && birthDay > todayDay) {
	        		age--;
	        	}
	        }
			
			return age;
		}
	
	

}
