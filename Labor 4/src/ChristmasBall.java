
public class ChristmasBall {
	
	private final double pi = Math.PI;

	//Attributes
	private int radius;
	private String color;
	private String pattern;
	private double weight;
	
	/**Standard Constructor for object definition
	 * 
	 * @param radius
	 * @param color
	 * @param pattern
	 * @param weight
	 */
	public ChristmasBall(int radius, String color, String pattern, double weight) {
		this.radius = radius;
		this.color = color;
		this.pattern = pattern;
		this.weight = weight;
	}
	
	//Getter + Setter
	public void setRadius(int radius) {this.radius = radius;}
	public int getRadius() {return radius;}
	public void setColor(String color){this.color = color;}
	public String getColor() {return color;}
	public void setPattern(String pattern) {this.pattern = pattern;}
	public String getPattern() {return pattern;}
	public void setWeight(double weight) {this.weight = weight;}
	public double getWeight() {return weight;}

	/**volume method (Calculation of a ball: 4/3*π*r^3)
	 * 
	 * @param radius
	 * @return
	 */
	public double volumeChristmasBall(int radius) {
		return ((double)4/3)*pi*(Math.pow(radius, 3));
	}
	
	/**toString method
	 * 
	 * @param radius
	 * @param color
	 * @param pattern
	 * @param weight
	 * @return
	 */
	public String toString() {		
		return "Christmas Ball, Radius: " + radius + "cm, Color: " + color + ", Pattern: " + pattern;
 	}

}
