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
		System.out.println(	"Your account detail:\n"
							+ "Name:\t" + name
							+ "Adresse:\t" + address							
							+ "Email:\t" + mail
							+ "Geburtstag:\t" + birthDate
							+ "Pin Giro:\t" + pinCodeDebitCard
							+ "Pin Kedit:\t" + pinCodeCreditCard);
	}
	
//Check dates
	public bool CheckAge() {
		//Check if birth date is correct
		char[] birthDateCharArr = new char[birthDate.length()];
		
        for (int i = 0; i < birthDate.length(); i++) {
            birthDateCharArr[i] = birthDate.charAt(i);
        }
        
        int dayInt = Integer.parseInt(String.valueOf(birthDateCharArr[0]) + String.valueOf(birthDateCharArr[1]));
        int monthInt = Integer.parseInt(String.valueOf(birthDateCharArr[3]) + String.valueOf(birthDateCharArr[4]));
        int yearInt = Integer.parseInt(String.valueOf(birthDateCharArr[6]) + String.valueOf(birthDateCharArr[7]) + String.valueOf(birthDateCharArr[8]) + String.valueOf(birthDateCharArr[9]));
        
        if(yearInt )
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
