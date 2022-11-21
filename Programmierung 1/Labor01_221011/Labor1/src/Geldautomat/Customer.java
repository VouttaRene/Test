package Geldautomat;

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
	public Boolean CalculateAge(String dateToday) {
		//Check if birth date is correct
		char[] birthDateCharArr = new char[birthDate.length()];
        for (int i = 0; i < birthDate.length(); i++) {
            birthDateCharArr[i] = birthDate.charAt(i);
        }
        int birthDayInt = Integer.parseInt(String.valueOf(birthDateCharArr[0]) + String.valueOf(birthDateCharArr[1]));
        int birthMonthInt = Integer.parseInt(String.valueOf(birthDateCharArr[3]) + String.valueOf(birthDateCharArr[4]));
        int birthYearInt = Integer.parseInt(String.valueOf(birthDateCharArr[6]) + String.valueOf(birthDateCharArr[7]) + String.valueOf(birthDateCharArr[8]) + String.valueOf(birthDateCharArr[9]));
        
        //Today date
        char[] todayCharArr = new char[dateToday.length()];
        for (int i = 0; i < dateToday.length(); i++) {
            todayCharArr[i] = dateToday.charAt(i);
        }
        int todayDayInt = Integer.parseInt(String.valueOf(todayCharArr[0]) + String.valueOf(todayCharArr[1]));
        int todayMonthInt = Integer.parseInt(String.valueOf(todayCharArr[3]) + String.valueOf(todayCharArr[4]));
        int todayYearInt = Integer.parseInt(String.valueOf(todayCharArr[6]) + String.valueOf(todayCharArr[7]) + String.valueOf(todayCharArr[8]) + String.valueOf(todayCharArr[9]));
        
        if(todayYearInt - birthYearInt > 18) {
        	return true;
        }else if(todayYearInt - birthYearInt == 18 && todayMonthInt > birthMonthInt) {
        	return true;
        }else if(todayYearInt - birthYearInt == 18 && todayMonthInt == birthMonthInt && todayDayInt >= birthDayInt) {
        	return true;
        }else {
        	return false;
        }
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
