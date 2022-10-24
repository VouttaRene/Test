package Ben;

import java.util.Scanner;

public class AutomaticTellerMaschine {

	public static void main(String[] args) {

		card(); // Methode für card aufrufen
		geldWert(); // Methode für geldwert aufrufen
	}

	static void card() {

		Scanner scan = new Scanner(System.in);

		boolean valid = true; // Eintritt in die Schleife, prüft ob true oder false

		while (valid) {
			System.out.println("What medium do you want to use to withdraw money: Girocard (1) or credit card (2)?");
			int card = scan.nextInt();

			switch (card) { // gibt die Eingabe aus
			case 1:
				System.out.println("You have selected: Girocard.");
				valid = false; // wenn Eingabe stimmt boolean wird false gesetzt
				break;
			case 2:
				System.out.println("You have selected: credit card.");
				valid = false; // wenn Eingabe stimmt boolean wird false gesetzt
				break;
			default: // wenn Eingabe nicht Übereinstimmt Schleife wird erneut durchlaufen
				System.out.println("Please enter right number");
				break;

			}
		}
	}

	static void geldWert() {

		Scanner scan = new Scanner(System.in);

		int money = 0;
		boolean valid = true; // Eintritt in die Schleife, prü¼ft ob true oder false

		while (valid) { // guckt ob Wert ausgegeben werden kann
			System.out.println("How much do you want to withdraw?");
			money = scan.nextInt();

			if (money > 0 && money % 5 == 0) { // Überprüfung + Einteilung Geldmenge
				valid = false;
			} else {
				System.out.println("Error! Enter a valid value"); // Fehler

			}
		}

		int schein500 = 0; // zeigt Anzahl der Scheine
		int schein200 = 0; // zeigt Anzahl der Scheine
		int schein100 = 0; // zeigt Anzahl der Scheine
		int schein50 = 0; // zeigt Anzahl der Scheine
		int schein20 = 0; // zeigt Anzahl der Scheine
		int schein10 = 0; // zeigt Anzahl der Scheine
		int schein5 = 0; // zeigt Anzahl der Scheine

		while (money >= 500) {
			money = money - 500; // Geldbetrag wird vom Scheinwert abgezogen
			schein500++; // Anzahl der Scheine wird erhöht
		}
		while (money >= 200) {
			money = money - 200; // Geldbetrag wird vom Scheinwert abgezogen
			schein200++; // Anzahl der Scheine wird erhöht
		}
		while (money >= 100) {
			money = money - 100; // Geldbetrag wird vom Scheinwert abgezogen
			schein100++; // Anzahl der Scheine wird erhöht
		}
		while (money >= 50) {
			money = money - 50; // Geldbetrag wird vom Scheinwert abgezogen
			schein50++; // Anzahl der Scheine wird erhöht
		}
		while (money >= 20) {
			money = money - 20; // Geldbetrag wird vom Scheinwert abgezogen
			schein20++; // Anzahl der Scheine wird erhöht
		}
		while (money >= 10) {
			money = money - 10; // Geldbetrag wird vom Scheinwert abgezogen
			schein10++; // Anzahl der Scheine wird erhöht
		}
		while (money >= 5) {
			money = money - 5; // Geldbetrag wird vom Scheinwert abgezogen
			schein5++; // Anzahl der Scheine wird erhöht
		} // Schleife ist zuende

		// Ausgabe der Anzahl der Scheine auf die Konsole
		System.out.println("You get: \n");
		System.out.println(schein500 + " times 500 Euro bills");
		System.out.println(schein200 + " times 200 Euro bills");
		System.out.println(schein100 + " times 100 Euro bills");
		System.out.println(schein50 + " times 50 Euro bills");
		System.out.println(schein20 + " times 20 Euro bills");
		System.out.println(schein10 + " times 10 Euro bills");
		System.out.println(schein5 + " times 5 Euro bills");

	}
}

