package Ticket;

import Ticketshop.Currency;

/**
 * 
 * @author René Voutta
 * @mail u38509@hs-harz.de
 * @version 1.0
 *
 *This class handles all the methods for the ConcertTicket and extends Ticket.
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
	 * This method is the constructor of the ConcertTicket class
	 */
	public ConcertTicket(String name, String location, double price, double discount, boolean isFreeOfCharge, boolean isFrontOfStage) {
		super(name, location, price, discount, isFreeOfCharge);
		this.isFrontOfStage = isFrontOfStage;
	}

	
	
	/**
	 * @param currency
	 *  
	 * This method overrides the toString-method of the Ticket class
	 */
	@Override
	public String toString(Currency currency) {
		return super.toString(currency)
				+ ", FRONT STAGE: " + isFrontOfStage;
	}

	/**
	 * @throws Exception
	 * 
	 * This method overrides the abstract calculatePrice-method of the Ticket class
	 */
	@Override
	public double calculatePrice() throws Exception {
		double newPrice = super.getPrice();
		//Throw if newPrice is equal or less than 0
		if(newPrice <= 0) {
			throw new Exception("Fehler: Preisberechnung - ConcertTicket.");
		}
		else {
			//Adding surchange for Front of Stage
			if(isFrontOfStage)
				newPrice += 10d;
			return newPrice;
		}
		
	}
}
