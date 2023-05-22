import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		ArrayList<Long> longArray = new ArrayList<Long>();
		
		for (int i = 0; i < 10; i++) {
			Long k = (long)(int)(Math.random()*1000000000);
			longArray.add(k);
			System.out.print(k + "\t");
		}
		
		fillArray(longArray);
	}
	
	private static void fillArray(ArrayList<Long> arrayList) {
			
		
		Long i = arrayList.get(0);
		for(int j = 1; j < arrayList.size(); j++){
		if(arrayList.get(j) < i){
		i = arrayList.get(j);
		}
		}
		System.out.println("\n" + i);
	}
	

}
