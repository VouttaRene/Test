
public class Candle {

	//Attributes
	private int size;
	private String color;
	private boolean electric;
	private double weight;
	
	/**Standard Constructor for object definition
	 * 
	 * @param size
	 * @param color
	 * @param electric
	 * @param weight
	 */
	public Candle(int size, String color, boolean electric, double weight) {
		this.size = size;
		this.color = color;
		this.electric = electric;
		this.weight = weight;
	}
	
	//Getter + Setter
	public void setSize(int size) {this.size = size;}
	public int getSize() {return size;}
	public void setColor(String color) {this.color = color;}
	public String getColor() {return color;}
	public void setElectric(boolean electric) {this.electric = electric;}
	public boolean isElectric() {return electric;}
	public void setWeight(double weight) {this.weight = weight;}
	public double getWeight() {return weight;}
	
	/**to String method
	 * 
	 * @param size
	 * @param color
	 * @param electric
	 * @param weight
	 * @return
	 */
	public String toString() {
		if(electric)
			return "Electric Candle, Size: " + size + ", Lightcolor: " + color;
		else
			return "Real Candle, Size: " + size + ", Lightcolor: " + color;
	}
}
