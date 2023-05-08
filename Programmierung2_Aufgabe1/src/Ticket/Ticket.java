package Ticket;

import Ticketshop.Currency;

/**
 * 
 * @author René Voutta
 * @mail u38509@hs-harz.de
 * @version 1.0
 * 
 *
 * @description This class handles all the methods for the Ticket
 */
public abstract class Ticket {
	
	private String name;
	private String location;
	private double price;
	private double discount;
	private boolean freeOfCharge;
	
	private double discountedPrice;
	
	/**
	 * 
	 * @param name
	 * @param location
	 * @param price
	 * @param discount
	 * @param isFreeOfCharge
	 * 
	 * @description This method is the constructor for the Ticket
	 */
	public Ticket(String name, String location, double price, double discount, boolean isFreeOfCharge) {
		this.name = name;
		this.location = location;
		this.price = price;
		this.discount = discount;
		this.freeOfCharge = isFreeOfCharge;
	}

	
	//Abstract method for price calculation
	public abstract double calculatePrice() throws Exception;	
	
	/**
	 * 
	 * @return newPrice
	 * @throws Exception
	 * 
	 * @description This method calculates a discounted price based on the actual price. 
	 */
	public double calculatePriceDiscount() throws Exception{
		double newPrice = getDiscountedPrice();
		double discountPercentage = getDiscount();

//		if(newPrice <= 0) {
//			throw new Exception("Fehler: Rabattberechnung - Ticket.");
//		}
//		else {
			//Check for discount and reduce the price accordingly
			if(discountPercentage > 0 && discountPercentage < 100) {	//a discount of 100% is equal to a free ticket
				newPrice = newPrice * (1 - (discountPercentage / 100));				
//			}
			
			newPrice = Math.round(newPrice * 1000)/1000d;	//round new Price so that we would get to digits after at most
		}
		setDiscountedPrice(newPrice);
		return newPrice;		
	}

	
	/**
	 * 
	 * @param currency
	 * @return 
	 * 
	 * @description This method returns all the Information based  on its details
	 */
	public String toString(Currency currency) {
		return "LOCATION: " + location 
				+ ", NAME: " + name 
				+ ", ORIGINAL TICKET PREIS: " + price + " " + currency
				+ ", FINAL TICKET PREIS: " + discountedPrice + " " + currency
				+ ", DISCOUNT: " + discount + "%"
				+ ", \nFREE TICKET: " + freeOfCharge;
	}

	//Getter
	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public double getPrice() {
		return price;
	}

	public double getDiscount() {
		return discount;
	}

	public boolean isFreeOfCharge() {
		return freeOfCharge;
	}
	
	public double getDiscountedPrice() {
		return discountedPrice;
	}

	//Setter
	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public void setFreeOfCharge(boolean isFreeOfCharge) {
		this.freeOfCharge = isFreeOfCharge;
	}
	
	public void setDiscountedPrice(double discountedPrice) {
		this.discountedPrice = discountedPrice;
	}
}
