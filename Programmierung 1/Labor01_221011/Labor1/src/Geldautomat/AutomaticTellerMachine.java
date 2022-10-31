/**
 * @author RenéVoutta
 * @version 1.0
 * @email u38509@hs-harz.de
 */

/*
 * 		Programmierung 1 
 * 		1. Labor
 * 
 * Ziele:
 * Sie entwickeln das Programm eines virtuellen Geldautomaten, das in der Lage ist, 
 * auf Nutzereingaben zu reagieren und die kleinstmögliche Menge an Geldscheinen auszugeben. 
 * Inhaltliche Schwerpunkte sind insbesondere die Verwendung von Variablen, 
 * Konsolenein- und ausgaben, Bedingungen und Schleifen.
 * 
 * Durchführung:
 * Sie bearbeiten in Einzelarbeit die Aufgabe des ersten Labors in einer 
 * Entwicklungsumgebung Ihrer Wahl. Sie lösen die Aufgabenstellung und erläutern Ihren 
 * Quellcode beim Tutor, um das Testat zu erhalten. Anschließend laden Sie die Lösung in 
 * Form Ihres Projektverzeichnisses als Zip-Archiv in den dafür vorgesehenen Ordner in 
 * StudIP. Sollten Sie das Testat zum Abgabetermin nicht fertigstellen oder bestehen 
 * können, so besteht in der darauffolgenden Woche die Möglichkeit eines 
 * Wiederholungstermins.
 * 
 * Aufgabe:
 * Implementieren Sie die Klasse AutomaticTellerMachine, die einen (virtuellen) 
 * Geldautomaten grundlegend simulieren soll. Die Klasse soll Methoden mit folgenden 
 * Funktionen enthalten:
 * • Eine Methode, die prüft mit welchem Medium (Girocard oder Kreditkarte) Geld abgehoben
 * werden soll. Implementieren Sie die Überprüfung mit einer switch-Anweisung.
 * Die Eingabe und somit Auswahl des Mediums soll mit Hilfe einer Konsoleneingabe 
 * erfolgen. Alle Ausgaben sollen auch über die Konsole realisiert werden.
 * • Eine Methode, die anschließend anhand einer weiteren Konsoleneingabe eines Geldwertes
 * (ganze Zahl) die kleinstmögliche Anzahl an verschiedenen Geldscheinen durch
 * Bedingungen sowie Schleifen berechnet und ausgibt (Konsolenausgabe).
 * Hinweise: Beachten Sie, dass der Geldautomat ausschließlich Geldscheine und keine
 * Geldstücke ausgeben kann (z.B. Geldautomat kann nicht 563 Euro ausgeben; diese Eingabe
 * muss abgewiesen werden!). Weiterhin wird angenommen, dass der Geldautomat unendlich 
 * viel Geld ausgeben kann. Um die Verständlichkeit Ihres Java-Codes zu erhöhen, schreiben 
 * Sie zu jeder Methode aussagekräftige Kommentare!
 * 
 * 
 * 		2. Labor
 * 
 * Ziele:
 * Sie entwickeln das Programm des virtuellen Geldautomaten weiter, sodass dieser in der Lage ist, 
 * abgehobene Geldbeträge abzuspeichern und im Rahmen einer kleinen Statistik den kleinsten sowie 
 * den zweitgrößten Betrag auszugeben und den Mittelwert aller abgehobenen Werte zu bestimmen. 
 * Inhaltliche Schwerpunkte sind vor allem Schleifen, Bedingungen und Arrays.
 * 
 * Durchführung:
 * Sie bearbeiten in Einzelarbeit die Aufgabe des zweiten Labors in einer Entwicklungsumgebung 
 * Ihrer Wahl. Sie lösen die Aufgabenstellung und erläutern Ihren Quellcode beim Tutor, um das 
 * Testat zu erhalten. Anschließend laden Sie die Lösung in Form Ihres Projektverzeichnisses als 
 * Zip-Archiv in den dafür vorgesehenen Ordner in StudIP. Sollten Sie das Testat zum Abgabetermin 
 * nicht fertigstellen oder bestehen können, so besteht in der darauffolgenden Woche die Möglichkeit 
 * eines Wiederholungstermins.
 * 
 * Aufgabe:
 * Basierend auf Ihrer Klasse AutomaticTellerMachine aus Labor 1, nehmen Sie folgende Veränderungen 
 * vor bzw. implementieren Sie zusätzliche Methoden mit folgenden Funktionen:
 * • Ergänzen Sie die Methode zur Berechnung der kleinstmöglichen Anzahl an Geldscheinen so, dass 
 * durch das fünfmalige Erfragen des Geldbetrages ein Array mit fünf ver-schiedenen Werten gefüllt wird. 
 * Lesen Sie anschließend die Anzahl der abgehobenen Geldbeträge (d.h. Größe des Arrays) aus und geben 
 * Sie diese in der Konsole aus. Beachten Sie beim Implementieren, dass der Geldautomat nach wie vor 
 * ausschließlich Geldscheine und keine Geldstücke ausgeben kann.
 * • Implementieren Sie eine Methode, die den kleinsten Wert aus den fünf Geldbeträgen des Arrays sucht. 
 * Verwenden Sie dafür keinen bestehenden Sortieralgorithmus aus einer Java-Bibliothek o.ä., sondern 
 * implementieren Sie dies selbst mit Hilfe von Schlei-fen und Bedingungen.
 * • Implementieren Sie eine Methode, die den zweitgrößten Wert aus den fünf Geldbeträgen des Arrays sucht. 
 * Verwenden Sie auch hier keinen bestehenden Sortieralgorithmus aus einer Java-Bibliothek o.ä., 
 * sondern implementieren Sie dies selbst mit Hilfe Schleifen und Bedingungen.
 * • Implementieren Sie eine Methode, die den Mittelwert aus den fünf Geldbeträgen des Arrays bestimmt.
 * 
 */
