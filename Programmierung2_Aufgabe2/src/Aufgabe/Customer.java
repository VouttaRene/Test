package Aufgabe;

/**
 * 
 * @author René Voutta
 * @mail u38509@hs-harz.de
 * @version 1.0
 * 
 * This class is the basis for the 'Customer' object
 */
public class Customer {
	
	int timeOfArrival;
	int orderTime;
	
	/**
	 * Constructor of Customer class
	 * @param timeOfArrival
	 */
	public Customer(int timeOfArrival) {
		this.timeOfArrival = timeOfArrival;
	}
	
	/**
	 * This method gives back a random order time
	 * @return
	 */
	private int orderTime() {
		return (int)(Math.random()*3+1);
	}
	
	//Getter
	public int getTimeOfArrival() {
		return timeOfArrival;
	}
	public int getOrderTime() {
		return orderTime;
	}
	
	//Setter
	public void setOrderTime() {
		orderTime = orderTime();	//sets order time randomly
	}
}
