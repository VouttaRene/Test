package Aufgabe;

import java.util.LinkedList;
import java.util.Scanner;
/**
 * 
 * @author René Voutta
 * @mail u38509@hs-harz.de
 * @version 1.0
 * 
 * This class handles all methods for the Order Service and prints out the statistics 
 */
public class OrderService {
	
	//Customer Queue
	private LinkedList<Customer> customerQueue = new LinkedList<Customer>();
	//Time frame
	private int maxTimeFrame = 5;
	
	//Initial Statistics
	private int customersServed = 0;
	private int waitingTime = 0;
	private int servingTime = 0;
	private int timeTillNextOrder = 0;

	//default constructor
	public OrderService() {}
	
	/**
	 * This method creates random customer arrivals
	 * 50% - 0 customer
	 * 30% - 1 customer
	 * 10% - 2 customer
	 * 10% - 3 customer
	 * @param timeOfArrival
	 */
	private void randomCustomerArrival(int timeOfArrival) {
		int random = (int)(Math.random()*10);
		
		if(random >= 0 && random < 10) {
			switch(random) {
				case 0:
					for(int i = 0; i < 3; i++) {
						Customer customer = new Customer(timeOfArrival);
						customer.setOrderTime();
						customerQueue.add(customer);
					}						
					break;
				case 1:
					for(int i = 0; i < 2; i++) {
						Customer customer = new Customer(timeOfArrival);
						customer.setOrderTime();
						customerQueue.add(customer);
					}
					break;
				case 2:
				case 3:
				case 4:
					Customer customer = new Customer(timeOfArrival);
					customer.setOrderTime();
					customerQueue.add(customer);
					break;
				default:
					break;
			}
		}
	}
	
	/**
	 * This method creates customer arrivals based on user input
	 * @param newCustomerCount
	 * @param timeOfArrival
	 */
	private void newCustomerArrival(int newCustomerCount, int timeOfArrival) {
		for(int i = 0; i < newCustomerCount; i++) {
			Customer customer = new Customer(timeOfArrival);
			customer.setOrderTime();
			customerQueue.add(customer);
		}
	}
	
	/**
	 * This methods simulates the queue.
	 * Either it simulates all customer arrivals randomly or via manual input.
	 * @throws Exception
	 */
	public void simulateQueue() throws Exception{
		Scanner scanner = new Scanner(System.in);
		try{

			boolean validInteger = false;
			
			while(!validInteger) {
				System.out.println("Do you want to simulate the number of customers (1) or enter each manually per minute (2)?");
				int simulationChoice = scanner.nextInt();
				if(simulationChoice == 1) {
					
//Simulating
					System.out.println("You have selected: Simulating.");
					
					for (int currentTime = 0; currentTime < maxTimeFrame; currentTime++) {
						//New customer Arrivals
						randomCustomerArrival(currentTime);
						servingNextCustomer(currentTime);
					}
					validInteger = !validInteger;
				}
				else if(simulationChoice == 2) {
					System.out.println("You have selected: Manual input.");
					
//Manual Input
					for (int currentTime = 0; currentTime < maxTimeFrame; currentTime++) {
						int newCustomer;
	//Asking for new Customers
						System.out.println("\nPlease enter the number of customers for this minute");
							try{
								newCustomer = scanner.nextInt();
								if(newCustomer < 0) {
									scanner.close();
									throw new Exception();
								}
								newCustomerArrival(newCustomer,currentTime);
							}
							catch(Exception e) {
								scanner.close();
								throw new Exception("This input is not valid! Only positive Integers or 0 are allowed.");
						}
	//Next Customer
						servingNextCustomer(currentTime);						
					}
					validInteger = !validInteger;
				}
				else
					System.out.println("Invalid Integer! Try again!\n");

//Calculate Statistics	
				}
				int averageWaitingTime;
				int averageServingTime;
				if(customersServed > 0) {
					averageWaitingTime = Math.round(waitingTime/customersServed);
					averageServingTime = Math.round(servingTime/customersServed);
				}else {
					averageWaitingTime = 0;
					averageServingTime = 0;
				}	
				printStatistics(averageWaitingTime, averageServingTime);
			
			scanner.close();
		}
		catch(Exception e) {
			scanner.close();
			throw new Exception(e + "\nThis input is not valid! Only Integers are allowed.");
		}
		
		scanner.close();
	}
	
	/**
	 * This method checks if a next customer can be served.
	 * Changes 'timeTillNextOrder' based on customer order time
	 * Changes 'waitingTime' based on actualTime and timeOfArrival
	 * Changes 'servingTime' based on customer orderTime
	 * @param currentTime
	 */
	private void servingNextCustomer(int currentTime) {
		//Imbiss ist frei und Warteschlange nicht leer
		if(timeTillNextOrder == 0) {
			if(!customerQueue.isEmpty()) {
				timeTillNextOrder = customerQueue.getFirst().getOrderTime();
				waitingTime += (currentTime - customerQueue.getFirst().getTimeOfArrival());
				servingTime += timeTillNextOrder;
			}
		}
		//Wenn eine Zeiteinheit verbleibend, Kunde aus Warteschlange entfernen
		if(timeTillNextOrder == 1) {
			customerQueue.removeFirst();
			customersServed++;
			timeTillNextOrder--;
		}
		else if(timeTillNextOrder > 1)
			timeTillNextOrder--;
	}
	
	/**
	 * Prints out statistics
	 * @param customersServed
	 * @param averageWaitingTime
	 * @param averageServingTime
	 */
	private void printStatistics(int averageWaitingTime, int averageServingTime) {
		System.out.println("\n--- STATISTICS---\n\nSimulated time frame: " + maxTimeFrame + " minutes"
						+ "\nTotal number of customers: " + (customerQueue.size() + customersServed)
						+ "\nNumber of customers served: " + customersServed
						+ "\nAverage wait is about: " + averageWaitingTime + " minutes"
						+ "\nAverage serving time for one customer is about: " + averageServingTime + " minutes"
						+ "\nCustomers left in queue: " + customerQueue.size());
	}
}
