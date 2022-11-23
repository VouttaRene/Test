package Geldautomat;

public class Customer {
	
	//Attributes of Customer
	private String name;
	private String address;
	private String mail;
	private String birthDate;
	private String pinCodeDebitCard;
	private String pinCodeCreditCard;
	
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
	
//This method calculates the age of the customer
	public int calculateAge(int birthDay, int birthMonth, int birthYear, int todayDay, int todayMonth, int todayYear) {		
        int age = -1;
		if(birthYear < todayYear) {		
        	age = todayYear-birthYear;
        	if(birthMonth>todayMonth) {
        		age--;
        	}else if(birthMonth == todayMonth && birthDay > todayDay) {
        		age--;
        	}
        }
		return age;
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
