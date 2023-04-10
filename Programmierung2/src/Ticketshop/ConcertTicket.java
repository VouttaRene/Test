package Ticketshop;

public class ConcertTicket extends Ticket {
	
	private boolean isFrontOfStage;

	public ConcertTicket(String name, String location, double price, double discount, boolean isFreeOfCharge, boolean isFrontOfStage) {
		super(name, location, price, discount, isFreeOfCharge);
		this.isFrontOfStage = isFrontOfStage;
	}

	
	
	//Price Calculation
	
	//to-String
	@Override
	public String toString() {
		return "ConcertTicket [isFrontOfStage=" + isFrontOfStage + ", toString()=" + super.toString() + "]";
	}
	

}