package Geldautomat;
//Importing java.util.Scanner to get import using the console
import java.util.Scanner;

/*This class simulates a virtual ATM. We only have 500, 200 , 100, 50, 20, 10 and 5 Euro 
*bills. A withdrawal request that does not fit this criteria should be denied.
*For simplicity we assume that the ATM has an unlimited number of bills available.
*/
public class AutomaticTellerMachine {
	
	//Declaring and initializing a scanner to be able to input arguments through our console.
	static Scanner scanner = new Scanner(System.in);
	
	public static void main (String[] args) {

		//Initialize an array to store withdrawal amounts.
		long[] withdrawals = new long[5];	 
		
		//Call Method to ask For Card
		AskForCard();
		
		//Ask for a withdrawal 5 times and store the amounts in an array
		for(int i = 0; i < withdrawals.length; i++) {
			withdrawals[i] = WithdrawCalc();
		}
		
		//Print out all withdrawals
		System.out.println("------------\nThe following amounts were withdrawn:");
		for (int j = 0; j < withdrawals.length; j++) {
			System.out.println(withdrawals[j] + " Euro");
		}
		System.out.println("You withdrew " + withdrawals.length + " amounts.\n------------");
		

		//Call Search methods
		System.out.println("The lowest amount is: " + SearchForSmallest(withdrawals));		//Print out smallest Value of withdrawal amounts
		System.out.println("The second highest amount is: " + SearchForSecondHighest(withdrawals));		//Print out second highest withdrawal amount
		System.out.println("The average of all amounts is: " + CalcAverage(withdrawals));		//Print out the average of the array
		System.out.println("\nThanks for using our ATM");
		
		scanner.close();		//Scanner is closed so that no further input is doable
	}
	
	//This method asks the user for the card type. Either Girocard or credit card are accepted.
	private static void AskForCard() {
		System.out.println("What medium do you want to use to withdraw money: Girocard (1) or credit card (2) ?");
		
		boolean validCardType = false;		//Flag for accepted/valid card.
		String card = "none";
		
		while(!validCardType) {
			try {
				int cardType = scanner.nextInt();
				switch(cardType) {
				case 1:			//Valid Input: Case Girocard
					card = "Girocard";
					validCardType = true;
					break;
				case 2:			//Valid Input: Case Credit Card
					card = "credit card";
					validCardType = true;
					break;
				default:		//Invalid Input! Try again
					System.out.println("Incorrect Card type! Try again!");
					break;
				}
				
			}catch(Exception e) {
				System.out.println("Error 1!\nTry again! Please input \"1\" or \"2\"!");
				scanner.next();
				continue;
			}
		}
		System.out.println("You have selected: " + card + ".");
	}
	
	//This method asks for the withdrawal amount and checks if the amount is acceptable 
	private static long WithdrawCalc() {		
		System.out.println("How much do you want to withdraw?");
		long withdraw = 0L;
		
		while(withdraw == 0 || withdraw % 5 != 0) {
			try {
				withdraw = scanner.nextLong();
				if (withdraw % 5 == 0 && withdraw > 0) {
					Berechnung(withdraw);	//Amount is acceptable and the bills will be calculated.
				}else {
					System.out.println("Your request was denied! Invalid withdrawal!");
					//Withdrawal was denied. It will ask for a new withdrawal amount until a correct amount was put in.
				}
			}
			catch(Exception e) {
				System.out.println("Error 2!\nTry again! Please input a valid withdrawal amount!");
				scanner.next();
				continue;
			}
		}
		return withdraw;	
	}

