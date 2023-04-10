package Ticketshop;

public class CinemaTicket extends Ticket{
	
	private int duration;
	private boolean isPremium;
	private boolean is3d;
	
	//Constructor
	public CinemaTicket(String name, String location, double price, double discount, boolean isFreeOfCharge, int duration, boolean isPremium, boolean is3d) {
		super(name, location, price, discount, isFreeOfCharge);
		this.duration = duration;
		this.isPremium = isPremium;
		this.is3d = is3d;
	}

	//Methode to calculate Price depending on duration
	public void PriceCalculation(CinemaTicket cinemaTicket) {
		double newPrice;
		
		double price = cinemaTicket.getPrice();
		//double duration = cinemaTicket.duration;
		//boolean isPremium = cinem
		boolean isFreeOfCharge = cinemaTicket.isFreeOfCharge();		
		
		
		if(price > 0 && duration > 0) {
			//Adding surchange for overlength
			if(duration > 160)
				newPrice = price + 3.5;
			else if(duration > 140)
				newPrice = price + 2.5;
			else if(duration > 120)
				newPrice = price + 1.5;
			else
				newPrice = price;
			
			//Adding surchange for premium
			if(isPremium)
				newPrice =+ 2.5;
			//Adding surchange for 3D
			if(is3d)
				newPrice =+ 3;
			//Check for free of charge
			if(isFreeOfCharge)
				newPrice = 0;
			
			if(newPrice >= 0)
				super.setPrice(newPrice);
			else
				System.out.println("Fehler: Preiskalkulation - CinemaTicket");
		}
		else
			System.out.println("Fehler: Preis oder Länge falsch - CinemaTicket");
		
		
	}
	
	//to-String
		@Override
	public String toString() {
		return "CinemaTicket [duration=" + duration + ", isPremium=" + isPremium + ", is3d=" + is3d + ", toString()="
				+ super.toString() + "]";
	}
	
}
