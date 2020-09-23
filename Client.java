import java.util.ArrayList;

public class Client {
	
	private String firstname;
	private String lastname;
	private String[] fullName = new String[2];
	private int age;
	private String phoneNumber;
	private ArrayList<Account> accounts;
	private String SSN;
	private String address;
	
	public Client(String firstName, String lastName, int age, String phoneNumber, String SSN, String address) {
		this.firstname = firstName;
		this.lastname = lastName;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.SSN = SSN;
		this.address = address;
		fullName[0] = firstName;
		fullName[1] = lastName;
	}
	
	public String getFirstname(){
		return firstname;
	}
	
	public void setFirstname(String fname) {
		this.firstname = fname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lname) {
		this.lastname = lname;
	}
	
	public void setAge(short age) {
		this.age = age;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String number) {
		this.phoneNumber = number;
	}
	
	public Account getClientAccount(Account a){
		return accounts.get(accounts.indexOf(a));
	}
	
	public boolean addAccount(Account a) {
		return accounts.add(a);
	}
	
	public boolean removeAccount(Account a) {
		return accounts.remove(a);
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Firstname: " + firstname + "\n" +
				"Lastname: " + lastname +  "\n" +
				"Age: " + age + "\n" +
				"Phonenumber: " + phoneNumber + "\n" +
				"SSN: " + SSN + "\n" +
				"Address: " + address + "\n";
	}
}
