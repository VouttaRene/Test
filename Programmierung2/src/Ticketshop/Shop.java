package Ticketshop;

import java.util.Scanner;
import Ticket.CinemaTicket;
import Ticket.ConcertTicket;
import Ticket.Ticket;
/**
 * 
 * @author René Voutta
 * @mail u38509@hs-harz.de
 * @version 1.0
 * 
 * This class handles all method for the shop
 */
public class Shop {
	
	Currency currency = Currency.EUR;
	
	//Create new tickets and filling an array with them
	Ticket cinemaTicket1 = new CinemaTicket("The Whale", "Goslar", 10.00, 5, false, 117, true, false);
	Ticket cinemaTicket2 = new CinemaTicket("Harry Potter und der Gefangene von Askaban", "Hannover", 12.00, 20, false, 142, true, false);
	Ticket cinemaTicket3 = new CinemaTicket("Der Herr der Ringe: Die Rückkehr des Königs", "Wernigerode", 11.00, 0, false, 210, true, true);
	
	Ticket concertTicket1 = new ConcertTicket("Ed Sheeran", "Frankfurt", 70.00, 2, false, true);
	Ticket concertTicket2 = new ConcertTicket("AnnenMayKantereit", "Leipzig", 50.00, 10, false, true);
	
	Ticket[] tickets = 	{cinemaTicket1, 
						 cinemaTicket2,
						 cinemaTicket3,
						 concertTicket1,
						 concertTicket2
						};
	
	/**
	 * 
	 * @throws Exception
	 * 
	 * This method prints out all Information of the tickets in the array after it calculated the price and the discounted price
	 */
	public void printTicket() throws Exception {
		System.out.println("\n--- SOLD TICKETS ---\n");
		//Throw if there are no tickets in the array
		if(tickets.length == 0) {
			throw new Exception("Fehler: Ticketarray - Shop.\n");
		}
		//loop through all the tickets-values and calculate all their prices before printing them out using the toString method.
		//at last calculate and print out the sum of all tickets
		for (int i = 0; i < tickets.length; i++) {
			tickets[i].setDiscountedPrice(tickets[i].calculatePrice());
			tickets[i].setDiscountedPrice(tickets[i].calculatePriceDiscount());
			System.out.println(tickets[i].toString(currency) + "\n");
			calculateEndPrice();
		}
		
	}
	
	//This methods calculates all discoutedPrices to get the sum of all the tickets bought
	public void calculateEndPrice() {
		double endPrice = 0;
		for (int i = 0; i < tickets.length; i++) {
			endPrice += tickets[i].getDiscountedPrice();
		}
		
		System.out.println("--- OVERALL SALES ---\n" + endPrice + " " + currency + " based on " + tickets.length + " sold ticket(s)");
	}
	
	//This method handles the question if the current currency should be changed
	public void AskForChange() {
		boolean temp = true;
		System.out.println("Aktuelle Währung: " + currency + ".\nSoll die Währung gewechselt werden? [j/n]");
		Scanner scanner = new Scanner(System.in);
		
		while(temp) {
			String changeCurrency = scanner.next();
			//if currency should be changed then start ChangeCurrency method
			if(changeCurrency.equals("j")) {
				temp = !temp;
				System.out.println("Wird gewechselt!");
				ChangeCurrency();
				break;
			}
			//if currency should not be changed then go on without change
			else if(changeCurrency.equals("n")) {
				temp = !temp;
				System.out.println("Währung wird nicht gewechselt!");
			}
			//if the input is not accepted. Ask again
			else
				System.out.println("Fehler!\nSoll die Währung gewechslet werden? [j/n]");
			
		}
		scanner.close();		
	}
	
	//This method handles the change of currency
	public void ChangeCurrency() {
		
		Scanner scanner = new Scanner(System.in);
		boolean temp = true;
		while(temp) {
			System.out.println("Wähle eine Währung aus! [EUR/USD/GBP]");
			String newCurrency = scanner.next();
			//if new currency equals old currency, change nothing
			if(newCurrency.equals(currency.toString())) {
				System.out.println("Währung muss nicht gewechselt werden!");
				break;
			}
			//change to EUR
			else if(newCurrency.equals("EUR")) {
				currency = Currency.EUR;
				temp = !temp;
				System.out.println("Neue Währung: EUR");
				break;
			}
			//change to USD
			else if(newCurrency.equals("USD")) {
				currency = Currency.USD;
				temp = !temp;
				System.out.println("Neue Währung: USD");
				break;
			}
			//change to GBP
			else if(newCurrency.equals("GBP")) {
				currency = Currency.GBP;
				temp = !temp;
				System.out.println("Neue Währung: GBP");
				break;
			}
			//if input is not accepted start again from AskForChange
			else
				temp = !temp;
				AskForChange();
		}
		scanner.close();
	}
}
