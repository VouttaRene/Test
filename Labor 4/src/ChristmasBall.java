
public class ChristmasBall {


	//Attributes
	private int radius;
	private String color;
	private String pattern;
	private double weight;
	
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
	
	//TO-DO:
	//Konstruktor + Overload
	// toString methode
	//volumen methode
}
