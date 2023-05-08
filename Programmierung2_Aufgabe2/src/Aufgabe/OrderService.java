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
	private int maxTimeFrame = 60;
	
	//Starting stats
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
					
					for (int i = 0; i < maxTimeFrame; i++) {
						//New customer Arrivals
						randomCustomerArrival(i);
						servingNextCustomer(i);
					}
					validInteger = !validInteger;
				}
				else if(simulationChoice == 2) {
					System.out.println("You have selected: Manual input.");
//Manual Input
					int newCustomer;

					for (int i = 0; i < maxTimeFrame; i++) {
	//Asking for new Customers
						System.out.println("\nPlease enter the number of customers for this minute");
						try{
							newCustomer = scanner.nextInt();
							scanner.close();
						}
						catch(Exception e) {
							scanner.close();
							throw new Exception("This input is not valid! Only Integers are allowed.");
						}
						if(newCustomer < 0) {
							scanner.close();
							throw new Exception("This input is not valid! At least 0 customer are needed. No negative.");
						}
						newCustomerArrival(newCustomer,i);
	//Next Customer
						servingNextCustomer(i);						
					}
					validInteger = !validInteger;
				}
				else
					System.out.println("Invalid Integer! Try again!\n");

//Statistics	
				int averageWaitingTime = 0;
				int averageServingTime = 0;
				if(customersServed != 0) {
					//Calculate Average Waiting Time
					averageWaitingTime = (int)(waitingTime/customersServed);
					//Calculate Average Serving time
					float averageServingTimeFloat = servingTime/customersServed;
					if(averageServingTimeFloat < 1.5)
						averageServingTime = 1;
					else if(averageServingTimeFloat >= 1.5 && averageServingTimeFloat < 2.5)
						averageServingTime = 2;
					else
						averageServingTime = 3;
				}
				
				
					
				printStatistics(customersServed, averageWaitingTime, averageServingTime);
			}
			scanner.close();
		}
		catch(Exception e) {
			scanner.close();
			throw new Exception(e + "\nThis input is not valid! Only Integers are allowed.");
		}
	}
	
	/**
	 * This method checks if a next customer can be served.
	 * Changes 'timeTillNextOrder' based on customer order time
	 * Changes 'waitingTime' based on actualTime and timeOfArrival
	 * Changes 'servingTime' based on customer orderTime
	 * @param actualTime
	 */
	private void servingNextCustomer(int actualTime) {
		if(timeTillNextOrder == 0) {
			if(!customerQueue.isEmpty()) {
				timeTillNextOrder = customerQueue.getFirst().getOrderTime();
				waitingTime += (actualTime - customerQueue.getFirst().getTimeOfArrival());
				servingTime += customerQueue.getFirst().orderTime;
			}
		}
		else if(timeTillNextOrder == 1) {
			customerQueue.removeFirst();
			customersServed++;
			timeTillNextOrder--;
		}
		else
			timeTillNextOrder--;
	}
	
	/**
	 * Prints out statistics
	 * @param customersServed
	 * @param averageWaitingTime
	 * @param averageServingTime
	 */
	private void printStatistics(int customersServed, int averageWaitingTime, int averageServingTime) {
		System.out.println("\n--- STATISTICS---\n\nSimulated time frame: " + maxTimeFrame + " minutes"
						+ "\nTotal number of customers: " + (customerQueue.size() + customersServed)
						+ "\nNumber of customers served: " + customersServed
						+ "\nAverage wait is about: " + averageWaitingTime + " minutes"
						+ "\nAverage serving time for one customer is about: " + averageServingTime + " minutes"
						+ "\nCustomers left in queue: " + customerQueue.size());
	}
}
