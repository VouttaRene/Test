package Main;

import Aufgabe.OrderService;
/**
 * 
 * @author René Voutta
 * @mail u38509@hs-harz.de
 * @version 1.0
 * 
 * This project is in accordance to the second exercise for "Programmierung 2"
 */
public class Main {

	public static void main(String[] args) throws Exception {
		OrderService orderService = new OrderService();
		
		orderService.simulateQueue();
	}
}
