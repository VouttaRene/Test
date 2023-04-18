package Ticket;

import Ticketshop.Currency;

/**
 * 
 * @author René Voutta
 * @mail u38509@hs-harz.de
 * @version 1.0
 * 
 *
 *This class handles all the methods for the CinemaTicket and extends Ticket
 */

public class CinemaTicket extends Ticket{
	
	private int duration;
	private boolean isPremium;
	private boolean is3d;
	
	/**
	 * 
	 * @param name
	 * @param location
	 * @param price
	 * @param discount
	 * @param isFreeOfCharge
	 * @param duration
	 * @param isPremium
	 * @param is3d
	 * 
	 * This method is the constructor of the CinemaTicket class
	 */
	public CinemaTicket(String name, String location, double price, double discount, boolean isFreeOfCharge, int duration, boolean isPremium, boolean is3d) {
		super(name, location, price, discount, isFreeOfCharge);
		this.duration = duration;
		this.isPremium = isPremium;
		this.is3d = is3d;
	}
	
	/**
	 * @param currency
	 * 
	 * This method overrides the toString-method of the Ticket class
	 */
	@Override
	public String toString(Currency currency) {
		return super.toString(currency)
				+ ", LENGTH: " + duration + " Minutes" 
				+ ", PREMIUM SEATS: " + isPremium
				+ ", 3D: " + is3d;
	}

	/**
	 * @throws Exception
	 * 
	 * This method overrides the abstract calculatePrice-method of the Ticket class
	 */
	@Override
	public double calculatePrice() throws Exception{
		double newPrice = super.getPrice();			
		//Throw if newPrice is equal or less than 0
		if(newPrice <= 0) {
			throw new Exception("Fehler: Preisberechnung - CinemaTicket.");
		}
		//Throw if duraction is equal or less than 0
		else if(duration <= 0) {
			throw new Exception("Fehler: Filmdauer - CinemaTicket.");			
		}
		else{
			//Adding surchange for overlength
			if(duration > 160)
				newPrice += 3.5;
			else if(duration > 140)
				newPrice += 2.5;
			else if(duration > 120)
				newPrice += 1.5;
			else
				newPrice += 0;
			//Adding surchange for premium
			if(isPremium)
				newPrice += 2.5;
			//Adding surchange for 3D
			if(is3d)
				newPrice += 3;
		}
		return newPrice;		
	}
	
}
