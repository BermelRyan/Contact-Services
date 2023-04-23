// Author Name: Ryan Bermel
// date: 3/15/2023
// Course: CS-320
// Contact Class

public class Contact {
	String contactID;
	String firstName;
	String lastName;
	String phoneNumber;
	String address;
	
	public Contact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		super();
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	public String getContactID() {
		return contactID;
	}
	
	public void setContactID(String contactID) {
		this.contactID = contactID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
public String getPhoneNumber() {
	return phoneNumber;
}

public String getAddress() {
	return address;
}

public String getLastName() {
	return lastName;
}
public void setAddress (String address) {
	this.address = address;
}
}