package Ticket;

import Ticketshop.Currency;

/**
 * 
 * @author René Voutta
 * @mail u38509@hs-harz.de
 * @version 1.0
 * 
 *
 * @description This class handles all the methods for the CinemaTicket and extends Ticket
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
	 * @description This method is the constructor of the CinemaTicket class
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
	 * @description This method overrides the toString-method of the Ticket class
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
	 * @description This method overrides the abstract calculatePrice-method of the Ticket class
	 */
	@Override
	public double calculatePrice() throws Exception{
		double newPrice = super.getPrice();
		
		//Throw if newPrice is equal or less than 0
		if(newPrice <= 0) 
			throw new Exception("\nFehler: Preisberechnung - CinemaTicket(" + super.getName() + ")\nUngültiger Preis: " + super.getPrice());
		//Throw if duration is equal or less than 0
		else if(duration <= 0) 
			throw new Exception("\nFehler: Filmdauer - CinemaTicket(" + super.getName() + ")\nUngültige Filmdauer: " + duration);			
		
		if(super.isFreeOfCharge()) {
			newPrice = 0;
		}
		else{
			//Adding additional charge for overlength
			if(duration > 160)
				newPrice += 3.5;
			else if(duration > 140)
				newPrice += 2.5;
			else if(duration > 120)
				newPrice += 1.5;
			
			//Adding additional charge for premium
			if(isPremium)
				newPrice += 2.5;
			//Adding additional charge for 3D
			if(is3d)
				newPrice += 3;
			
			if(newPrice > 0) {
				super.setDiscountedPrice(newPrice);
			}else
				throw new Exception("\nFehler: Preisberechnung - CinemaTicket(" + super.getName() + ")\nUngültiger Preis: " + super.getPrice() + " nach Preiskalkulation.");
		}
		
		return newPrice;				
	}
	
}
