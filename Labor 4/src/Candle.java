
public class Candle {

	//Attributes
	private int size;
	private String color;
	private boolean electric;
	private double weight;
	
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
	
	//Konstruktor
	//to String Methode
}
