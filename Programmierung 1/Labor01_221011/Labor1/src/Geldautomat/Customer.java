package Geldautomat;

import java.util.Scanner;

public class Customer {
	
	//Attributes of Customer
	private String name;
	private String address;
	private String mail;
	private String birthDate;
	private String pinCodeDebitCard;
	private String pinCodeCreditCard;
	
//Create Pin codes and initialize them
	//Create Pincode
	private String pinCode() {
		String pin = "";
		int random;
		for(int i = 0; i < 4; i++) {
			random = (int)(Math.random() * 10);
			pin += random;
		}
		return pin;
	}
	//Create pinCodes for both Cards - triggered in AutomaticTellerMachine
	public void InitializePinCodes() {		
		setPinCodeDebitCard(pinCode());
		setPinCodeCreditCard(pinCode());
	}
	
	//This method prints out all of the customer attributes
	public void printOutAttributes() {
		System.out.println(	"Your account detail:"
							+ "\nName:\t\t" + name
							+ "\nAdresse:\t" + address							
							+ "\nEmail:\t\t" + mail
							+ "\nGeburtstag:\t" + birthDate
							+ "\nPin Giro:\t" + pinCodeDebitCard
							+ "\nPin Kedit:\t" + pinCodeCreditCard);
	}
	
//Check dates
	public boolean calculateAge(int birthDay, int birthMonth, int birthYear, String dateToday) {
		//Get the day, month and year as integers using replace and useDelimiter
		String today = dateToday.replace(".", "-");
		Scanner scannerToday = new Scanner(today).useDelimiter("-");
		int day = scannerToday.nextInt();
		int month = scannerToday.nextInt();
		int year = scannerToday.nextInt();
		scannerToday.close();
		
        //Check if today and birthday are actual dates
		boolean correctBirthDayDate = CheckDateFormat(birthDay, birthMonth, birthYear);
		boolean correctTodayDate = CheckDateFormat(day, month, year);
		if(correctBirthDayDate && correctTodayDate) {
			//Check if birthday is before today
			boolean correctBirthDay = CheckDate(birthDay, birthMonth, birthYear, day, month, year);
			if(correctBirthDay) {
				//Check if customer is older than 18
		        if(year - birthYear > 18) {
		        	return true;
		        }else if(year - birthYear == 18 && month > birthMonth) {
		        	return true;
		        }else if(year - birthYear == 18 && month == birthMonth && day >= birthDay) {
		        	return true;
		        }else {
		        	return false;
		        }
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	private boolean CheckDateFormat(int day, int month, int year) {
		boolean correctDateFormat = false;
		
		//Check if year is correct format
		if(1900 < year && year <= 2022) {
			if( month > 0 && month < 13) {
				switch(month) {
				case 2:
					if(day > 0 && day <= 28)
						correctDateFormat = true;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					if(day > 0 && day <= 30)
						correctDateFormat = true;
					break;
				default:
					if(day > 0 && day <= 31)
						correctDateFormat = true;
					break;
				}
			}
		}
		
		if(year%4 == 0 && month == 2 && day == 29)
			correctDateFormat = true;
		
		return correctDateFormat;
	}
	
	private boolean CheckDate(int birthYear, int birthMonth, int birthDay, int todayYear, int todayMonth, int todayDay) {
		boolean correctDate = false;
		
		//Check if DateFormat is correct
		
		//Check if birthday is before today
		if(birthYear < todayYear)
			correctDate = true;
		if(birthYear == todayYear && birthMonth < todayMonth)
			correctDate = true;
		if(birthYear == todayYear && birthMonth == todayMonth && birthDay < todayDay)
			correctDate = true;
		
		return correctDate;
	}
	
//Getter and Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getPinCodeDebitCard() {
		return pinCodeDebitCard;
	}
	public void setPinCodeDebitCard(String pinCodeDebitCard) {
		this.pinCodeDebitCard = pinCodeDebitCard;
	}
	public String getPinCodeCreditCard() {
		return pinCodeCreditCard;
	}
	public void setPinCodeCreditCard(String pinCodeCreditCard) {
		this.pinCodeCreditCard = pinCodeCreditCard;
	}
	

}
