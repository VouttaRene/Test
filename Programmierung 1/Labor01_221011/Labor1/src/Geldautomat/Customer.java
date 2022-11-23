package Geldautomat;

public class Customer {
	
	//Attributes of Customer
	private String name;
	private String address;
	private String mail;
	private String birthDate;
	private int age;
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
        int age = -1;	//Initialize age with -1. Makes it easier to spot error in calculation
		if(birthYear < todayYear) {		//birthYear needs to be less than actual Year, 
        	age = todayYear-birthYear;
        	if(birthMonth>todayMonth) {
        		age--;	//If birth month is greater than the actual month reduce the age by one
        	}else if(birthMonth == todayMonth && birthDay > todayDay) {
        		age--;	//If the months are the same check for the day if it is greater than the actual day reduce the age by one
        	}
        }
		//return the age
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