	//This method does the calculation of the amount of bills.
	//At last it will print out the amount of bills.
	private static void Berechnung(long withdrawal) {
		long fiveHundred = 0;
		long twoHundred = 0;
		long oneHundred = 0;
		long fifty = 0;
		long twenty = 0;
		long ten = 0;
		long five = 0;
		
		if(withdrawal >= 500) {
			fiveHundred = withdrawal / 500;						//By doing a division with integer we get the amount of bills that we can deal out 
			withdrawal = withdrawal - (fiveHundred * 500);		//We deduct the amount of bills from the withdrawal and continue with the next smaller bill with the updated withdrawal.
		}
		if(withdrawal >= 200) {
			twoHundred = withdrawal / 200;
			withdrawal = withdrawal - (twoHundred * 200);
		}
		if(withdrawal >= 100) {
			oneHundred = withdrawal / 100;
			withdrawal = withdrawal - (oneHundred * 100);
		}
		if(withdrawal >= 50) {
			fifty = withdrawal / 50;
			withdrawal = withdrawal - (fifty * 50);
		}
		if(withdrawal >= 20) {
			twenty = withdrawal / 20;
			withdrawal = withdrawal - (twenty * 20);
		}
		if(withdrawal >= 10) {
			ten = withdrawal / 10;
			withdrawal = withdrawal - (ten * 10);
		}
		if(withdrawal >= 5) {
			five = withdrawal / 5;
			withdrawal = withdrawal - (five * 5);
		}
		
		//Printing out the amount of bills we need to deal out the right amount 
		System.out.println(fiveHundred + " times 500 Euro bills");
		System.out.println(twoHundred + " times 200 Euro bills");
		System.out.println(oneHundred + " times 100 Euro bills");
		System.out.println(fifty + " times 50 Euro bills");
		System.out.println(twenty + " times 20 Euro bills");
		System.out.println(ten + " times 10 Euro bills");
		System.out.println(five + " times 5 Euro bills\n------------");
	}
	
	//The following methods are sorting the withdrawal array and return different value depending on what's ask for.
	//First Method: Return smallest value in array
	private static long SearchForSmallest(long[] withdrawals) {
		long smallestValue = -1;		//Declare Variable to store smallest value which will be returned later. Initialize it with -1 to be sure it can be returned and a mistake will be easily seen.
		long temp; 		//temporary Variable to help change value inside the array.
		
		//Sort the array in ascending order
		for(int i = withdrawals.length - 1; i > 0; i++) {		//defines for how long the array will be checked
			for(int j = 0; j < withdrawals.length - 1; j++) {		//Inside this for loop we will look in ascending order if neighboring values are in the right order
				//Check if two neighboring values are in the right order
				if(withdrawals[j] > withdrawals[j+1]) {
					temp = withdrawals[j];	//Store the bigger value inside the temp variable
					withdrawals[j] = withdrawals[j+1];	//Store smaller value in the former bigger array element 
					withdrawals[j+1] = temp;	//Store temp Variable, the bigger value, inside the higher array element
				}
			}
		}
		smallestValue = withdrawals[0];	//Smallest value is stored inside the first element
		
		//return smallest value
		return smallestValue;
	}
	
	//Second Method: Return second highest value in array
	private static long SearchForSecondHighest(long[] withdrawals) {
		long secondHighestValue = -1;		//Declare Variable to store smallest value which will be returned later. Initialize it with -1 to be sure it can be returned and a mistake will be easily seen.
		long temp; 		//temporary Variable to help change value inside the array.
		
		//Sort the array in ascending order
		for(int i = withdrawals.length - 1; i > 0; i++) {		//defines for how long the array will be checked
			for(int j = 0; j < withdrawals.length - 1; j++) {		//Inside this for loop we will look in ascending order if neighboring values are in the right order
				//Check if two neighboring values are in the right order
				if(withdrawals[j] < withdrawals[j+1]) {
					temp = withdrawals[j+1];	//Store the bigger value inside the temp variable
					withdrawals[j+1] = withdrawals[j];	//Store smaller value in the former bigger array element 
					withdrawals[j] = temp;	//Store temp Variable, the bigger value, inside the higher array element
				}
			}
		}
		secondHighestValue = withdrawals[withdrawals.length-2];	//Second Highest value is stored inside the second element
		
		//return smallest value
		return secondHighestValue;
	}
	
	//Third Method: Return the Average of an array
	private static long CalcAverage(long[] withdrawals) {
		long average = -1;
		long sumOfArray = 0;
		
		//Calculate the sum of the array
		for(int i = 0; i < withdrawals.length; i++) {
			sumOfArray += withdrawals[i];
		}
		//Calculate the average of the array
		average = sumOfArray/withdrawals.length;
		
		return average;
	}
}
