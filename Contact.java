package contact;

public class Contact {
	private String contactId, firstName, lastName, phone, address;
	public Object setPhoneNumber;
	public Contact(String contactId, String firstName, String lastName, String phone, String address) {
		createContactId(contactId);
		updateFirstName(firstName);
		updateLastName(lastName);
		updatePhoneNumber(phone);
		updateAddress(address);
	}
	
	public String getContactId() {
		return contactId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhoneNumber () {
		return phone;
	}
	public String getAddress () {
		return address;
	}
	
protected void createContactId(String contactId) {
	if (contactId == null) {
		throw new IllegalArgumentException("Invalid, contactId is null");
	}else if(contactId.length() > 10) {
		throw new IllegalArgumentException("Invalid, contactId is greater than required 10 digit");
	}else {
		this.contactId = contactId;
	}
}

public void updateFirstName(String firstName) {
	if (firstName == null) {
		throw new IllegalArgumentException("Invalid, firstName is null");
	}else if(firstName.length() > 10) {
		throw new IllegalArgumentException("Invalid, firstName is greater than required 10 characters");
	}else {
		this.firstName = firstName;
	}
}

public void updateLastName(String lastName) {
	if (lastName == null) {
		throw new IllegalArgumentException("Invalid, lastName is null");
	}else if(lastName.length() > 10) {
		throw new IllegalArgumentException("Invalid, lasttName is greater than required 10 characters");
	}else {
		this.lastName = lastName;
	}
		
}

public void updatePhoneNumber(String phone) {
	if (phone == null) {
		throw new IllegalArgumentException ("Invalid, phone is null");
	}else if (phone.length() > 10) {
		throw new IllegalArgumentException ("Invalid, phone must be 10 digits");
	}else {
		this.phone = phone;
	}
}

public void updateAddress(String address) {
	if (address == null) {
		throw new IllegalArgumentException ("Invalid, adress cant be empty");
	}else if (address.length() > 30) {
		throw new IllegalArgumentException ("Invalid, address cannot be longer than 30 characters");
	}else {
		this.address = address;
	}
	}

public void put(String contactId2, Contact contact) {
	// TODO Auto-generated method stub
	
}


	
}