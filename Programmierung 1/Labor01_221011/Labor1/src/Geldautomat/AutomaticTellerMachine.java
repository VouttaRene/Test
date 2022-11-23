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
 * 		3. Labor
 * 
 * Ziele: 
 * Sie entwickeln das Programm des virtuellen Geldautomaten weiter, sodass dieser Kundendaten aufnehmen 
 * und verarbeiten kann, u.a. das Alter eines Kunden bestimmen oder Pincodes generieren kann. Inhaltliche 
 * Schwerpunkte sind objektorientierte Programmierung, insbesondere Klassen, Konstruktoren, Objekte sowie 
 * Information Hiding.
 * 
 * Durchführung: 
 * Sie bearbeiten in Einzelarbeit die Aufgabe des dritten Labors in einer Entwicklungsumgebung
 * Ihrer Wahl. Sie lösen die Aufgabenstellung und erläutern Ihren Quellcode beim Tutor, um das Testat zu erhalten. 
 * Anschließend laden Sie die Lösung in Form Ihres Projektverzeichnisses als Zip-Archiv in den dafür vorgesehenen 
 * Ordner in StudIP. Sollten Sie das Testat zum Abgabetermin nicht fertigstellen oder bestehen können, so besteht 
 * in der darauffolgenden Woche die Möglichkeit eines Wiederholungstermins.
 * 
 * Aufgabe:
 * • Implementieren Sie eine neue Klasse für Kunden des Geldautomaten mit dem Namen Customer. 
 * Erstellen Sie dafür eine neue Java-Datei. Mit Hilfe dieser Klasse sollen später Objekte in der Klasse 
 * AutomaticTellerMachine erzeugt werden können. Ein Customer soll über folgende Eigenschaften verfügen, die nur 
 * für Objekte der eigenen Klasse zugreifbar sein dürfen: Name, Adresse, Mailadresse, Alter, Pincode der Girocard 
 * und Pincode der Kreditkarte. Denken Sie bei der Implementierung der Klasse an das Information Hiding Prinzip. 
 * Die Klasse Customer soll außerdem über eine Methode zur Berechnung des Alters aus dem Geburtsdatum eines Kunden
 * verfügen.
 * • Ergänzen Sie die Klasse AutomaticTellerMachine durch eine Methode, in der über die Konsoleneingabe Name, 
 * Adresse, Mailadresse und das Geburtsdatum erfragt werden. Implementieren Sie außerdem eine Methode, die zufällige, 
 * vierstellige Pincodes (ganzzahlig, z.B. 1234) erzeugt. Weisen Sie anschließend Name, Adresse, Mailadresse, 
 * Alter (berechnet in der Customer Klasse) und die Pincodes für Girocard und Kreditkarte einem Customer Objekt zu und 
 * geben Sie alles mit Hilfe des erzeugten Objektes auf der Konsole aus. Beachten Sie, dass dies nur durchgeführt werden 
 * darf, falls das Alter des Kunden größer oder gleich 18 ist. Ist dies nicht der Fall, so werden dem Objekt keine Werte 
 * zugewiesen oder auf der Konsole ausgegeben, da der Kunde zu jung für das Erstellen eines „Accounts“ wäre.
 * • Ergänzen Sie die Methode zur Abfrage des Mediums (Girocard oder Kreditkarte) durch eine Abfrage des jeweiligen Pincodes,
 * welcher vorher zufällig generiert wurde. Wird der Pincode dreimal falsch eingegeben, so soll kein Geld mehr abgehoben werden
 * können.
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
		//Start greeting
		greetingCustomer();
		
		System.out.println("------------\nThanks for using our ATM.");
	}
	
	
	//This method handles the greeting of a customer, if the customer is of legal age he can withdraw money
	private static void greetingCustomer() {
		//Date of today
		String dateToday = "23 11 2022";		//Format differs because of later code
		
		//Create new Customer object
		Customer customer = new Customer();
//Set customer data
		//Set name
		System.out.println("Please input your full name:");
		customer.setName(scanner.nextLine());
		
		//Set Birthday and check input(WIP)
		boolean correctDateFormat = false;
		String birthdayTemp = "";
		System.out.println("Please input your birth date (dd.mm.yyyy):");
		while(!correctDateFormat) {			
			birthdayTemp = scanner.nextLine();
			if(birthdayTemp.length() == 10)
				correctDateFormat = checkDateFormat(birthdayTemp);
			else
				System.out.println("Invalid input!\nPlease input your birth date (dd.mm.yyyy) correctly:");
		}
		customer.setBirthDate(birthdayTemp);
		
		//Set address
		System.out.println("Please input your full address:");
		customer.setAddress(scanner.nextLine());
		
		//Set mail
		System.out.println("Please input your email:");
		customer.setMail(scanner.nextLine());

//Check for age restrictions
		//Splitting the birthday into 3 different integer (day, month, year) 
		String birthday = birthdayTemp.replace(".", " "); 	//Replace "." with " " to make it easier to read using nextInt()
		Scanner scannerBirthday = new Scanner(birthday);
		int birthdayDay = scannerBirthday.nextInt();
		int birthdayMonth = scannerBirthday.nextInt();
		int birthdayYear = scannerBirthday.nextInt();
		//Splitting the date of today into 3 different integer (day, month, year) 
		Scanner scannerToday = new Scanner(dateToday);
		int todayDay = scannerToday.nextInt();
		int todayMonth = scannerToday.nextInt();
		int todayYear = scannerToday.nextInt();
		//Closing both scanner
		scannerBirthday.close();
		scannerToday.close();
		
		//Calculate age
		customer.setAge(customer.calculateAge(birthdayDay, birthdayMonth, birthdayYear, todayDay, todayMonth, todayYear));
		


		//Control the age, if customer is an adult(18+) than the account will be created. If customer is a minor(<18) than access will be denied.  
		if(customer.getAge() >= 18) {
			//Generating PinCodes
			InitializePinCodes(customer);
			System.out.println("------------\nYour pin codes are generated.\n------------");
			
			customer.printOutAttributes();
			
			boolean withdrawProposal = false;
			while(!withdrawProposal) {
				System.out.println("------------\nYour Bank account has been succesfully created.\n------------\nDo you want to withdraw money (yes [1] or no [2])");
				int withdraw = scanner.nextInt();
				
				switch(withdraw) {
				case 1:
					withdrawProposal = true;
					int cardType = askForCard();
					checkPinCode(cardType, customer);
					handleATM();
					break;
				case 2:
					withdrawProposal = true;
					break;
				default:
					System.out.println("Error! Invalid Input! Try again!\nDo you want to withdraw money (yes [1] or no [2])");
				}
			}
			
			
			
			//handleATM();
		}
		else {
			//WIP - Not old enough
			System.out.println("------------\nYou are not old enough to create a bank account or you have made an incorrect input. Please try again!");
		}
		//System.out.println(age);
	}
	
	//This method handles the Request for the Card and withdrawal amount, depending on the age restriction
	private static void handleATM() {
		//Initialize an array to store withdrawal amounts.
		long[] withdrawals = new long[5];
		//Ask for a withdrawal 5 times and store the amounts in an array
		for(int i = 0; i < withdrawals.length; i++) {
			System.out.print((i+1) + ". Withdrawal: ");
			withdrawals[i] = withdrawCalc();
		}
		//Print out all withdrawals
		System.out.println("The following amounts were withdrawn:");
		for(long amount : withdrawals) {
			System.out.println(amount + " Euro");
		}
		
		//Print out how many withdrawals have been done
		System.out.println("------------\nYou withdrew " + withdrawals.length + " amounts.\n------------");
		
		//Call Search methods and print out the results
		System.out.println("The lowest amount is: " + smallSearch(withdrawals));		//Print out smallest Value of withdrawal amounts
		if(searchSecondHigh(withdrawals) == 0) {
			System.out.println("Alle Werte sind gleich.");		//All amounts are equal to each other. That's why there is no value for secondHigh
		}
		else {
			System.out.println("The second highest amount is: " + searchSecondHigh(withdrawals));		//Print out second highest withdrawal amount
		}
		System.out.println("The average of all amounts is: " + calcAverage(withdrawals));		//Print out the average of the array

		
		scanner.close();		//Scanner is closed so that no further input can be done
	}
	//This method asks the user for the card type. Either Girocard or credit card are accepted.
	private static int askForCard() {
		int cardType = 0;
		System.out.println("What medium do you want to use to withdraw money: Girocard (1) or credit card (2) ?");
		
		boolean validCardType = false;		//Flag for accepted/valid card.
		
		while(!validCardType) {
			try {		//try to do user input if not catch exception
				cardType = scanner.nextInt();
				switch(cardType) {
					case 1:			//Valid Input: Case Girocard
						validCardType = true;
						break;
					case 2:			//Valid Input: Case Credit Card
						validCardType = true;
						break;
					default:		//Invalid Input! Try again
						System.out.println("Incorrect Card type! Try again!");
						break;
				}
			}
			catch(Exception e) {		//if there is an exception than catch it here and return an error code (preferably an easy to understand one)
				System.out.println("Error 1!\nTry again! Please input \"1\" or \"2\"!");
				scanner.next();
				continue;
			}
		}
		return cardType;
	}
	
	//This method asks for the withdrawal amount and checks if the amount is acceptable 
	private static long withdrawCalc() {		
		System.out.println("How much do you want to withdraw?");
		long withdraw = 0L;
		
		while(withdraw == 0 || withdraw % 5 != 0) {
			try {		//try to do user input if not catch exception
				withdraw = scanner.nextLong();
				if (withdraw % 5 == 0 && withdraw > 0) {
					berechnung(withdraw);	//Amount is acceptable and the bills will be calculated.
				}
				else {
					System.out.println("Your request was denied! Invalid withdrawal!\nTry again! Please input a valid amount!");
					//Withdrawal was denied. It will ask for a new withdrawal amount until a correct amount was put in.
				}
			}
			catch(Exception e) {		//if there is an exception than catch it here and return an error code (preferably an easy to understand one)
				System.out.println("Error 2!\nTry again! Please input a valid withdrawal amount!");
				scanner.next();
				continue;
			}
		}
		return withdraw;	
	}

