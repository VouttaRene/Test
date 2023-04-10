package Ticketshop;

public abstract class Ticket {
	
	private String name;
	private String location;
	private double price;
	private double discount;
	private boolean isFreeOfCharge;
	
	//Constructor
	public Ticket(String name, String location, double price, double discount, boolean isFreeOfCharge) {
		this.name = name;
		this.location = location;
		this.price = price;
		this.discount = discount;
		this.isFreeOfCharge = isFreeOfCharge;
	}

	
	//Price calculation
	
	//Price Calculation with discount

	
	//to-String methode
	@Override
	public String toString() {
		return "Ticket [name=" + name + ", location=" + location + ", price=" + price + ", discount=" + discount
				+ ", freeOfCharge=" + isFreeOfCharge + "]";
	}

	//Getter
	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public double getPrice() {
		return price;
	}

	public double getDiscount() {
		return discount;
	}

	public boolean isFreeOfCharge() {
		return isFreeOfCharge;
	}

	//Setter
	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public void setFreeOfCharge(boolean isFreeOfCharge) {
		this.isFreeOfCharge = isFreeOfCharge;
	}
	
}
