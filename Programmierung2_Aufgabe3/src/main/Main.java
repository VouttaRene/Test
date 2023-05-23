package main;
import aufgabe.SortingEvaluator;
/**
 * 
 * @author René Voutta
 * @mail u38509@hs-harz.de
 * @version 1.0
 * 
 * This project is in accordance to the third exercise for "Programmierung 2"
 */
public class Main {

	/**
	 * 
	 * @param args
	 * 
	 * This method is the main method and starts the execution of the programm
	 */
	public static void main(String[] args) {
		SortingEvaluator sorter = new SortingEvaluator();
		sorter.calculateRuntime();
	}
}