//This method does the calculation of the amount of bills.
	//At last it will print out the amount of bills.
	private static void berechnung(long withdrawal) {
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
	private static long smallSearch(long[] withdrawals) {
		long smallestValue = withdrawals[0];	//Declare Variable to store smallest value which will be returned later. Initialize it with the first element of the array
		for(int i = 1; i < withdrawals.length; i++) {
			if(smallestValue > withdrawals[i]) {		
				smallestValue = withdrawals[i];		//if the withdrawal amount in the array[i] is smaller than the value of the Variable smallestValue than set the array value as new smallestValue, else do next element
			}
		}
		return smallestValue;
	}
	
	//Second Method: Return second highest value in array
	private static long searchSecondHigh(long[] withdrawals) {
		long highest = withdrawals[0];	//Declare Variable to store smallest value which will be returned later. Initialize it with the first element of the array
		long secondHighest = 0;
		
		for(int i = 1; i < withdrawals.length; i++) {
			//Check if the next element in the array is smaller than highest and bigger than secondHighest. if true than set array[i] value as new secondHighest
			if(withdrawals[i] < highest && withdrawals[i] > secondHighest) {		
				secondHighest = withdrawals[i];
			}
			//Check if the next element in the array is bigger than highest. If true set highest as new secondHighest and array[i] Value as new highest
			else if(withdrawals[i] > highest) {
				secondHighest = highest;
				highest = withdrawals[i];
			}
		}
		return secondHighest;
	}
	
	//Third Method: Return the Average of an array
	private static long calcAverage(long[] withdrawals) {
		long average = -1;		//Declare Variable to store smallest value which will be returned later. Initialize it with -1 to be sure it can be returned and a mistake will be easily seen.
		long sumOfArray = 0;	
		
		//Calculate the sum of the array
		for(int i = 0; i < withdrawals.length; i++) {
			sumOfArray += withdrawals[i];
		}
		//Calculate the average of the array
		average = sumOfArray/withdrawals.length;
		
		return average;
	}
	private static boolean checkDateFormat(String dateTemp) {
		boolean correctDateFormat = false;
		
		//Splitting the birthday into 3 different integer (day, month, year) 
		String date = dateTemp.replace(".", " "); 	//Replace "." with " " to make it easier to read using nextInt()
		Scanner scannerDate = new Scanner(date);
		int day = scannerDate.nextInt();
		int month = scannerDate.nextInt();
		int year = scannerDate.nextInt();
		
		//Check if year is correct format
		if(1900 < year && year <= 2022) {		//Date needs to be between 1900 and 2022
			if( month > 0 && month < 13) {		//Mont can not be less than 1 or more than 12
				switch(month) {
				case 2:
					if(day > 0 && day <= 28)	//Day can not exceed 28 when month is 2 (february)
						correctDateFormat = true;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					if(day > 0 && day <= 30)	//Day can not exceed 30 for month 4,6,9,11
						correctDateFormat = true;
					break;
				default:
					if(day > 0 && day <= 31)	//Every other month the day can not exceed 31
						correctDateFormat = true;
					break;
				}
			}
		}
		
		//This handles the rare occurence of a leap year
		if(year%4 == 0 && month == 2 && day == 29)		//year needs to be mod4==0, month == 2 and day == 29 -> than the date is correct as well
			correctDateFormat = true;
		
		//Close scanner and return correctDateFormat Parameter
		scannerDate.close();
		return correctDateFormat;
	}
	private static boolean checkPinCode(int cardType, Customer customer) {
		boolean correctPin = false;
		Scanner scannerPin = new Scanner(System.in);
		//Show selected card and ask for pin
		//Compare Pin for Giro Card
		if(cardType == 1) {
			System.out.println("You have selected Girocard. Please input your pin Code:");
			String pinCode = scannerPin.next();	//gets pin input from scanner
			if(pinCode.equals(customer.getPinCodeDebitCard())) {	//Compare input pin and actual pin if true go on
				correctPin = true;	
				System.out.println("The pin is correct\n------------");
			}else {		//if false, ask again
				System.out.println("Invalid Pin! Try again!");
				checkPinCode(cardType, customer);
			}
		}
		//Compare Pin for Credit Card
		if(cardType == 2) {
			System.out.println("You have selected Creditcard. Please input your pin Code:");
			String pinCode = scannerPin.next();	//gets pin input from scanner
			if(pinCode.equals(customer.getPinCodeCreditCard())) {	//Compare input pin and actual pin if true go on
				correctPin = true;
				System.out.println("The pin is correct\n------------");
			}else {		//if false, ask again
				System.out.println("Invalid Pin! Try again!");
				checkPinCode(cardType, customer);
			}	
		}
		//Close Scanner and return correctPin Parameter
		scannerPin.close();
		return correctPin;
	}
	//Create Pin codes and initialize them
		//Create Pincode
	private static String pinCode() {
		String pin = "";
		int random;
		for(int i = 0; i < 4; i++) {
			random = (int)(Math.random() * 10);	//Create random number between 0 and 9
			pin += random;	//add random number to existing String
		}
		return pin;
	}
		//Create pinCodes for both Cards
	private static void InitializePinCodes(Customer customer) {		
		customer.setPinCodeDebitCard(pinCode());
		customer.setPinCodeCreditCard(pinCode());
	}
}

