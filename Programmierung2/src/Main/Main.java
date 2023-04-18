package Main;

import Ticketshop.Shop;

/**
 * 
 * @author René Voutta
 * @mail u38509@hs-harz.de
 * @version 1.0
 * 
 * This project is in accordance to the first excercise for "Programmierung 2"
 */

public class Main {
	/**
	 * 
	 * @param args
	 * @throws Exception
	 * 
	 * This method executes the Ticketshop.
	 */	
	public static void main(String[] args) throws Exception {
		
		Shop shop = new Shop(); //Create new instance of ticketshop
		
		shop.AskForChange();	//First ask if a change in currency is neccessary
		shop.printTicket();		//Print out existing tickets with all of the information
	}
}
