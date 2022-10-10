package Geldautomat;

import java.util.Scanner;

public class AutomaticTellerMachine {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		AskForCard();
		WithdrawCalc();
	}
	
	public static void AskForCard() {
		System.out.println("What medium do you want to use to withdraw money: Girocard (1) or credit card (2) ?");
		
		
		boolean validCardType = false;
		String card;
		
		while(!validCardType) {
			int cardType = scanner.nextInt();
			switch(cardType) {
			case 1:
				card = "Girocard";
				validCardType = true;
				break;
			case 2:
				card = "credit card";
				validCardType = true;
				break;
			default:
				System.out.println("Incorrect Card type! Try again!");
				break;
			}
		}
		
	}
	
	public static void WithdrawCalc() {		
		System.out.println("How much do you want to withdraw?");
		int withdraw = 0;
		
		while(withdraw == 0 || withdraw % 5 != 0) {
			withdraw = scanner.nextInt();
			if (withdraw % 5 == 0 && withdraw > 0) {
				Berechnung(withdraw);
			}else {
				System.out.println("Your request was denied! Invalid withdrawal!");
			}
		}
		
	}

	private static void Berechnung(int withdraw) {
		int fiveHundred = 0;
		int twoHundred = 0;
		int oneHundred = 0;
		int fifty = 0;
		int twenty = 0;
		int ten = 0;
		int five = 0;
		
		while(withdraw >= 500) {
			fiveHundred = withdraw / 500;
			withdraw = withdraw - (fiveHundred * 500);
		}
		while(withdraw >= 200) {
			twoHundred = withdraw / 200;
			withdraw = withdraw - (twoHundred * 200);
		}
		while(withdraw >= 100) {
			oneHundred = withdraw / 100;
			withdraw = withdraw - (oneHundred * 100);
		}
		while(withdraw >= 50) {
			fifty = withdraw / 50;
			withdraw = withdraw - (fifty * 50);
		}
		while(withdraw >= 20) {
			twenty = withdraw / 20;
			withdraw = withdraw - (twenty * 20);
		}
		while(withdraw >= 10) {
			ten = withdraw / 10;
			withdraw = withdraw - (ten * 10);
		}
		while(withdraw >= 5) {
			five = withdraw / 5;
			withdraw = withdraw - (five * 5);
		}
		
		System.out.println(fiveHundred + " times 500 Euro bills");
		System.out.println(twoHundred + " times 200 Euro bills");
		System.out.println(oneHundred + " times 100 Euro bills");
		System.out.println(fifty + " times 50 Euro bills");
		System.out.println(twenty + " times 20 Euro bills");
		System.out.println(ten + " times 10 Euro bills");
		System.out.println(five + " times 5 Euro bills");
		
	}

}
