package Ticket;

import Ticketshop.Currency;

/**
 * 
 * @author René Voutta
 * @mail u38509@hs-harz.de
 * @version 1.0
 *
 * @description This class handles all the methods for the ConcertTicket and extends Ticket.
 */

public class ConcertTicket extends Ticket {
	
	private boolean isFrontOfStage;

	/**
	 * 
	 * @param name
	 * @param location
	 * @param price
	 * @param discount
	 * @param isFreeOfCharge
	 * @param isFrontOfStage
	 * 
	 * @description This method is the constructor of the ConcertTicket class
	 */
	public ConcertTicket(String name, String location, double price, double discount, boolean isFreeOfCharge, boolean isFrontOfStage) {
		super(name, location, price, discount, isFreeOfCharge);
		this.isFrontOfStage = isFrontOfStage;
	}

	
	
	/**
	 * @param currency
	 *  
	 * @description This method overrides the toString-method of the Ticket class
	 */
	@Override
	public String toString(Currency currency) {
		return super.toString(currency)
				+ ", FRONT STAGE: " + isFrontOfStage;
	}

	/**
	 * @throws Exception
	 * 
	 * @description This method overrides the abstract calculatePrice-method of the Ticket class
	 */
	@Override
	public double calculatePrice() throws Exception {
		double newPrice = super.getPrice();
		
		//Throw if newPrice is equal to or less than 0
		if(newPrice <= 0) 
			throw new Exception("\nFehler: Preisberechnung - ConcertTicket(" + super.getName() + ")\nUngültiger Preis: " + super.getPrice());
		
		//Check if ticket is free
		if(super.isFreeOfCharge())
			newPrice = 0;
		//Adding additional charge for front of Stage
		else if(isFrontOfStage)
			newPrice += 10;
		
		if(newPrice > 0) {
			super.setDiscountedPrice(newPrice);
		}else
			throw new Exception("\nFehler: Preisberechnung - CinemaTicket(" + super.getName() + ")\nUngültiger Preis: " + super.getPrice() + " nach Preiskalkulation.");
	
		return newPrice;				
			
	}
}
