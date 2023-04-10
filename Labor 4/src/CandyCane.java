
public class CandyCane {
	
	//Attributes
	private double sugarAmount;
	private double weight;
	
	/**Standard Constructor for object definition
	 * 
	 * @param sugarAmount
	 * @param weight
	 */
	public CandyCane(double sugarAmount, double weight) {
		this.sugarAmount = sugarAmount;
		this.weight = weight;
	}
	
	//Getter + Setter
	public void setSugarAmount(double sugarAmount) {this.sugarAmount = sugarAmount;}
	public double getSugarAmount() {return sugarAmount;}
	public void setWeight(double weight) {this.weight = weight;}
	public double getWeight() {return weight;}
	
	/**
	 * This method calculates the amount of kcal in a candy cane
	 * 1g of sugar contains about 3.87 kcal
	 * @param weight
	 * @return
	 */
	public double calorieCounter(double weight) {
		return weight*3.87;
	}
	
	
	/**to String method
	 * 
	 * @param sugarAmount
	 * @param weight
	 * @return
	 */
	public String toString() {
		return "Candy Cane, Sugar amount: " + sugarAmount + "g";
	}
}
